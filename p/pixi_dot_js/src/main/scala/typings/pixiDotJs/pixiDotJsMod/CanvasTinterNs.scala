package typings.pixiDotJs.pixiDotJsMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "CanvasTinter")
@js.native
object CanvasTinterNs extends js.Object {
  var cacheStepsPerColorChannel: Double = js.native
  var canUseMultiply: Boolean = js.native
  var convertTintToImage: Boolean = js.native
  var tintMethod: Double = js.native
  def getTintedTexture(sprite: typings.pixiDotJs.PIXINs.Sprite, color: Double): HTMLCanvasElement = js.native
  def roundColor(color: Double): Double = js.native
  def tintWithMultiply(texture: typings.pixiDotJs.PIXINs.Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithOverlay(texture: typings.pixiDotJs.PIXINs.Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
  def tintWithPerPixel(texture: typings.pixiDotJs.PIXINs.Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native
}

