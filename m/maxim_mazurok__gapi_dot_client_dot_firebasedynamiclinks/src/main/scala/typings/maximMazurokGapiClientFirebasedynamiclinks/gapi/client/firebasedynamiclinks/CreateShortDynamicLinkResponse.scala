package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateShortDynamicLinkResponse extends StObject {
  
  /** Preview link to show the link flow chart. (debug info.) */
  var previewLink: js.UndefOr[String] = js.undefined
  
  /** Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz */
  var shortLink: js.UndefOr[String] = js.undefined
  
  /** Information about potential warnings on link creation. */
  var warning: js.UndefOr[js.Array[DynamicLinkWarning]] = js.undefined
}
object CreateShortDynamicLinkResponse {
  
  inline def apply(): CreateShortDynamicLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShortDynamicLinkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateShortDynamicLinkResponse] (val x: Self) extends AnyVal {
    
    inline def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
    
    inline def setPreviewLinkUndefined: Self = StObject.set(x, "previewLink", js.undefined)
    
    inline def setShortLink(value: String): Self = StObject.set(x, "shortLink", value.asInstanceOf[js.Any])
    
    inline def setShortLinkUndefined: Self = StObject.set(x, "shortLink", js.undefined)
    
    inline def setWarning(value: js.Array[DynamicLinkWarning]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    inline def setWarningVarargs(value: DynamicLinkWarning*): Self = StObject.set(x, "warning", js.Array(value*))
  }
}
