package typings.playcanvas.pc

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
@JSGlobal("pc.Sprite")
@js.native
class Sprite protected () extends EventHandler {
  def this(device: GraphicsDevice, options: Anon_Atlas) = this()
  /**
    * The texture atlas.
    */
  var atlas: TextureAtlas = js.native
  /**
    * The keys of the frames in the sprite atlas that this sprite is using.
    */
  var frameKeys: js.Array[String] = js.native
  /**
    * An array that contains a mesh for each frame.
    */
  var meshes: js.Array[Mesh] = js.native
  /**
    * The number of pixels that map to one PlayCanvas unit.
    */
  var pixelsPerUnit: Double = js.native
  /**
    * The rendering mode of the Sprite, see {@link pc.SPRITE_RENDERMODE}.
    */
  var renderMode: Double = js.native
  /**
    * @function
    * @name pc.Sprite#destroy
    * @description Free up the meshes created by the sprite.
    */
  def destroy(): Unit = js.native
}

