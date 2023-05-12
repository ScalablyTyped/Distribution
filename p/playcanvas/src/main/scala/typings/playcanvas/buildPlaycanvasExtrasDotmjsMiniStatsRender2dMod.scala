package typings.playcanvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlaycanvasExtrasDotmjsMiniStatsRender2dMod {
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs/mini-stats/render2d", "Render2d")
  @js.native
  open class Render2d protected () extends StObject {
    def this(device: Any, colors: Any) = this()
    def this(device: Any, colors: Any, maxQuads: Double) = this()
    
    var blendState: Any = js.native
    
    var buffer: Any = js.native
    
    var clr: js.typedarray.Float32Array = js.native
    
    var clrId: Any = js.native
    
    var data: js.typedarray.Float32Array = js.native
    
    var device: Any = js.native
    
    var indexBuffer: Any = js.native
    
    var prim: Any = js.native
    
    var primIndex: Double = js.native
    
    var prims: js.Array[Any] = js.native
    
    def quad(texture: Any, x: Any, y: Any, w: Any, h: Any, u: Any, v: Any, uw: Any, uh: Any, enabled: Any): Unit = js.native
    
    var quads: Double = js.native
    
    def render(clr: Any, height: Any): Unit = js.native
    
    var screenTextureSize: js.typedarray.Float32Array = js.native
    
    var screenTextureSizeId: Any = js.native
    
    var shader: Any = js.native
    
    var watermarkSizeId: Any = js.native
  }
}
