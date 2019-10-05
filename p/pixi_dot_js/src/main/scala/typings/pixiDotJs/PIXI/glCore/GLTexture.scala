package typings.pixiDotJs.PIXI.glCore

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.GLTexture")
@js.native
class GLTexture protected () extends js.Object {
  def this(gl: WebGLRenderingContext) = this()
  def this(gl: WebGLRenderingContext, width: Double) = this()
  def this(gl: WebGLRenderingContext, width: Double, height: Double) = this()
  def this(gl: WebGLRenderingContext, width: Double, height: Double, format: Double) = this()
  def this(gl: WebGLRenderingContext, width: Double, height: Double, format: Double, `type`: Double) = this()
  var format: Double = js.native
  var gl: WebGLRenderingContext = js.native
  var height: Double = js.native
  var mipmap: Boolean = js.native
  var premultiplyAlpha: Boolean = js.native
  var texture: WebGLTexture = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  def bind(): Unit = js.native
  def bind(location: Double): Unit = js.native
  def destroy(): Unit = js.native
  def enableLinearScaling(): Unit = js.native
  def enableMipmap(): Unit = js.native
  def enableNearestScaling(): Unit = js.native
  def enableWrapClamp(): Unit = js.native
  def enableWrapMirrorRepeat(): Unit = js.native
  def enableWrapRepeat(): Unit = js.native
  def magFilter(linear: Boolean): Unit = js.native
  def minFilter(linear: Boolean): Unit = js.native
  def unbind(): Unit = js.native
  def upload(source: HTMLCanvasElement): Unit = js.native
  def upload(source: HTMLImageElement): Unit = js.native
  def upload(source: HTMLVideoElement): Unit = js.native
  def upload(source: ImageData): Unit = js.native
  def uploadData(data: ArrayBufferView, width: Double, height: Double): Unit = js.native
  def uploadData(data: ArrayBuffer, width: Double, height: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.glCore.GLTexture")
@js.native
object GLTexture extends js.Object {
  def fromData(gl: WebGLRenderingContext, data: js.Array[Double], width: Double, height: Double): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLCanvasElement): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLCanvasElement, premultipleAlpha: Boolean): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLImageElement): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLImageElement, premultipleAlpha: Boolean): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLVideoElement): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: HTMLVideoElement, premultipleAlpha: Boolean): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: ImageData): GLTexture = js.native
  def fromSource(gl: WebGLRenderingContext, source: ImageData, premultipleAlpha: Boolean): GLTexture = js.native
}

