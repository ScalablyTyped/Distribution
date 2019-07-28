package typings.pixiDotJs.PIXINs.glCoreNs

import typings.pixiDotJs.PIXINs.WebGLState
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.VertexArrayObject")
@js.native
class VertexArrayObject protected () extends js.Object {
  def this(gl: WebGLRenderingContext) = this()
  def this(gl: WebGLRenderingContext, state: WebGLState) = this()
  var attributes: js.Array[Attrib] = js.native
  var dirty: Boolean = js.native
  var gl: WebGLRenderingContext = js.native
  var indexBuffer: GLBuffer = js.native
  var nativeState: AttribState = js.native
  var nativeVao: VertexArrayObject = js.native
  var nativeVaoExtension: js.Any = js.native
  def activate(): this.type = js.native
  def addAttribute(buffer: GLBuffer, attribute: Attrib): this.type = js.native
  def addAttribute(buffer: GLBuffer, attribute: Attrib, `type`: Double): this.type = js.native
  def addAttribute(buffer: GLBuffer, attribute: Attrib, `type`: Double, normalized: Boolean): this.type = js.native
  def addAttribute(buffer: GLBuffer, attribute: Attrib, `type`: Double, normalized: Boolean, stride: Double): this.type = js.native
  def addAttribute(
    buffer: GLBuffer,
    attribute: Attrib,
    `type`: Double,
    normalized: Boolean,
    stride: Double,
    start: Double
  ): this.type = js.native
  def addIndex(buffer: GLBuffer): this.type = js.native
  def addIndex(buffer: GLBuffer, options: js.Any): this.type = js.native
  def bind(): this.type = js.native
  def clear(): this.type = js.native
  def destroy(): Unit = js.native
  def draw(`type`: Double, size: Double, start: Double): this.type = js.native
  def unbind(): this.type = js.native
}

/* static members */
@JSGlobal("PIXI.glCore.VertexArrayObject")
@js.native
object VertexArrayObject extends js.Object {
  var FORCE_NATIVE: Boolean = js.native
}

