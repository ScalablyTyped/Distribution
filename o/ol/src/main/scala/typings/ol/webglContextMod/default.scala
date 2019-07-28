package typings.ol.webglContextMod

import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Context", JSImport.Default)
@js.native
class default protected () extends WebGLContext {
  def this(canvas: HTMLCanvasElement, gl: WebGLRenderingContext) = this()
}

