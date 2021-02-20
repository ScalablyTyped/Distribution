package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 要显示在可视区域内的坐标点列表 */
@js.native
trait MapPostion extends StObject {
  
  /** 纬度 */
  var latitude: Double = js.native
  
  /** 经度 */
  var longitude: Double = js.native
}
object MapPostion {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): MapPostion = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPostion]
  }
  
  @scala.inline
  implicit class MapPostionMutableBuilder[Self <: MapPostion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
