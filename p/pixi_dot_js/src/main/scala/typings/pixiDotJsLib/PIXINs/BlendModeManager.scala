package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.BlendModeManager")
@js.native
class BlendModeManager protected () extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()
  var currentBlendMode: scala.Double = js.native
  def setBlendMode(blendMode: scala.Double): scala.Boolean = js.native
}

