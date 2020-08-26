package typings.playcanvas.mod

import typings.playcanvas.anon.Atlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pc.Sprite is contains references to one or more frames of a {@link pc.TextureAtlas}.
  * It can be used by the {@link pc.SpriteComponent} or the {@link pc.ElementComponent} to render a
  * single frame or a sprite animation.
  * @property pixelsPerUnit - The number of pixels that map to one PlayCanvas unit.
  * @property atlas - The texture atlas.
  * @property renderMode - The rendering mode of the sprite. Can be:
  *
  * * {@link pc.SPRITE_RENDERMODE_SIMPLE}
  * * {@link pc.SPRITE_RENDERMODE_SLICED}
  * * {@link pc.SPRITE_RENDERMODE_TILED}
  * @property frameKeys - The keys of the frames in the sprite atlas that this sprite is using.
  * @property meshes - An array that contains a mesh for each frame.
  * @param device - The graphics device of the application.
  * @param [options] - Options for creating the pc.Sprite.
  * @param [options.pixelsPerUnit] - The number of pixels that map to one PlayCanvas unit.
  * Defaults to 1.
  * @param [options.renderMode] - The rendering mode of the sprite. Can be:
  *
  * * {@link pc.SPRITE_RENDERMODE_SIMPLE}
  * * {@link pc.SPRITE_RENDERMODE_SLICED}
  * * {@link pc.SPRITE_RENDERMODE_TILED}
  *
  * Defaults to pc.SPRITE_RENDERMODE_SIMPLE.
  * @param [options.atlas] - The texture atlas. Defaults to null.
  * @param [options.frameKeys] - The keys of the frames in the sprite atlas that this sprite is
  * using. Defaults to null.
  */
@JSImport("playcanvas", "Sprite")
@js.native
class Sprite protected ()
  extends typings.playcanvas.pc.Sprite {
  def this(device: typings.playcanvas.pc.GraphicsDevice) = this()
  def this(device: typings.playcanvas.pc.GraphicsDevice, options: Atlas) = this()
}

