package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.BlendModeManager")
@js.native
class BlendModeManager protected () extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()
  var currentBlendMode: Double = js.native
  def setBlendMode(blendMode: Double): Boolean = js.native
}

