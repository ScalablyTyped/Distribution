package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
/////////////////////////////ACCESSIBILITY////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "accessibility")
@js.native
object accessibility extends js.Object {
  // accessibility
  @js.native
  class AccessibilityManager protected ()
    extends typings.pixiDotJs.PIXI.accessibility.AccessibilityManager {
    def this(renderer: typings.pixiDotJs.PIXI.CanvasRenderer) = this()
    def this(renderer: typings.pixiDotJs.PIXI.WebGLRenderer) = this()
  }
  
}

