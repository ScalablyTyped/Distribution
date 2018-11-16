package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.GLTexture")
@js.native
class GLTexture protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext) = this()
  def this(gl: stdLib.WebGLRenderingContext, width: scala.Double) = this()
  def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double) = this()
  def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, format: scala.Double) = this()
  def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, format: scala.Double, `type`: scala.Double) = this()
  var format: scala.Double = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var height: scala.Double = js.native
  var mipmap: scala.Boolean = js.native
  var premultiplyAlpha: scala.Boolean = js.native
  var texture: stdLib.WebGLTexture = js.native
  var `type`: scala.Double = js.native
  var width: scala.Double = js.native
  def bind(): scala.Unit = js.native
  def bind(location: scala.Double): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def enableLinearScaling(): scala.Unit = js.native
  def enableMipmap(): scala.Unit = js.native
  def enableNearestScaling(): scala.Unit = js.native
  def enableWrapClamp(): scala.Unit = js.native
  def enableWrapMirrorRepeat(): scala.Unit = js.native
  def enableWrapRepeat(): scala.Unit = js.native
  def magFilter(linear: scala.Boolean): scala.Unit = js.native
  def minFilter(linear: scala.Boolean): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
  def upload(source: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def upload(source: stdLib.HTMLImageElement): scala.Unit = js.native
  def upload(source: stdLib.HTMLVideoElement): scala.Unit = js.native
  def upload(source: stdLib.ImageData): scala.Unit = js.native
  def uploadData(data: stdLib.ArrayBufferView, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def uploadData(data: stdLib.ArrayBuffer, width: scala.Double, height: scala.Double): scala.Unit = js.native
}

@JSGlobal("PIXI.glCore.GLTexture")
@js.native
object GLTexture extends js.Object {
  def fromData(
    gl: stdLib.WebGLRenderingContext,
    data: js.Array[scala.Double],
    width: scala.Double,
    height: scala.Double
  ): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(
    gl: stdLib.WebGLRenderingContext,
    source: stdLib.HTMLCanvasElement,
    premultipleAlpha: scala.Boolean
  ): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLImageElement): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLImageElement, premultipleAlpha: scala.Boolean): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.HTMLVideoElement, premultipleAlpha: scala.Boolean): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.ImageData): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
  def fromSource(gl: stdLib.WebGLRenderingContext, source: stdLib.ImageData, premultipleAlpha: scala.Boolean): pixiDotJsLib.PIXINs.glCoreNs.GLTexture = js.native
}

