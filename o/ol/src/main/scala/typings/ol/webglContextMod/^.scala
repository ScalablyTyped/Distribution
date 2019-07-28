package typings.ol.webglContextMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Context", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createEmptyTexture(gl: WebGLRenderingContext, width: Double, height: Double): WebGLTexture = js.native
  def createEmptyTexture(gl: WebGLRenderingContext, width: Double, height: Double, opt_wrapS: Double): WebGLTexture = js.native
  def createEmptyTexture(gl: WebGLRenderingContext, width: Double, height: Double, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, image: HTMLCanvasElement): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, image: HTMLCanvasElement, opt_wrapS: Double): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, image: HTMLCanvasElement, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, image: HTMLImageElement): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, image: HTMLImageElement, opt_wrapS: Double): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, image: HTMLImageElement, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, image: HTMLVideoElement): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, image: HTMLVideoElement, opt_wrapS: Double): WebGLTexture = js.native
  def createTexture(gl: WebGLRenderingContext, image: HTMLVideoElement, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
}

