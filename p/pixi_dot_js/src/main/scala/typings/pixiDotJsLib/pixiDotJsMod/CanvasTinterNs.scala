package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "CanvasTinter")
@js.native
object CanvasTinterNs extends js.Object {
  var cacheStepsPerColorChannel: scala.Double = js.native
  var canUseMultiply: scala.Boolean = js.native
  var convertTintToImage: scala.Boolean = js.native
  var tintMethod: scala.Double = js.native
  def getTintedTexture(sprite: pixiDotJsLib.PIXINs.Sprite, color: scala.Double): stdLib.HTMLCanvasElement = js.native
  def roundColor(color: scala.Double): scala.Double = js.native
  def tintWithMultiply(texture: pixiDotJsLib.PIXINs.Texture, color: scala.Double, canvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def tintWithOverlay(texture: pixiDotJsLib.PIXINs.Texture, color: scala.Double, canvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def tintWithPerPixel(texture: pixiDotJsLib.PIXINs.Texture, color: scala.Double, canvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
}

