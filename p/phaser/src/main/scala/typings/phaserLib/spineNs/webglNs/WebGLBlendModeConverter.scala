package typings
package phaserLib.spineNs.webglNs

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
  var DST_ALPHA: scala.Double = js.native
  var DST_COLOR: scala.Double = js.native
  var ONE: scala.Double = js.native
  var ONE_MINUS_DST_ALPHA: scala.Double = js.native
  var ONE_MINUS_SRC_ALPHA: scala.Double = js.native
  var ONE_MINUS_SRC_COLOR: scala.Double = js.native
  var SRC_ALPHA: scala.Double = js.native
  var SRC_COLOR: scala.Double = js.native
  var ZERO: scala.Double = js.native
  def getDestGLBlendMode(blendMode: phaserLib.spineNs.BlendMode): scala.Double = js.native
  def getSourceGLBlendMode(blendMode: phaserLib.spineNs.BlendMode): scala.Double = js.native
  def getSourceGLBlendMode(blendMode: phaserLib.spineNs.BlendMode, premultipliedAlpha: scala.Boolean): scala.Double = js.native
}

