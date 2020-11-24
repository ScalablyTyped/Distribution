package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TileSprite is a Sprite that has a repeating texture.
  * 
  * The texture can be scrolled and scaled independently of the TileSprite itself. Textures will automatically wrap and
  * are designed so that you can create game backdrops using seamless textures as a source.
  * 
  * You shouldn't ever create a TileSprite any larger than your actual canvas size. If you want to create a large repeating background
  * that scrolls across the whole map of your game, then you create a TileSprite that fits the canvas size and then use the `tilePosition`
  * property to scroll the texture as the player moves. If you create a TileSprite that is thousands of pixels in size then it will 
  * consume huge amounts of memory and cause performance issues. Remember: use `tilePosition` to scroll your texture and `tileScale` to
  * adjust the scale of the texture - don't resize the sprite itself or make it larger than it needs.
  * 
  * An important note about Tile Sprites and NPOT textures: Internally, TileSprite textures use GL_REPEAT to provide
  * seamless repeating of the textures. This, combined with the way in which the textures are handled in WebGL, means
  * they need to be POT (power-of-two) sizes in order to wrap. If you provide a NPOT (non power-of-two) texture to a
  * TileSprite it will generate a POT sized canvas and draw your texture to it, scaled up to the POT size. It's then
  * scaled back down again during rendering to the original dimensions. While this works, in that it allows you to use
  * any size texture for a Tile Sprite, it does mean that NPOT textures are going to appear anti-aliased when rendered,
  * due to the interpolation that took place when it was resized into a POT texture. This is especially visible in
  * pixel art graphics. If you notice it and it becomes an issue, the only way to avoid it is to ensure that you
  * provide POT textures for Tile Sprites.
  */
@JSImport("phaser", "GameObjects.TileSprite")
@js.native
class TileSprite protected ()
  extends typings.phaser.Phaser.GameObjects.TileSprite {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param width The width of the Game Object. If zero it will use the size of the texture frame.
    * @param height The height of the Game Object. If zero it will use the size of the texture frame.
    * @param textureKey The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frameKey An optional frame from the Texture this Game Object is rendering with.
    */
  def this(scene: Scene, x: Double, y: Double, width: integer, height: integer, textureKey: String) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    width: integer,
    height: integer,
    textureKey: String,
    frameKey: String
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    width: integer,
    height: integer,
    textureKey: String,
    frameKey: integer
  ) = this()
}
