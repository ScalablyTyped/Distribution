package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.VertexArrayObject")
@js.native
class VertexArrayObject protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext) = this()
  def this(gl: stdLib.WebGLRenderingContext, state: pixiDotJsLib.PIXINs.WebGLState) = this()
  var attributes: js.Array[Attrib] = js.native
  var dirty: scala.Boolean = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var indexBuffer: GLBuffer = js.native
  var nativeState: AttribState = js.native
  var nativeVao: VertexArrayObject = js.native
  var nativeVaoExtension: js.Any = js.native
  def activate(): this.type = js.native
  def addAttribute(buffer: GLBuffer, attribute: Attrib): this.type = js.native
  def addAttribute(buffer: GLBuffer, attribute: Attrib, `type`: scala.Double): this.type = js.native
  def addAttribute(buffer: GLBuffer, attribute: Attrib, `type`: scala.Double, normalized: scala.Boolean): this.type = js.native
  def addAttribute(
    buffer: GLBuffer,
    attribute: Attrib,
    `type`: scala.Double,
    normalized: scala.Boolean,
    stride: scala.Double
  ): this.type = js.native
  def addAttribute(
    buffer: GLBuffer,
    attribute: Attrib,
    `type`: scala.Double,
    normalized: scala.Boolean,
    stride: scala.Double,
    start: scala.Double
  ): this.type = js.native
  def addIndex(buffer: GLBuffer): this.type = js.native
  def addIndex(buffer: GLBuffer, options: js.Any): this.type = js.native
  def bind(): this.type = js.native
  def clear(): this.type = js.native
  def destroy(): scala.Unit = js.native
  def draw(`type`: scala.Double, size: scala.Double, start: scala.Double): this.type = js.native
  def unbind(): this.type = js.native
}

@JSGlobal("PIXI.glCore.VertexArrayObject")
@js.native
object VertexArrayObject extends js.Object {
  var FORCE_NATIVE: scala.Boolean = js.native
}

