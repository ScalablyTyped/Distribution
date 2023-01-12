package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.MapboxCenter> */
trait PartialMapboxCenter extends StObject {
  
  var lat: js.UndefOr[Double] = js.undefined
  
  var lon: js.UndefOr[Double] = js.undefined
}
object PartialMapboxCenter {
  
  inline def apply(): PartialMapboxCenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxCenter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMapboxCenter] (val x: Self) extends AnyVal {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    
    inline def setLonUndefined: Self = StObject.set(x, "lon", js.undefined)
  }
}
