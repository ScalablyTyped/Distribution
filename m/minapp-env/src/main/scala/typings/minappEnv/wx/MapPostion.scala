package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 要显示在可视区域内的坐标点列表 */
trait MapPostion extends StObject {
  
  /** 纬度 */
  var latitude: Double
  
  /** 经度 */
  var longitude: Double
}
object MapPostion {
  
  inline def apply(latitude: Double, longitude: Double): MapPostion = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPostion]
  }
  
  extension [Self <: MapPostion](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
