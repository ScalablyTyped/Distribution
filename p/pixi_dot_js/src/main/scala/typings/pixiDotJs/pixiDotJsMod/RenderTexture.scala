package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "RenderTexture")
@js.native
class RenderTexture protected ()
  extends typings.pixiDotJs.PIXINs.RenderTexture {
  def this(baseRenderTexture: typings.pixiDotJs.PIXINs.BaseRenderTexture) = this()
  def this(
    baseRenderTexture: typings.pixiDotJs.PIXINs.BaseRenderTexture,
    frame: typings.pixiDotJs.PIXINs.Rectangle
  ) = this()
}

/* static members */
@JSImport("pixi.js", "RenderTexture")
@js.native
object RenderTexture extends js.Object {
  def create(): typings.pixiDotJs.PIXINs.RenderTexture = js.native
  def create(width: Double): typings.pixiDotJs.PIXINs.RenderTexture = js.native
  def create(width: Double, height: Double): typings.pixiDotJs.PIXINs.RenderTexture = js.native
  def create(width: Double, height: Double, scaleMode: Double): typings.pixiDotJs.PIXINs.RenderTexture = js.native
  def create(width: Double, height: Double, scaleMode: Double, resolution: Double): typings.pixiDotJs.PIXINs.RenderTexture = js.native
}

