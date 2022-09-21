package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameTime extends StObject {
  
  var _frameTime: Double
  
  var _updatesPerFrame: Double
  
  var frameTime: Double
  
  var updatesPerFrame: Double
}
object FrameTime {
  
  inline def apply(_frameTime: Double, _updatesPerFrame: Double, frameTime: Double, updatesPerFrame: Double): FrameTime = {
    val __obj = js.Dynamic.literal(_frameTime = _frameTime.asInstanceOf[js.Any], _updatesPerFrame = _updatesPerFrame.asInstanceOf[js.Any], frameTime = frameTime.asInstanceOf[js.Any], updatesPerFrame = updatesPerFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameTime]
  }
  
  extension [Self <: FrameTime](x: Self) {
    
    inline def setFrameTime(value: Double): Self = StObject.set(x, "frameTime", value.asInstanceOf[js.Any])
    
    inline def setUpdatesPerFrame(value: Double): Self = StObject.set(x, "updatesPerFrame", value.asInstanceOf[js.Any])
    
    inline def set_frameTime(value: Double): Self = StObject.set(x, "_frameTime", value.asInstanceOf[js.Any])
    
    inline def set_updatesPerFrame(value: Double): Self = StObject.set(x, "_updatesPerFrame", value.asInstanceOf[js.Any])
  }
}
