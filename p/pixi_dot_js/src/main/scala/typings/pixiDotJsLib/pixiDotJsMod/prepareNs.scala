package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////PREPARE///////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "prepare")
@js.native
object prepareNs extends js.Object {
  @js.native
  abstract class BasePrepare[UploadHookSource] protected ()
    extends pixiDotJsLib.PIXINs.prepareNs.BasePrepare[UploadHookSource] {
    def this(renderer: pixiDotJsLib.PIXINs.SystemRenderer) = this()
  }
  
  @js.native
  class CanvasPrepare protected ()
    extends pixiDotJsLib.PIXINs.prepareNs.CanvasPrepare {
    def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer) = this()
  }
  
  @js.native
  class CountLimiter protected ()
    extends pixiDotJsLib.PIXINs.prepareNs.CountLimiter {
    def this(maxItemsPerFrame: scala.Double) = this()
  }
  
  @js.native
  class TimeLimiter protected ()
    extends pixiDotJsLib.PIXINs.prepareNs.TimeLimiter {
    def this(maxMilliseconds: scala.Double) = this()
  }
  
  @js.native
  class WebGLPrepare protected ()
    extends pixiDotJsLib.PIXINs.prepareNs.WebGLPrepare {
    def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  }
  
}

