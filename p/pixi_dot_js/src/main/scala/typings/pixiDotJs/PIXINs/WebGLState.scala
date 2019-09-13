package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.glCoreNs.AttribState
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A WebGL state machines
  */
@JSGlobal("PIXI.WebGLState")
@js.native
class WebGLState protected () extends js.Object {
  def this(gl: WebGLRenderingContext) = this()
  var activeState: js.Array[Double] = js.native
  var attribState: AttribState = js.native
  var defaultState: js.Array[Double] = js.native
  var gl: WebGLRenderingContext = js.native
  var maxAttribs: Double = js.native
  var nativeVaoExtension: js.Any = js.native
  var stack: js.Array[Double] = js.native
  var stackIndex: Double = js.native
  def pop(): Unit = js.native
  def push(): Unit = js.native
  def resetAttributes(): Unit = js.native
  def resetToDefault(): Unit = js.native
  def setBlend(value: Double): Unit = js.native
  def setBlendMode(value: Double): Unit = js.native
  def setCullFace(value: Double): Unit = js.native
  def setDepthTest(value: Double): Unit = js.native
  def setFrontFace(value: Double): Unit = js.native
  def setState(state: js.Array[Double]): Unit = js.native
}

