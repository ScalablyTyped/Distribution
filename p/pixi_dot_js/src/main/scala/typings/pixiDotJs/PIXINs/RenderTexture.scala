package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.RenderTexture")
@js.native
class RenderTexture protected () extends Texture {
  def this(baseRenderTexture: BaseRenderTexture) = this()
  def this(baseRenderTexture: BaseRenderTexture, frame: Rectangle) = this()
  var legacyRenderer: js.Any = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def resize(width: Double, height: Double, doNotResizeBaseTexture: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.RenderTexture")
@js.native
object RenderTexture extends js.Object {
  def create(): RenderTexture = js.native
  def create(width: Double): RenderTexture = js.native
  def create(width: Double, height: Double): RenderTexture = js.native
  def create(width: Double, height: Double, scaleMode: Double): RenderTexture = js.native
  def create(width: Double, height: Double, scaleMode: Double, resolution: Double): RenderTexture = js.native
}

