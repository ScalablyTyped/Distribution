package typings.phaser.spine.webgl

import typings.phaser.spine.BlendMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.WebGLBlendModeConverter")
@js.native
class WebGLBlendModeConverter () extends js.Object

/* static members */
@JSGlobal("spine.webgl.WebGLBlendModeConverter")
@js.native
object WebGLBlendModeConverter extends js.Object {
  var DST_ALPHA: Double = js.native
  var DST_COLOR: Double = js.native
  var ONE: Double = js.native
  var ONE_MINUS_DST_ALPHA: Double = js.native
  var ONE_MINUS_SRC_ALPHA: Double = js.native
  var ONE_MINUS_SRC_COLOR: Double = js.native
  var SRC_ALPHA: Double = js.native
  var SRC_COLOR: Double = js.native
  var ZERO: Double = js.native
  def getDestGLBlendMode(blendMode: BlendMode): Double = js.native
  def getSourceGLBlendMode(blendMode: BlendMode): Double = js.native
  def getSourceGLBlendMode(blendMode: BlendMode, premultipliedAlpha: Boolean): Double = js.native
}

