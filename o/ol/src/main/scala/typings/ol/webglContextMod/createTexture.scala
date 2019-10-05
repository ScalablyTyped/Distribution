package typings.ol.webglContextMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Context", "createTexture")
@js.native
object createTexture extends js.Object {
  def apply(gl: WebGLRenderingContext, image: HTMLCanvasElement): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLCanvasElement, opt_wrapS: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLCanvasElement, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLImageElement): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLImageElement, opt_wrapS: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLImageElement, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLVideoElement): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLVideoElement, opt_wrapS: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, image: HTMLVideoElement, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
}

