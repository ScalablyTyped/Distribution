package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Email {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomEmailOptions] (val x: Self) extends AnyVal {
      
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
    
    var mailComposer: js.UndefOr[MailComposer] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setMailComposer(value: MailComposer): Self = StObject.set(x, "mailComposer", value.asInstanceOf[js.Any])
      
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
