package typings.playcanvas.mod

import typings.playcanvas.AnonAtlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Sprite
  * @extends pc.EventHandler
  * @classdesc A pc.Sprite is contains references to one or more frames of a {@link pc.TextureAtlas}.
  * It can be used by the {@link pc.SpriteComponent} or the {@link pc.ElementComponent} to render a
  * single frame or a sprite animation.
  * @param {pc.GraphicsDevice} device The graphics device of the application.
  * @param {Object} [options] Options for creating the pc.Sprite.
  * @param {Number} [options.pixelsPerUnit] The number of pixels that map to one PlayCanvas unit.
  * Defaults to 1.
  * @param {Number} [options.renderMode] The rendering mode of the sprite. Can be:
  * <ul>
  *     <li>{@link pc.SPRITE_RENDERMODE_SIMPLE}</li>
  *     <li>{@link pc.SPRITE_RENDERMODE_SLICED}</li>
  *     <li>{@link pc.SPRITE_RENDERMODE_TILED}</li>
  * </ul>
  * Defaults to pc.SPRITE_RENDERMODE_SIMPLE.
  * @param {pc.TextureAtlas} [options.atlas] The texture atlas. Defaults to null.
  * @param {String[]} [options.frameKeys] The keys of the frames in the sprite atlas that this sprite is
  * using. Defaults to null.
  * @property {Number} pixelsPerUnit The number of pixels that map to one PlayCanvas unit.
  * @property {pc.TextureAtlas} atlas The texture atlas.
  * @property {Number} renderMode The rendering mode of the sprite. Can be:
  * <ul>
  *     <li>{@link pc.SPRITE_RENDERMODE_SIMPLE}</li>
  *     <li>{@link pc.SPRITE_RENDERMODE_SLICED}</li>
  *     <li>{@link pc.SPRITE_RENDERMODE_TILED}</li>
  * </ul>
  * @property {String[]} frameKeys The keys of the frames in the sprite atlas that this sprite is using.
  * @property {pc.Mesh[]} meshes An array that contains a mesh for each frame.
  */
@JSImport("playcanvas", "Sprite")
@js.native
class Sprite protected ()
  extends typings.playcanvas.pc.Sprite {
  def this(device: typings.playcanvas.pc.GraphicsDevice) = this()
  def this(device: typings.playcanvas.pc.GraphicsDevice, options: AnonAtlas) = this()
}

