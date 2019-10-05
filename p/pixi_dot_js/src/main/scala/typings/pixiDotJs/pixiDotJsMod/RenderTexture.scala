package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "RenderTexture")
@js.native
class RenderTexture protected ()
  extends typings.pixiDotJs.PIXI.RenderTexture {
  def this(baseRenderTexture: typings.pixiDotJs.PIXI.BaseRenderTexture) = this()
  def this(
    baseRenderTexture: typings.pixiDotJs.PIXI.BaseRenderTexture,
    frame: typings.pixiDotJs.PIXI.Rectangle
  ) = this()
}

/* static members */
@JSImport("pixi.js", "RenderTexture")
@js.native
object RenderTexture extends js.Object {
  def create(): typings.pixiDotJs.PIXI.RenderTexture = js.native
  def create(width: Double): typings.pixiDotJs.PIXI.RenderTexture = js.native
  def create(width: Double, height: Double): typings.pixiDotJs.PIXI.RenderTexture = js.native
  def create(width: Double, height: Double, scaleMode: Double): typings.pixiDotJs.PIXI.RenderTexture = js.native
  def create(width: Double, height: Double, scaleMode: Double, resolution: Double): typings.pixiDotJs.PIXI.RenderTexture = js.native
}

