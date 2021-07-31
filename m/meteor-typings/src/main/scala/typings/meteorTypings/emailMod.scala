package typings.meteorTypings

import org.scalablytyped.runtime.Instantiable1
import typings.meteorTypings.anon.Attachments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailMod {
  
  object Email {
    
    @JSImport("meteor/email", "Email")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def send(options: Attachments): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait MailComposer extends StObject {
    
    def addHeader(name: String, value: String): Unit
    
    def pipe(stream: js.Any): Unit
    
    def setMessageOption(from: String, to: String, body: String, html: String): Unit
    
    def streamMessage(): Unit
  }
  object MailComposer {
    
    @JSImport("meteor/email", "MailComposer")
    @js.native
    val ^ : typings.meteorTypings.emailMod.MailComposerStatic = js.native
    
    @scala.inline
    implicit class MailComposerMutableBuilder[Self <: typings.meteorTypings.emailMod.MailComposer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddHeader(value: (String, String) => Unit): Self = StObject.set(x, "addHeader", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPipe(value: js.Any => Unit): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMessageOption(value: (String, String, String, String) => Unit): Self = StObject.set(x, "setMessageOption", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStreamMessage(value: () => Unit): Self = StObject.set(x, "streamMessage", js.Any.fromFunction0(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("meteor/email", "MailComposer")
  @js.native
  class MailComposerCls protected ()
    extends StObject
       with typings.meteorTypings.emailMod.MailComposer {
    def this(options: typings.meteorTypings.emailMod.MailComposerOptions) = this()
    
    /* CompleteClass */
    override def addHeader(name: String, value: String): Unit = js.native
    
    /* CompleteClass */
    override def pipe(stream: js.Any): Unit = js.native
    
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
    
    @scala.inline
    def apply(
      charset: String,
      encoding: String,
      escapeSMTP: Boolean,
      forceEmbeddedImages: Boolean,
      keepBcc: Boolean
    ): typings.meteorTypings.emailMod.MailComposerOptions = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escapeSMTP = escapeSMTP.asInstanceOf[js.Any], forceEmbeddedImages = forceEmbeddedImages.asInstanceOf[js.Any], keepBcc = keepBcc.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteorTypings.emailMod.MailComposerOptions]
    }
    
    @scala.inline
    implicit class MailComposerOptionsMutableBuilder[Self <: typings.meteorTypings.emailMod.MailComposerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeSMTP(value: Boolean): Self = StObject.set(x, "escapeSMTP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceEmbeddedImages(value: Boolean): Self = StObject.set(x, "forceEmbeddedImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepBcc(value: Boolean): Self = StObject.set(x, "keepBcc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MailComposerStatic
    extends StObject
       with Instantiable1[
          /* options */ typings.meteorTypings.emailMod.MailComposerOptions, 
          typings.meteorTypings.emailMod.MailComposer
        ]
}
