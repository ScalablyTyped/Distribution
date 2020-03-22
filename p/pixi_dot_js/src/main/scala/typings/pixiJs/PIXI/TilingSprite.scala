package typings.pixiJs.PIXI

import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tiling sprite is a fast way of rendering a tiling image
  *
  * @class
  * @extends PIXI.Sprite
  * @memberof PIXI
  */
@JSGlobal("PIXI.TilingSprite")
@js.native
class TilingSprite protected () extends Sprite {
  def this(texture: Texture) = this()
  def this(texture: Texture, width: Double) = this()
  def this(texture: Texture, width: Double, height: Double) = this()
  /**
    * Changes frame clamping in corresponding textureTransform, shortcut
    * Change to -0.5 to add a pixel to the edge, recommended for transparent trimmed textures in atlas
    *
    * @default 0.5
    * @member {number}
    */
  var clampMargin: Double = js.native
  /**
    * The offset of the image that is being tiled
    *
    * @member {PIXI.ObservablePoint}
    */
  var tilePosition: ObservablePoint = js.native
  /**
    * The scaling of the image that is being tiled
    *
    * @member {PIXI.ObservablePoint}
    */
  var tileScale: ObservablePoint = js.native
  /**
    * Tile transform
    *
    * @member {PIXI.Transform} PIXI.TilingSprite#tileTransform
    */
  var tileTransform: Transform = js.native
  /**
    * matrix that is applied to UV to get the coords in Texture normalized space to coords in BaseTexture space
    *
    * @member {PIXI.TextureMatrix} PIXI.TilingSprite#uvMatrix
    */
  var uvMatrix: TextureMatrix = js.native
  /**
    * Whether or not anchor affects uvs
    *
    * @member {boolean} PIXI.TilingSprite#uvRespectAnchor
    * @default false
    */
  var uvRespectAnchor: Boolean = js.native
}

/* static members */
@JSGlobal("PIXI.TilingSprite")
@js.native
object TilingSprite extends js.Object {
  def from(source: String): Sprite = js.native
  def from(source: String, options: js.Any): Sprite = js.native
  /**
    * Helper function that creates a new tiling sprite based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    *
    * @static
    * @param {string|PIXI.Texture|HTMLCanvasElement|HTMLVideoElement} source - Source to create texture from
    * @param {number} width - the width of the tiling sprite
    * @param {number} height - the height of the tiling sprite
    * @return {PIXI.TilingSprite} The newly created texture
    */
  def from(source: String, width: Double, height: Double): TilingSprite = js.native
  def from(source: Double): Sprite = js.native
  def from(source: Double, options: js.Any): Sprite = js.native
  def from(source: Texture): Sprite = js.native
  def from(source: Texture, options: js.Any): Sprite = js.native
  def from(source: Texture, width: Double, height: Double): TilingSprite = js.native
  def from(source: HTMLCanvasElement): Sprite = js.native
  def from(source: HTMLCanvasElement, options: js.Any): Sprite = js.native
  def from(source: HTMLCanvasElement, width: Double, height: Double): TilingSprite = js.native
  def from(source: HTMLVideoElement): Sprite = js.native
  def from(source: HTMLVideoElement, options: js.Any): Sprite = js.native
  def from(source: HTMLVideoElement, width: Double, height: Double): TilingSprite = js.native
  def fromFrame(): Sprite = js.native
  /**
    * Helper function that creates a tiling sprite that will use a texture from the TextureCache based on the frameId
    * The frame ids are created when a Texture packer file has been loaded
    *
    * @static
    * @param {string} frameId - The frame Id of the texture in the cache
    * @param {number} width - the width of the tiling sprite
    * @param {number} height - the height of the tiling sprite
    * @return {PIXI.TilingSprite} A new TilingSprite using a texture from the texture cache matching the frameId
    */
  def fromFrame(frameId: String, width: Double, height: Double): TilingSprite = js.native
  def fromImage(): Sprite = js.native
  /**
    * Helper function that creates a sprite that will contain a texture based on an image url
    * If the image is not in the texture cache it will be loaded
    *
    * @static
    * @param {string} imageId - The image url of the texture
    * @param {number} width - the width of the tiling sprite
    * @param {number} height - the height of the tiling sprite
    * @param {Object} [options] - See {@link PIXI.BaseTexture}'s constructor for options.
    * @return {PIXI.TilingSprite} A new TilingSprite using a texture from the texture cache matching the image id
    */
  def fromImage(imageId: String, width: Double, height: Double): TilingSprite = js.native
  def fromImage(imageId: String, width: Double, height: Double, options: js.Any): TilingSprite = js.native
}

