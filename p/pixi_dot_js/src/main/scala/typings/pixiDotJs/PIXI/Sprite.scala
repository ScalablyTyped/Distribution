package typings.pixiDotJs.PIXI

import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sprites
/**
  * The Sprite object is the base for all textured objects that are rendered to the screen
  *
  * A sprite can be created directly from an image like this:
  *
  * ```js
  * let sprite = new PIXI.Sprite.fromImage("assets/image.png");
  * ```
  *
  * The more efficient way to create sprites is using a {@link PIXI.Spritesheet}:
  *
  * ```js
  * PIXI.loader.add("assets/spritesheet.json").load(setup);
  *
  * function setup() {
  *   let sheet = PIXI.loader.resources["assets/spritesheet.json"].spritesheet;
  *   let sprite = new PIXI.Sprite(sheet.textures["image.png"]);
  *   ...
  * }
  * ```
  */
@JSGlobal("PIXI.Sprite")
@js.native
class Sprite () extends Container {
  def this(texture: Texture) = this()
  var _anchor: ObservablePoint = js.native
  var _height: Double = js.native
  var _texture: Texture = js.native
  var _textureID: Double = js.native
  var _textureTrimmedID: Double = js.native
  var _tint: Double = js.native
  var _tintRGB: Double = js.native
  var _transformID: Double = js.native
  var _transformTrimmedID: Double = js.native
  var _width: Double = js.native
  var anchor: ObservablePoint = js.native
  var blendMode: Double = js.native
  var cachedTint: Double = js.native
  var pluginName: String = js.native
  var texture: Texture = js.native
  var textureDirty: Boolean = js.native
  var tint: Double = js.native
  var vertexData: Float32Array = js.native
  var vertexTrimmedData: Float32Array = js.native
  /* protected */ def _onTextureUpdate(): Unit = js.native
  /**
    * calculates worldTransform * vertices for a non texture with a trim. store it in vertexTrimmedData
    * This is used to ensure that the true width and height of a trimmed texture is respected
    */
  /* protected */ def calculateTrimmedVertices(): Unit = js.native
  /**
    * calculates worldTransform * vertices, store it in vertexData
    */
  def calculateVertices(): Unit = js.native
  /**
    * Tests if a point is inside this sprite
    *
    * @param point - the point to test
    * @return the result of the test
    */
  def containsPoint(point: Point): Boolean = js.native
  /* protected */ def onAnchorUpdate(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Sprite")
@js.native
object Sprite extends js.Object {
  def from(source: String): Sprite = js.native
  def from(source: Double): Sprite = js.native
  def from(source: BaseTexture): Sprite = js.native
  def from(source: HTMLCanvasElement): Sprite = js.native
  def from(source: HTMLImageElement): Sprite = js.native
  def from(source: HTMLVideoElement): Sprite = js.native
  def fromFrame(frameId: String): Sprite = js.native
  def fromImage(imageId: String): Sprite = js.native
  def fromImage(imageId: String, crossorigin: Boolean): Sprite = js.native
  def fromImage(imageId: String, crossorigin: Boolean, scaleMode: Double): Sprite = js.native
}

