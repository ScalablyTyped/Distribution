package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.ComputedSize
import typings.phaser.Phaser.GameObjects.Components.Crop
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.integer
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait TileSprite
  extends GameObject
     with Alpha
     with BlendMode
     with ComputedSize
     with Crop
     with Depth
     with Flip
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with ScrollFactor
     with Tint
     with Transform
     with Visible {
  /**
    * The Canvas element that the TileSprite renders its fill pattern in to.
    * Only used in Canvas mode.
    */
  var canvas: HTMLCanvasElement = js.native
  /**
    * The Context of the Canvas element that the TileSprite renders its fill pattern in to.
    * Only used in Canvas mode.
    */
  var context: CanvasRenderingContext2D = js.native
  /**
    * Whether the Tile Sprite has changed in some way, requiring an re-render of its tile texture.
    * 
    * Such changes include the texture frame and scroll position of the Tile Sprite.
    */
  var dirty: Boolean = js.native
  /**
    * The Canvas that the TileSprites texture is rendered to.
    * This is used to create a WebGL texture from.
    */
  var fillCanvas: HTMLCanvasElement = js.native
  /**
    * The Canvas Context used to render the TileSprites texture.
    */
  var fillContext: CanvasRenderingContext2D = js.native
  /**
    * The texture that the Tile Sprite is rendered to, which is then rendered to a Scene.
    * In WebGL this is a WebGLTexture. In Canvas it's a Canvas Fill Pattern.
    */
  var fillPattern: WebGLTexture | CanvasPattern = js.native
  /**
    * The next power of two value from the height of the Fill Pattern frame.
    */
  var potHeight: integer = js.native
  /**
    * The next power of two value from the width of the Fill Pattern frame.
    */
  var potWidth: integer = js.native
  /**
    * The renderer in use by this Tile Sprite.
    */
  var renderer: CanvasRenderer | WebGLRenderer = js.native
  /**
    * The horizontal scroll position of the Tile Sprite.
    */
  var tilePositionX: Double = js.native
  /**
    * The vertical scroll position of the Tile Sprite.
    */
  var tilePositionY: Double = js.native
  /**
    * The horizontal scale of the Tile Sprite texture.
    */
  var tileScaleX: Double = js.native
  /**
    * The vertical scale of the Tile Sprite texture.
    */
  var tileScaleY: Double = js.native
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
  /**
    * Sets the frame this Game Object will use to render with.
    * 
    * The Frame has to belong to the current Texture being used.
    * 
    * It can be either a string or an index.
    * @param frame The name or index of the frame within the Texture.
    */
  def setFrame(frame: String): this.type = js.native
  def setFrame(frame: integer): this.type = js.native
  /**
    * Sets the texture and frame this Game Object will use to render with.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * @param key The key of the texture to be used, as stored in the Texture Manager.
    * @param frame The name or index of the frame within the Texture.
    */
  def setTexture(key: String): this.type = js.native
  def setTexture(key: String, frame: String): this.type = js.native
  def setTexture(key: String, frame: integer): this.type = js.native
  /**
    * Sets {@link Phaser.GameObjects.TileSprite#tilePositionX} and {@link Phaser.GameObjects.TileSprite#tilePositionY}.
    * @param x The x position of this sprite's tiling texture.
    * @param y The y position of this sprite's tiling texture.
    */
  def setTilePosition(): this.type = js.native
  def setTilePosition(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def setTilePosition(x: Double): this.type = js.native
  def setTilePosition(x: Double, y: Double): this.type = js.native
  /**
    * Sets {@link Phaser.GameObjects.TileSprite#tileScaleX} and {@link Phaser.GameObjects.TileSprite#tileScaleY}.
    * @param x The horizontal scale of the tiling texture. If not given it will use the current `tileScaleX` value.
    * @param y The vertical scale of the tiling texture. If not given it will use the `x` value. Default x.
    */
  def setTileScale(): this.type = js.native
  def setTileScale(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def setTileScale(x: Double): this.type = js.native
  def setTileScale(x: Double, y: Double): this.type = js.native
}

