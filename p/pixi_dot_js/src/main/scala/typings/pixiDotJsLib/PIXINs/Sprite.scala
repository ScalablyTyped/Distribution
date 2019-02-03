package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sprites
@JSGlobal("PIXI.Sprite")
@js.native
class Sprite () extends Container {
  def this(texture: Texture) = this()
  var _anchor: ObservablePoint = js.native
  var _height: scala.Double = js.native
  var _texture: Texture = js.native
  var _textureID: scala.Double = js.native
  var _textureTrimmedID: scala.Double = js.native
  var _tint: scala.Double = js.native
  var _tintRGB: scala.Double = js.native
  var _transformID: scala.Double = js.native
  var _transformTrimmedID: scala.Double = js.native
  var _width: scala.Double = js.native
  var anchor: ObservablePoint = js.native
  var blendMode: scala.Double = js.native
  var cachedTint: scala.Double = js.native
  var pluginName: java.lang.String = js.native
  var texture: Texture = js.native
  var textureDirty: scala.Boolean = js.native
  var tint: scala.Double = js.native
  var vertexData: stdLib.Float32Array = js.native
  var vertexTrimmedData: stdLib.Float32Array = js.native
  /* protected */ def _onTextureUpdate(): scala.Unit = js.native
  /* protected */ def calculateTrimmedVertices(): scala.Unit = js.native
  def calculateVertices(): scala.Unit = js.native
  def containsPoint(point: Point): scala.Boolean = js.native
  /* protected */ def onAnchorUpdate(): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Sprite")
@js.native
object Sprite extends js.Object {
  def from(source: java.lang.String): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: pixiDotJsLib.PIXINs.BaseTexture): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: scala.Double): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: stdLib.HTMLImageElement): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromFrame(frameId: java.lang.String): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromImage(imageId: java.lang.String): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromImage(imageId: java.lang.String, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromImage(imageId: java.lang.String, crossorigin: scala.Boolean, scaleMode: scala.Double): pixiDotJsLib.PIXINs.Sprite = js.native
}

