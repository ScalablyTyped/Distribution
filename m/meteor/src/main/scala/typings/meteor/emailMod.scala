package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.anon.PackageSettings
import typings.nodemailer.mod.SendMailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailMod {
  
  object Email {
    
    @JSImport("meteor/email", "Email")
    @js.native
    val ^ : js.Any = js.native
    
    inline def customTransport(fn: js.Function1[/* options */ CustomEmailOptions, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("customTransport")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def hookSend(fn: js.Function1[/* options */ EmailOptions, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hookSend")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def send(options: EmailOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def sendAsync(options: EmailOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    type CustomEmailOptions = EmailOptions & PackageSettings
    
    type EmailOptions = typings.meteor.anon.MailComposer | (ExtraMailOptions & SendMailOptions)
    
    /**
      * ExtraMailOptions is intentionally left empty here, but can be
      * overridden in your application if desired. This should not be necessary
      * if you're using the default mail transport, but if you're using a
      * custom transport or have configured hooks which accept additional
      * options, you may need to define this interface to match your custom
      * options.
      */
    trait ExtraMailOptions extends StObject
  }
  
  trait MailComposer extends StObject {
    
    def addHeader(name: String, value: String): Unit
    
    def pipe(stream: Any): Unit
    
    def setMessageOption(from: String, to: String, body: String, html: String): Unit
    
    def streamMessage(): Unit
  }
  object MailComposer {
    
    @JSImport("meteor/email", "MailComposer")
    @js.native
    val ^ : typings.meteor.emailMod.MailComposerStatic = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.meteor.emailMod.MailComposer] (val x: Self) extends AnyVal {
      
      inline def setAddHeader(value: (String, String) => Unit): Self = StObject.set(x, "addHeader", js.Any.fromFunction2(value))
      
      inline def setPipe(value: Any => Unit): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
      
      inline def setSetMessageOption(value: (String, String, String, String) => Unit): Self = StObject.set(x, "setMessageOption", js.Any.fromFunction4(value))
      
      inline def setStreamMessage(value: () => Unit): Self = StObject.set(x, "streamMessage", js.Any.fromFunction0(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("meteor/email", "MailComposer")
  @js.native
  open class MailComposerCls protected ()
    extends StObject
       with typings.meteor.emailMod.MailComposer {
    def this(options: typings.meteor.emailMod.MailComposerOptions) = this()
    
    /* CompleteClass */
    override def addHeader(name: String, value: String): Unit = js.native
    
    /* CompleteClass */
    override def pipe(stream: Any): Unit = js.native
    
    /* CompleteClass */
    override def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
    
    /* CompleteClass */
    override def streamMessage(): Unit = js.native
  }
  
  trait MailComposerOptions extends StObject {
    
    var charset: String
    
    var encoding: String
    
    var escapeSMTP: Boolean
    
    var forceEmbeddedImages: Boolean
    
    var keepBcc: Boolean
  }
  object MailComposerOptions {
    
    inline def apply(
      charset: String,
      encoding: String,
      escapeSMTP: Boolean,
      forceEmbeddedImages: Boolean,
      keepBcc: Boolean
    ): typings.meteor.emailMod.MailComposerOptions = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escapeSMTP = escapeSMTP.asInstanceOf[js.Any], forceEmbeddedImages = forceEmbeddedImages.asInstanceOf[js.Any], keepBcc = keepBcc.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteor.emailMod.MailComposerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.meteor.emailMod.MailComposerOptions] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEscapeSMTP(value: Boolean): Self = StObject.set(x, "escapeSMTP", value.asInstanceOf[js.Any])
      
      inline def setForceEmbeddedImages(value: Boolean): Self = StObject.set(x, "forceEmbeddedImages", value.asInstanceOf[js.Any])
      
      inline def setKeepBcc(value: Boolean): Self = StObject.set(x, "keepBcc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MailComposerStatic
    extends StObject
       with Instantiable1[
          /* options */ typings.meteor.emailMod.MailComposerOptions, 
          typings.meteor.emailMod.MailComposer
        ]
}
