package typings.playcanvas.global.pc

import typings.playcanvas.anon.Atlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Sprite contains references to one or more frames of a {@link TextureAtlas}. It can be used by
  * the {@link SpriteComponent} or the {@link ElementComponent} to render a single frame or a sprite
  * animation.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.Sprite")
@js.native
open class Sprite protected ()
  extends typings.playcanvas.mod.Sprite {
  /**
    * Create a new Sprite instance.
    *
    * @param {import('../platform/graphics/graphics-device.js').GraphicsDevice} device - The
    * graphics device of the application.
    * @param {object} [options] - Options for creating the Sprite.
    * @param {number} [options.pixelsPerUnit] - The number of pixels that map to one PlayCanvas
    * unit. Defaults to 1.
    * @param {number} [options.renderMode] - The rendering mode of the sprite. Can be:
    *
    * - {@link SPRITE_RENDERMODE_SIMPLE}
    * - {@link SPRITE_RENDERMODE_SLICED}
    * - {@link SPRITE_RENDERMODE_TILED}
    *
    * Defaults to {@link SPRITE_RENDERMODE_SIMPLE}.
    * @param {import('./texture-atlas.js').TextureAtlas} [options.atlas] - The texture atlas.
    * Defaults to null.
    * @param {string[]} [options.frameKeys] - The keys of the frames in the sprite atlas that this
    * sprite is using. Defaults to null.
    */
  def this(device: typings.playcanvas.mod.GraphicsDevice) = this()
  def this(device: typings.playcanvas.mod.GraphicsDevice, options: Atlas) = this()
}
