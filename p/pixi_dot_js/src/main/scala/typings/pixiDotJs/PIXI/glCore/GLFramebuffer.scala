package typings.pixiDotJs.PIXI.glCore

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderbuffer
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.GLFramebuffer")
@js.native
class GLFramebuffer protected () extends js.Object {
  def this(gl: WebGLRenderingContext, width: Double, height: Double) = this()
  var frameBuffer: WebGLFramebuffer = js.native
  var gl: WebGLRenderingContext = js.native
  var height: Double = js.native
  var stencil: WebGLRenderbuffer = js.native
  var texture: GLTexture = js.native
  var width: Double = js.native
  def bind(): Unit = js.native
  def clear(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  def destroy(): Unit = js.native
  def enableStencil(): Unit = js.native
  def enableTexture(texture: GLTexture): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def unbind(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.glCore.GLFramebuffer")
@js.native
object GLFramebuffer extends js.Object {
  def createFloat32(gl: WebGLRenderingContext, width: Double, height: Double, data: js.Any): GLFramebuffer = js.native
  def createFloat32(gl: WebGLRenderingContext, width: Double, height: Double, data: ArrayBuffer): GLFramebuffer = js.native
  def createFloat32(gl: WebGLRenderingContext, width: Double, height: Double, data: ArrayBufferView): GLFramebuffer = js.native
  def createRGBA(gl: WebGLRenderingContext, width: Double, height: Double, data: js.Any): GLFramebuffer = js.native
  def createRGBA(gl: WebGLRenderingContext, width: Double, height: Double, data: ArrayBuffer): GLFramebuffer = js.native
  def createRGBA(gl: WebGLRenderingContext, width: Double, height: Double, data: ArrayBufferView): GLFramebuffer = js.native
}

