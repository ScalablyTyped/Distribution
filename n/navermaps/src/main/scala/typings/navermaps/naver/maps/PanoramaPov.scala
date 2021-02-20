package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaPov extends StObject {
  
  var fov: Double = js.native
  
  var pan: Double = js.native
  
  var tilt: Double = js.native
}
object PanoramaPov {
  
  @scala.inline
  def apply(fov: Double, pan: Double, tilt: Double): PanoramaPov = {
    val __obj = js.Dynamic.literal(fov = fov.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaPov]
  }
  
  @scala.inline
  implicit class PanoramaPovMutableBuilder[Self <: PanoramaPov] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
  }
}
