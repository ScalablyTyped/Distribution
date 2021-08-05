package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateManagedShortLinkResponse extends StObject {
  
  /** Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz */
  var managedShortLink: js.UndefOr[ManagedShortLink] = js.undefined
  
  /** Preview link to show the link flow chart. (debug info.) */
  var previewLink: js.UndefOr[String] = js.undefined
  
  /** Information about potential warnings on link creation. */
  var warning: js.UndefOr[js.Array[DynamicLinkWarning]] = js.undefined
}
object CreateManagedShortLinkResponse {
  
  inline def apply(): CreateManagedShortLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateManagedShortLinkResponse]
  }
  
  extension [Self <: CreateManagedShortLinkResponse](x: Self) {
    
    inline def setManagedShortLink(value: ManagedShortLink): Self = StObject.set(x, "managedShortLink", value.asInstanceOf[js.Any])
    
    inline def setManagedShortLinkUndefined: Self = StObject.set(x, "managedShortLink", js.undefined)
    
    inline def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
    
    inline def setPreviewLinkUndefined: Self = StObject.set(x, "previewLink", js.undefined)
    
    inline def setWarning(value: js.Array[DynamicLinkWarning]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    inline def setWarningVarargs(value: DynamicLinkWarning*): Self = StObject.set(x, "warning", js.Array(value :_*))
  }
}
