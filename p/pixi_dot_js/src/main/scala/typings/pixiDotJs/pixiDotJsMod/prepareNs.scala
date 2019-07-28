package typings.pixiDotJs.pixiDotJsMod

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
    extends typings.pixiDotJs.PIXINs.prepareNs.BasePrepare[UploadHookSource] {
    def this(renderer: typings.pixiDotJs.PIXINs.SystemRenderer) = this()
  }
  
  @js.native
  class CanvasPrepare protected ()
    extends typings.pixiDotJs.PIXINs.prepareNs.CanvasPrepare {
    def this(renderer: typings.pixiDotJs.PIXINs.CanvasRenderer) = this()
  }
  
  @js.native
  class CountLimiter protected ()
    extends typings.pixiDotJs.PIXINs.prepareNs.CountLimiter {
    def this(maxItemsPerFrame: Double) = this()
  }
  
  @js.native
  class TimeLimiter protected ()
    extends typings.pixiDotJs.PIXINs.prepareNs.TimeLimiter {
    def this(maxMilliseconds: Double) = this()
  }
  
  @js.native
  class WebGLPrepare protected ()
    extends typings.pixiDotJs.PIXINs.prepareNs.WebGLPrepare {
    def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer) = this()
  }
  
}

