package typings.pixiJs.global.PIXI

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
class TilingSprite protected ()
  extends typings.pixiJs.PIXI.TilingSprite {
  def this(texture: typings.pixiJs.PIXI.Texture) = this()
  def this(texture: typings.pixiJs.PIXI.Texture, width: Double) = this()
  def this(texture: typings.pixiJs.PIXI.Texture, width: Double, height: Double) = this()
}

/* static members */
@JSGlobal("PIXI.TilingSprite")
@js.native
object TilingSprite extends js.Object {
  def from(source: String): typings.pixiJs.PIXI.Sprite = js.native
  def from(source: String, options: js.Any): typings.pixiJs.PIXI.Sprite = js.native
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
  def from(source: String, width: Double, height: Double): typings.pixiJs.PIXI.TilingSprite = js.native
  def from(source: Double): typings.pixiJs.PIXI.Sprite = js.native
  def from(source: Double, options: js.Any): typings.pixiJs.PIXI.Sprite = js.native
  def from(source: typings.pixiJs.PIXI.Texture): typings.pixiJs.PIXI.Sprite = js.native
  def from(source: typings.pixiJs.PIXI.Texture, options: js.Any): typings.pixiJs.PIXI.Sprite = js.native
  def from(source: typings.pixiJs.PIXI.Texture, width: Double, height: Double): typings.pixiJs.PIXI.TilingSprite = js.native
  def from(source: HTMLCanvasElement): typings.pixiJs.PIXI.Sprite = js.native
  def from(source: HTMLCanvasElement, options: js.Any): typings.pixiJs.PIXI.Sprite = js.native
  def from(source: HTMLCanvasElement, width: Double, height: Double): typings.pixiJs.PIXI.TilingSprite = js.native
  def from(source: HTMLVideoElement): typings.pixiJs.PIXI.Sprite = js.native
  def from(source: HTMLVideoElement, options: js.Any): typings.pixiJs.PIXI.Sprite = js.native
  def from(source: HTMLVideoElement, width: Double, height: Double): typings.pixiJs.PIXI.TilingSprite = js.native
  def fromFrame(): typings.pixiJs.PIXI.Sprite = js.native
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
  def fromFrame(frameId: String, width: Double, height: Double): typings.pixiJs.PIXI.TilingSprite = js.native
  def fromImage(): typings.pixiJs.PIXI.Sprite = js.native
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
  def fromImage(imageId: String, width: Double, height: Double): typings.pixiJs.PIXI.TilingSprite = js.native
  def fromImage(imageId: String, width: Double, height: Double, options: js.Any): typings.pixiJs.PIXI.TilingSprite = js.native
}

