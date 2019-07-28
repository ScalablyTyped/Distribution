package typings.pixiDotJs.PIXINs

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.CanvasTinter")
@js.native
object CanvasTinterNs extends js.Object {
  var cacheStepsPerColorChannel: Double = js.native
  var canUseMultiply: Boolean = js.native
  var convertTintToImage: Boolean = js.native
  var tintMethod: Double = js.native
  def getTintedTexture(sprite: Sprite, color: Double): HTMLCanvasElement = js.native
  def roundColor(color: Double): Double = js.native
  def tintWithMultiply(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithOverlay(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithPerPixel(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
}

