package typings.ol.webglContextMod

import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Context", "createEmptyTexture")
@js.native
object createEmptyTexture extends js.Object {
  def apply(gl: WebGLRenderingContext, width: Double, height: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, width: Double, height: Double, opt_wrapS: Double): WebGLTexture = js.native
  def apply(gl: WebGLRenderingContext, width: Double, height: Double, opt_wrapS: Double, opt_wrapT: Double): WebGLTexture = js.native
}

