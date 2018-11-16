package typings
package pixiDotJsLib.pixiDotJsMod

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
    extends pixiDotJsLib.PIXINs.extractNs.CanvasExtract {
    def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer) = this()
  }
  
  @js.native
  class WebGLExtract protected ()
    extends pixiDotJsLib.PIXINs.extractNs.WebGLExtract {
    def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  }
  
}

