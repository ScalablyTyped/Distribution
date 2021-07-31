package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSecuritycenterV1RunAssetDiscoveryResponse extends StObject {
  
  /** The duration between asset discovery run start and end */
  var duration: js.UndefOr[String] = js.undefined
  
  /** The state of an asset discovery run. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudSecuritycenterV1RunAssetDiscoveryResponse {
  
  @scala.inline
  def apply(): GoogleCloudSecuritycenterV1RunAssetDiscoveryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1RunAssetDiscoveryResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudSecuritycenterV1RunAssetDiscoveryResponseMutableBuilder[Self <: GoogleCloudSecuritycenterV1RunAssetDiscoveryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
