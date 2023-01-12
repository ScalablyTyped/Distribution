package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlurlReason extends StObject {
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var html_url: js.UndefOr[String | Null] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
}
object HtmlurlReason {
  
  inline def apply(): HtmlurlReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlurlReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlurlReason] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlNull: Self = StObject.set(x, "html_url", null)
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
