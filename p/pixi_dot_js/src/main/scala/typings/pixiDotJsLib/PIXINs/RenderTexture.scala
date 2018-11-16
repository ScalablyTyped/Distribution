package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.RenderTexture")
@js.native
class RenderTexture protected () extends Texture {
  def this(baseRenderTexture: BaseRenderTexture) = this()
  def this(baseRenderTexture: BaseRenderTexture, frame: Rectangle) = this()
  var legacyRenderer: js.Any = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double, doNotResizeBaseTexture: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("PIXI.RenderTexture")
@js.native
object RenderTexture extends js.Object {
  def create(): pixiDotJsLib.PIXINs.RenderTexture = js.native
  def create(width: scala.Double): pixiDotJsLib.PIXINs.RenderTexture = js.native
  def create(width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.RenderTexture = js.native
  def create(width: scala.Double, height: scala.Double, scaleMode: scala.Double): pixiDotJsLib.PIXINs.RenderTexture = js.native
  def create(width: scala.Double, height: scala.Double, scaleMode: scala.Double, resolution: scala.Double): pixiDotJsLib.PIXINs.RenderTexture = js.native
}

