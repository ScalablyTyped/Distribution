package typings
package pixiDotJsLib.PIXINs.extrasNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extras.TilingSprite")
@js.native
class TilingSprite protected ()
  extends pixiDotJsLib.PIXINs.Sprite {
  def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, width: scala.Double) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, width: scala.Double, height: scala.Double) = this()
  var _canvasPattern: stdLib.CanvasPattern = js.native
  var clampMargin: scala.Double = js.native
  var tilePosition: pixiDotJsLib.PIXINs.Point | pixiDotJsLib.PIXINs.ObservablePoint = js.native
  var tileScale: pixiDotJsLib.PIXINs.Point | pixiDotJsLib.PIXINs.ObservablePoint = js.native
  var tileTransform: pixiDotJsLib.PIXINs.TransformStatic = js.native
  var uvRespectAnchor: scala.Boolean = js.native
  var uvTransform: TextureMatrix = js.native
  def multiplyUvs(uvs: stdLib.Float32Array, out: stdLib.Float32Array): stdLib.Float32Array = js.native
}

/* static members */
@JSGlobal("PIXI.extras.TilingSprite")
@js.native
object TilingSprite extends js.Object {
  def from(source: java.lang.String): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: java.lang.String, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: java.lang.String, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: pixiDotJsLib.PIXINs.BaseTexture): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: pixiDotJsLib.PIXINs.BaseTexture, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: pixiDotJsLib.PIXINs.BaseTexture, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: scala.Double, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: scala.Double, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: stdLib.HTMLCanvasElement, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: stdLib.HTMLCanvasElement, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: stdLib.HTMLVideoElement, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def from(source: stdLib.HTMLVideoElement, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def fromFrame(frameId: java.lang.String): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def fromFrame(frameId: java.lang.String, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def fromFrame(frameId: java.lang.String, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def fromImage(imageId: java.lang.String): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def fromImage(imageId: java.lang.String, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromImage(imageId: java.lang.String, crossorigin: scala.Boolean, scaleMode: scala.Double): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromImage(imageId: java.lang.String, width: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def fromImage(imageId: java.lang.String, width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def fromImage(imageId: java.lang.String, width: scala.Double, height: scala.Double, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  def fromImage(
    imageId: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    crossorigin: scala.Boolean,
    scaleMode: scala.Double
  ): pixiDotJsLib.PIXINs.extrasNs.TilingSprite = js.native
  // if you remove the next line, the class will break. https://github.com/pixijs/pixi-typescript/issues/96
  @JSName("fromImage")
  def fromImage_Sprite(imageId: java.lang.String): pixiDotJsLib.PIXINs.Sprite = js.native
}

