package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////EXTRACT///////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "extract")
@js.native
object extractNs extends js.Object {
  @js.native
  class CanvasExtract protected ()
    extends typings.pixiDotJs.PIXINs.extractNs.CanvasExtract {
    def this(renderer: typings.pixiDotJs.PIXINs.CanvasRenderer) = this()
  }
  
  @js.native
  class WebGLExtract protected ()
    extends typings.pixiDotJs.PIXINs.extractNs.WebGLExtract {
    def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer) = this()
  }
  
}

