package typings.meteor.anon

import typings.meteor.emailMod.MailComposer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachments extends StObject {
  
  var attachments: js.UndefOr[js.Array[js.Object]] = js.native
  
  var bcc: js.UndefOr[String | js.Array[String]] = js.native
  
  var cc: js.UndefOr[String | js.Array[String]] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var html: js.UndefOr[String] = js.native
  
  var mailComposer: js.UndefOr[MailComposer] = js.native
  
  var replyTo: js.UndefOr[String | js.Array[String]] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[String | js.Array[String]] = js.native
}
object Attachments {
  
  @scala.inline
  def apply(): Attachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachments]
  }
  
  @scala.inline
  implicit class AttachmentsMutableBuilder[Self <: Attachments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: js.Array[js.Object]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: js.Object*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setBcc(value: String | js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    @scala.inline
    def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value :_*))
    
    @scala.inline
    def setCc(value: String | js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    @scala.inline
    def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value :_*))
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setMailComposer(value: MailComposer): Self = StObject.set(x, "mailComposer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailComposerUndefined: Self = StObject.set(x, "mailComposer", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String | js.Array[String]): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
    
    @scala.inline
    def setReplyToVarargs(value: String*): Self = StObject.set(x, "replyTo", js.Array(value :_*))
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTo(value: String | js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
  }
}
