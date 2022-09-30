package typings.meteor

import org.scalablytyped.runtime.Instantiable1
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
    
    trait CustomEmailOptions
      extends StObject
         with EmailOptions {
      
      var packageSettings: js.UndefOr[Any] = js.undefined
    }
    object CustomEmailOptions {
      
      inline def apply(): CustomEmailOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CustomEmailOptions]
      }
      
      extension [Self <: CustomEmailOptions](x: Self) {
        
        inline def setPackageSettings(value: Any): Self = StObject.set(x, "packageSettings", value.asInstanceOf[js.Any])
        
        inline def setPackageSettingsUndefined: Self = StObject.set(x, "packageSettings", js.undefined)
      }
    }
    
    trait EmailOptions extends StObject {
      
      var attachments: js.UndefOr[js.Array[js.Object]] = js.undefined
      
      var bcc: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var cc: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var from: js.UndefOr[String] = js.undefined
      
      var headers: js.UndefOr[js.Object] = js.undefined
      
      var html: js.UndefOr[String] = js.undefined
      
      var mailComposer: js.UndefOr[typings.meteor.emailMod.MailComposer] = js.undefined
      
      var replyTo: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var subject: js.UndefOr[String] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
      
      var to: js.UndefOr[String | js.Array[String]] = js.undefined
    }
    object EmailOptions {
      
      inline def apply(): EmailOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmailOptions]
      }
      
      extension [Self <: EmailOptions](x: Self) {
        
        inline def setAttachments(value: js.Array[js.Object]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
        
        inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
        
        inline def setAttachmentsVarargs(value: js.Object*): Self = StObject.set(x, "attachments", js.Array(value*))
        
        inline def setBcc(value: String | js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
        
        inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
        
        inline def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value*))
        
        inline def setCc(value: String | js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
        
        inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
        
        inline def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value*))
        
        inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        inline def setMailComposer(value: typings.meteor.emailMod.MailComposer): Self = StObject.set(x, "mailComposer", value.asInstanceOf[js.Any])
        
        inline def setMailComposerUndefined: Self = StObject.set(x, "mailComposer", js.undefined)
        
        inline def setReplyTo(value: String | js.Array[String]): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
        
        inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
        
        inline def setReplyToVarargs(value: String*): Self = StObject.set(x, "replyTo", js.Array(value*))
        
        inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
        
        inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setTo(value: String | js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
        
        inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
        
        inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
      }
    }
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
    
    extension [Self <: typings.meteor.emailMod.MailComposer](x: Self) {
      
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
    
    extension [Self <: typings.meteor.emailMod.MailComposerOptions](x: Self) {
      
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
