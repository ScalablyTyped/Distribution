package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.WebGLState")
@js.native
class WebGLState protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext) = this()
  var activeState: js.Array[scala.Double] = js.native
  var attribState: pixiDotJsLib.PIXINs.glCoreNs.AttribState = js.native
  var defaultState: js.Array[scala.Double] = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var maxAttribs: scala.Double = js.native
  var nativeVaoExtension: js.Any = js.native
  var stack: js.Array[scala.Double] = js.native
  var stackIndex: scala.Double = js.native
  def pop(): scala.Unit = js.native
  def push(): scala.Unit = js.native
  def resetAttributes(): scala.Unit = js.native
  def resetToDefault(): scala.Unit = js.native
  def setBlend(value: scala.Double): scala.Unit = js.native
  def setBlendMode(value: scala.Double): scala.Unit = js.native
  def setCullFace(value: scala.Double): scala.Unit = js.native
  def setDepthTest(value: scala.Double): scala.Unit = js.native
  def setFrontFace(value: scala.Double): scala.Unit = js.native
  def setState(state: js.Array[scala.Double]): scala.Unit = js.native
}

