package typings.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRAIDLocationState extends StObject {
  
  var accuracy: js.UndefOr[Double] = js.undefined
  
  var ipservice: js.UndefOr[String] = js.undefined
  
  var lastfix: Double
  
  var lat: Double
  
  var lon: Double
  
  var `type`: MRAIDLocationType
}
object MRAIDLocationState {
  
  inline def apply(lastfix: Double, lat: Double, lon: Double, `type`: MRAIDLocationType): MRAIDLocationState = {
    val __obj = js.Dynamic.literal(lastfix = lastfix.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRAIDLocationState]
  }
  
  extension [Self <: MRAIDLocationState](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setIpservice(value: String): Self = StObject.set(x, "ipservice", value.asInstanceOf[js.Any])
    
    inline def setIpserviceUndefined: Self = StObject.set(x, "ipservice", js.undefined)
    
    inline def setLastfix(value: Double): Self = StObject.set(x, "lastfix", value.asInstanceOf[js.Any])
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    
    inline def setType(value: MRAIDLocationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
