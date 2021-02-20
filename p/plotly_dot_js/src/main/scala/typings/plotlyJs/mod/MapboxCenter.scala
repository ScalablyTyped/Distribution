package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxCenter extends StObject {
  
  var lat: Double = js.native
  
  var lon: Double = js.native
}
object MapboxCenter {
  
  @scala.inline
  def apply(lat: Double, lon: Double): MapboxCenter = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxCenter]
  }
  
  @scala.inline
  implicit class MapboxCenterMutableBuilder[Self <: MapboxCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
