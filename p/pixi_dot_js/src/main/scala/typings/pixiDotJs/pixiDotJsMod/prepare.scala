package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////PREPARE///////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "prepare")
@js.native
object prepare extends js.Object {
  @js.native
  abstract class BasePrepare[UploadHookSource] protected ()
    extends typings.pixiDotJs.PIXI.prepare.BasePrepare[UploadHookSource] {
    def this(renderer: typings.pixiDotJs.PIXI.SystemRenderer) = this()
  }
  
  @js.native
  class CanvasPrepare protected ()
    extends typings.pixiDotJs.PIXI.prepare.CanvasPrepare {
    def this(renderer: typings.pixiDotJs.PIXI.CanvasRenderer) = this()
  }
  
  @js.native
  class CountLimiter protected ()
    extends typings.pixiDotJs.PIXI.prepare.CountLimiter {
    def this(maxItemsPerFrame: Double) = this()
  }
  
  @js.native
  class TimeLimiter protected ()
    extends typings.pixiDotJs.PIXI.prepare.TimeLimiter {
    def this(maxMilliseconds: Double) = this()
  }
  
  @js.native
  class WebGLPrepare protected ()
    extends typings.pixiDotJs.PIXI.prepare.WebGLPrepare {
    def this(renderer: typings.pixiDotJs.PIXI.WebGLRenderer) = this()
  }
  
}

