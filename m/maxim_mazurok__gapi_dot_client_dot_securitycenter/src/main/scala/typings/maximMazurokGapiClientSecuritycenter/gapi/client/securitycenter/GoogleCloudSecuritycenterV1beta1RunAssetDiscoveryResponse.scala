package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse extends StObject {
  
  /** The duration between asset discovery run start and end */
  var duration: js.UndefOr[String] = js.undefined
  
  /** The state of an asset discovery run. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse {
  
  inline def apply(): GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudSecuritycenterV1beta1RunAssetDiscoveryResponse] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
