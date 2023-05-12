package typings.playcanvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlaycanvasExtrasDotmjsMiniStatsGraphMod {
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs/mini-stats/graph", "Graph")
  @js.native
  open class Graph protected () extends StObject {
    def this(name: Any, app: Any, watermark: Any, textRefreshRate: Any, timer: Any) = this()
    
    var avgCount: Double = js.native
    
    var avgTimer: Double = js.native
    
    var avgTotal: Double = js.native
    
    var counter: Double = js.native
    
    var cursor: Double = js.native
    
    var device: Any = js.native
    
    var enabled: Boolean = js.native
    
    def loseContext(): Unit = js.native
    
    var name: Any = js.native
    
    def render(render2d: Any, x: Any, y: Any, w: Any, h: Any): Unit = js.native
    
    var sample: js.typedarray.Uint8ClampedArray = js.native
    
    var textRefreshRate: Any = js.native
    
    var texture: Any = js.native
    
    var timer: Any = js.native
    
    var timingText: String = js.native
    
    def update(ms: Any): Unit = js.native
    
    var watermark: Any = js.native
    
    var yOffset: Double = js.native
  }
}
