package typings.pixiDotJs.pixiDotJsMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "CanvasTinter")
@js.native
object CanvasTinter extends js.Object {
  var cacheStepsPerColorChannel: Double = js.native
  var canUseMultiply: Boolean = js.native
  var convertTintToImage: Boolean = js.native
  var tintMethod: Double = js.native
  def getTintedTexture(sprite: typings.pixiDotJs.PIXI.Sprite, color: Double): HTMLCanvasElement = js.native
  def roundColor(color: Double): Double = js.native
  def tintWithMultiply(texture: typings.pixiDotJs.PIXI.Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithOverlay(texture: typings.pixiDotJs.PIXI.Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithPerPixel(texture: typings.pixiDotJs.PIXI.Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
}

