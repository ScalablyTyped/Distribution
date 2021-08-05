package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIosReopenAttributionRequest extends StObject {
  
  /** APP bundle ID. */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /**
    * FDL link to be verified from an app universal link open. The FDL link can be one of: 1) short FDL. e.g. .page.link/, or 2) long FDL. e.g. .page.link/?{query params}, or 3) Invite
    * FDL. e.g. .page.link/i/
    */
  var requestedLink: js.UndefOr[String] = js.undefined
  
  /** Google SDK version. Version takes the form "$major.$minor.$patch" */
  var sdkVersion: js.UndefOr[String] = js.undefined
}
object GetIosReopenAttributionRequest {
  
  inline def apply(): GetIosReopenAttributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIosReopenAttributionRequest]
  }
  
  extension [Self <: GetIosReopenAttributionRequest](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setRequestedLink(value: String): Self = StObject.set(x, "requestedLink", value.asInstanceOf[js.Any])
    
    inline def setRequestedLinkUndefined: Self = StObject.set(x, "requestedLink", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}
