package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
/////////////////////////////ACCESSIBILITY////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "accessibility")
@js.native
object accessibilityNs extends js.Object {
  // accessibility
  @js.native
  class AccessibilityManager protected ()
    extends typings.pixiDotJs.PIXINs.accessibilityNs.AccessibilityManager {
    def this(renderer: typings.pixiDotJs.PIXINs.CanvasRenderer) = this()
    def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer) = this()
  }
  
}

