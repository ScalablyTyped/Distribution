package typings.playcanvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlaycanvasExtrasDotmjsMiniStatsCpuTimerMod {
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs/mini-stats/cpu-timer", "CpuTimer")
  @js.native
  open class CpuTimer protected () extends StObject {
    def this(app: Any) = this()
    
    var _frameIndex: Double = js.native
    
    var _frameTimings: js.Array[Any] = js.native
    
    var _prevTimings: js.Array[Any] = js.native
    
    var _timings: js.Array[Any] = js.native
    
    def begin(name: Any): Unit = js.native
    
    var decimalPlaces: Double = js.native
    
    var enabled: Boolean = js.native
    
    def mark(name: Any): Unit = js.native
    
    def timings: js.Array[Any] = js.native
    
    var unitsName: String = js.native
  }
}
