package typings
package pixiDotJsLib.pixiDotJsMod

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
    extends pixiDotJsLib.PIXINs.accessibilityNs.AccessibilityManager {
    def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer) = this()
    def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  }
  
}

