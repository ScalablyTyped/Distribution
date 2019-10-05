package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////EXTRACT///////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "extract")
@js.native
object extract extends js.Object {
  @js.native
  class CanvasExtract protected ()
    extends typings.pixiDotJs.PIXI.extract.CanvasExtract {
    def this(renderer: typings.pixiDotJs.PIXI.CanvasRenderer) = this()
  }
  
  @js.native
  class WebGLExtract protected ()
    extends typings.pixiDotJs.PIXI.extract.WebGLExtract {
    def this(renderer: typings.pixiDotJs.PIXI.WebGLRenderer) = this()
  }
  
}

