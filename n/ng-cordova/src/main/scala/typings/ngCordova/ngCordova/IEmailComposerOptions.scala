package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEmailComposerOptions extends StObject {
  
  var attachments: js.UndefOr[js.Array[_]] = js.native
  
  var bcc: js.UndefOr[String | js.Array[String]] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  var cc: js.UndefOr[String | js.Array[String]] = js.native
  
  var isHtml: js.UndefOr[Boolean] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var to: String | js.Array[String] = js.native
}
object IEmailComposerOptions {
  
  @scala.inline
  def apply(to: String | js.Array[String]): IEmailComposerOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEmailComposerOptions]
  }
  
  @scala.inline
  implicit class IEmailComposerOptionsMutableBuilder[Self <: IEmailComposerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: js.Array[_]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: js.Any*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setBcc(value: String | js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    @scala.inline
    def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCc(value: String | js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    @scala.inline
    def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value :_*))
    
    @scala.inline
    def setIsHtml(value: Boolean): Self = StObject.set(x, "isHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHtmlUndefined: Self = StObject.set(x, "isHtml", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTo(value: String | js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
  }
}
