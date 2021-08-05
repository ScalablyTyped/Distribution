package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEmailComposerOptions extends StObject {
  
  var attachments: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var bcc: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  var cc: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var isHtml: js.UndefOr[Boolean] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var to: String | js.Array[String]
}
object IEmailComposerOptions {
  
  inline def apply(to: String | js.Array[String]): IEmailComposerOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEmailComposerOptions]
  }
  
  extension [Self <: IEmailComposerOptions](x: Self) {
    
    inline def setAttachments(value: js.Array[js.Any]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: js.Any*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    inline def setBcc(value: String | js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    inline def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value :_*))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCc(value: String | js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    inline def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value :_*))
    
    inline def setIsHtml(value: Boolean): Self = StObject.set(x, "isHtml", value.asInstanceOf[js.Any])
    
    inline def setIsHtmlUndefined: Self = StObject.set(x, "isHtml", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTo(value: String | js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
  }
}
