package typings.playcanvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlaycanvasExtrasDotmjsMiniStatsGpuTimerMod {
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs/mini-stats/gpu-timer", "GpuTimer")
  @js.native
  open class GpuTimer protected () extends StObject {
    def this(app: Any) = this()
    
    def _allocateQuery(): Any = js.native
    
    def _checkDisjoint(): Unit = js.native
    
    var _ext: Any = js.native
    
    var _frameQueries: js.Array[Any] = js.native
    
    var _frames: js.Array[Any] = js.native
    
    var _freeQueries: js.Array[Any] = js.native
    
    var _gl: Any = js.native
    
    var _prevTimings: js.Array[Any] = js.native
    
    def _resolveFrameTimings(frame: Any, timings: Any): Boolean = js.native
    
    var _timings: js.Array[Any] = js.native
    
    def begin(name: Any): Unit = js.native
    
    var decimalPlaces: Double = js.native
    
    var enabled: Boolean = js.native
    
    def end(): Unit = js.native
    
    def loseContext(): Unit = js.native
    
    def mark(name: Any): Unit = js.native
    
    def timings: js.Array[Any] = js.native
    
    var unitsName: String = js.native
  }
}
