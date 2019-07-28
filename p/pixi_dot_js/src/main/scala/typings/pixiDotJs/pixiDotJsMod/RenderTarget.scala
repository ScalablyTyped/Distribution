package typings.pixiDotJs.pixiDotJsMod

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "RenderTarget")
@js.native
class RenderTarget protected ()
  extends typings.pixiDotJs.PIXINs.RenderTarget {
  def this(gl: WebGLRenderingContext, width: Double, height: Double, scaleMode: Double, resolution: Double) = this()
  def this(
    gl: WebGLRenderingContext,
    width: Double,
    height: Double,
    scaleMode: Double,
    resolution: Double,
    root: Boolean
  ) = this()
}

