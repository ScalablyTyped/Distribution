package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LatLongRect extends StObject {
  
  /** Max lat/long pair. */
  var maxLatLng: js.UndefOr[LatLng] = js.native
  
  /** Min lat/long pair. */
  var minLatLng: js.UndefOr[LatLng] = js.native
}
object LatLongRect {
  
  @scala.inline
  def apply(): LatLongRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatLongRect]
  }
  
  @scala.inline
  implicit class LatLongRectMutableBuilder[Self <: LatLongRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLatLng(value: LatLng): Self = StObject.set(x, "maxLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLatLngUndefined: Self = StObject.set(x, "maxLatLng", js.undefined)
    
    @scala.inline
    def setMinLatLng(value: LatLng): Self = StObject.set(x, "minLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLatLngUndefined: Self = StObject.set(x, "minLatLng", js.undefined)
  }
}
