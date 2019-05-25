package typings
package olLib.webglContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Context", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createEmptyTexture(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double): stdLib.WebGLTexture = js.native
  def createEmptyTexture(
    gl: stdLib.WebGLRenderingContext,
    width: scala.Double,
    height: scala.Double,
    opt_wrapS: scala.Double
  ): stdLib.WebGLTexture = js.native
  def createEmptyTexture(
    gl: stdLib.WebGLRenderingContext,
    width: scala.Double,
    height: scala.Double,
    opt_wrapS: scala.Double,
    opt_wrapT: scala.Double
  ): stdLib.WebGLTexture = js.native
  def createTexture(gl: stdLib.WebGLRenderingContext, image: stdLib.HTMLCanvasElement): stdLib.WebGLTexture = js.native
  def createTexture(gl: stdLib.WebGLRenderingContext, image: stdLib.HTMLCanvasElement, opt_wrapS: scala.Double): stdLib.WebGLTexture = js.native
  def createTexture(
    gl: stdLib.WebGLRenderingContext,
    image: stdLib.HTMLCanvasElement,
    opt_wrapS: scala.Double,
    opt_wrapT: scala.Double
  ): stdLib.WebGLTexture = js.native
  def createTexture(gl: stdLib.WebGLRenderingContext, image: stdLib.HTMLImageElement): stdLib.WebGLTexture = js.native
  def createTexture(gl: stdLib.WebGLRenderingContext, image: stdLib.HTMLImageElement, opt_wrapS: scala.Double): stdLib.WebGLTexture = js.native
  def createTexture(
    gl: stdLib.WebGLRenderingContext,
    image: stdLib.HTMLImageElement,
    opt_wrapS: scala.Double,
    opt_wrapT: scala.Double
  ): stdLib.WebGLTexture = js.native
  def createTexture(gl: stdLib.WebGLRenderingContext, image: stdLib.HTMLVideoElement): stdLib.WebGLTexture = js.native
  def createTexture(gl: stdLib.WebGLRenderingContext, image: stdLib.HTMLVideoElement, opt_wrapS: scala.Double): stdLib.WebGLTexture = js.native
  def createTexture(
    gl: stdLib.WebGLRenderingContext,
    image: stdLib.HTMLVideoElement,
    opt_wrapS: scala.Double,
    opt_wrapT: scala.Double
  ): stdLib.WebGLTexture = js.native
}

