package typings.pixiDotJs.PIXINs.extrasNs

import typings.pixiDotJs.PIXINs.BaseTexture
import typings.pixiDotJs.PIXINs.ObservablePoint
import typings.pixiDotJs.PIXINs.Point
import typings.pixiDotJs.PIXINs.Sprite
import typings.pixiDotJs.PIXINs.Texture
import typings.pixiDotJs.PIXINs.TransformStatic
import typings.std.CanvasPattern
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extras.TilingSprite")
@js.native
class TilingSprite protected () extends Sprite {
  def this(texture: Texture) = this()
  def this(texture: Texture, width: Double) = this()
  def this(texture: Texture, width: Double, height: Double) = this()
  var _canvasPattern: CanvasPattern = js.native
  var clampMargin: Double = js.native
  var tilePosition: Point | ObservablePoint = js.native
  var tileScale: Point | ObservablePoint = js.native
  var tileTransform: TransformStatic = js.native
  var uvRespectAnchor: Boolean = js.native
  var uvTransform: typings.pixiDotJs.PIXINs.extrasNs.TextureMatrix = js.native
  def multiplyUvs(uvs: Float32Array, out: Float32Array): Float32Array = js.native
}

/* static members */
@JSGlobal("PIXI.extras.TilingSprite")
@js.native
object TilingSprite extends js.Object {
  def from(source: String): TilingSprite = js.native
  def from(source: String, width: Double): TilingSprite = js.native
  def from(source: String, width: Double, height: Double): TilingSprite = js.native
  def from(source: Double): TilingSprite = js.native
  def from(source: Double, width: Double): TilingSprite = js.native
  def from(source: Double, width: Double, height: Double): TilingSprite = js.native
  def from(source: BaseTexture): TilingSprite = js.native
  def from(source: BaseTexture, width: Double): TilingSprite = js.native
  def from(source: BaseTexture, width: Double, height: Double): TilingSprite = js.native
  def from(source: HTMLCanvasElement): TilingSprite = js.native
  def from(source: HTMLCanvasElement, width: Double): TilingSprite = js.native
  def from(source: HTMLCanvasElement, width: Double, height: Double): TilingSprite = js.native
  def from(source: HTMLVideoElement): TilingSprite = js.native
  def from(source: HTMLVideoElement, width: Double): TilingSprite = js.native
  def from(source: HTMLVideoElement, width: Double, height: Double): TilingSprite = js.native
  def fromFrame(frameId: String): TilingSprite = js.native
  def fromFrame(frameId: String, width: Double): TilingSprite = js.native
  def fromFrame(frameId: String, width: Double, height: Double): TilingSprite = js.native
  def fromImage(imageId: String): TilingSprite = js.native
  def fromImage(imageId: String, crossorigin: Boolean): Sprite = js.native
  def fromImage(imageId: String, crossorigin: Boolean, scaleMode: Double): Sprite = js.native
  def fromImage(imageId: String, width: Double): TilingSprite = js.native
  def fromImage(imageId: String, width: Double, height: Double): TilingSprite = js.native
  def fromImage(imageId: String, width: Double, height: Double, crossorigin: Boolean): TilingSprite = js.native
  def fromImage(imageId: String, width: Double, height: Double, crossorigin: Boolean, scaleMode: Double): TilingSprite = js.native
  // if you remove the next line, the class will break. https://github.com/pixijs/pixi-typescript/issues/96
  @JSName("fromImage")
  def fromImage_Sprite(imageId: String): Sprite = js.native
}

