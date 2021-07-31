package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p3beta1LocationInfo extends StObject {
  
  /** lat/long location coordinates. */
  var latLng: js.UndefOr[LatLng] = js.undefined
}
object GoogleCloudVisionV1p3beta1LocationInfo {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1LocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1LocationInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1LocationInfoMutableBuilder[Self <: GoogleCloudVisionV1p3beta1LocationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
  }
}
