package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationInfo extends StObject {
  
  /** lat/long location coordinates. */
  var latLng: js.UndefOr[LatLng] = js.native
}
object LocationInfo {
  
  @scala.inline
  def apply(): LocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationInfo]
  }
  
  @scala.inline
  implicit class LocationInfoMutableBuilder[Self <: LocationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
  }
}
