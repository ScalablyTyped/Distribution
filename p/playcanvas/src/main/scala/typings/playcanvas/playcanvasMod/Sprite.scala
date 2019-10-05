package typings.playcanvas.playcanvasMod

import typings.playcanvas.Anon_Atlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Sprite
  * @extends pc.EventHandler
  * @classdesc A pc.Sprite is contains references to one or more frames of a {@link pc.TextureAtlas}. It can be used
  * by the {@link pc.SpriteComponent} or the {@link pc.ElementComponent} to render a single frame or a sprite animation.
  * @param {pc.GraphicsDevice} device The graphics device of the application.
  * @param {Object} options Options for creating the pc.Sprite.
  * @param {Number} [options.pixelsPerUnit] The number of pixels that map to one PlayCanvas unit.
  * @param {Number} [options.renderMode] The rendering mode of the Sprite, see {@link pc.SPRITE_RENDERMODE}.
  * @param {pc.TextureAtlas} [options.atlas] The texture atlas.
  * @property {String[]} [options.frameKeys] The keys of the frames in the sprite atlas that this sprite is using.
  * @property {Number} pixelsPerUnit The number of pixels that map to one PlayCanvas unit.
  * @property {pc.TextureAtlas} atlas The texture atlas.
  * @property {Number} renderMode The rendering mode of the Sprite, see {@link pc.SPRITE_RENDERMODE}.
  * @property {String[]} frameKeys The keys of the frames in the sprite atlas that this sprite is using.
  * @property {pc.Mesh[]} meshes An array that contains a mesh for each frame.
  */
@JSImport("playcanvas", "Sprite")
@js.native
class Sprite protected ()
  extends typings.playcanvas.pc.Sprite {
  def this(device: typings.playcanvas.pc.GraphicsDevice, options: Anon_Atlas) = this()
}

