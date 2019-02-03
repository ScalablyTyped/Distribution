package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.GLFramebuffer")
@js.native
class GLFramebuffer protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double) = this()
  var frameBuffer: stdLib.WebGLFramebuffer = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var height: scala.Double = js.native
  var stencil: stdLib.WebGLRenderbuffer = js.native
  var texture: GLTexture = js.native
  var width: scala.Double = js.native
  def bind(): scala.Unit = js.native
  def clear(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def enableStencil(): scala.Unit = js.native
  def enableTexture(texture: GLTexture): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.glCore.GLFramebuffer")
@js.native
object GLFramebuffer extends js.Object {
  def createFloat32(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, data: js.Any): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
  def createFloat32(
    gl: stdLib.WebGLRenderingContext,
    width: scala.Double,
    height: scala.Double,
    data: stdLib.ArrayBuffer
  ): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
  def createFloat32(
    gl: stdLib.WebGLRenderingContext,
    width: scala.Double,
    height: scala.Double,
    data: stdLib.ArrayBufferView
  ): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
  def createRGBA(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, data: js.Any): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
  def createRGBA(
    gl: stdLib.WebGLRenderingContext,
    width: scala.Double,
    height: scala.Double,
    data: stdLib.ArrayBuffer
  ): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
  def createRGBA(
    gl: stdLib.WebGLRenderingContext,
    width: scala.Double,
    height: scala.Double,
    data: stdLib.ArrayBufferView
  ): pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
}

