package typings
package phaserLib.PhaserNs.GameObjectsNs

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
@JSGlobal("Phaser.GameObjects.TileSprite")
@js.native
class TileSprite protected ()
  extends GameObject
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Alpha
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.BlendMode
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.ComputedSize
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Crop
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Depth
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Flip
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.GetBounds
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Mask
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Origin
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Pipeline
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.ScrollFactor
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Tint
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Transform
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Visible {
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
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, width: phaserLib.integer, height: phaserLib.integer, textureKey: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, width: phaserLib.integer, height: phaserLib.integer, textureKey: java.lang.String, frameKey: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, width: phaserLib.integer, height: phaserLib.integer, textureKey: java.lang.String, frameKey: phaserLib.integer) = this()
  /**
    * The Canvas element that the TileSprite renders its fill pattern in to.
    * Only used in Canvas mode.
    */
  var canvas: stdLib.HTMLCanvasElement = js.native
  /**
    * The Context of the Canvas element that the TileSprite renders its fill pattern in to.
    * Only used in Canvas mode.
    */
  var context: stdLib.CanvasRenderingContext2D = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: scala.Double = js.native
  /**
    * Whether the Tile Sprite has changed in some way, requiring an re-render of its tile texture.
    * 
    * Such changes include the texture frame and scroll position of the Tile Sprite.
    */
  var dirty: scala.Boolean = js.native
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayHeight: scala.Double = js.native
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayWidth: scala.Double = js.native
  /**
    * The Canvas that the TileSprites texture is rendered to.
    * This is used to create a WebGL texture from.
    */
  var fillCanvas: stdLib.HTMLCanvasElement = js.native
  /**
    * The Canvas Context used to render the TileSprites texture.
    */
  var fillContext: stdLib.CanvasRenderingContext2D = js.native
  /**
    * The texture that the Tile Sprite is rendered to, which is then rendered to a Scene.
    * In WebGL this is a WebGLTexture. In Canvas it's a Canvas Fill Pattern.
    */
  var fillPattern: stdLib.WebGLTexture | stdLib.CanvasPattern = js.native
  /**
    * The horizontally flipped state of the Game Object.
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    */
  /* CompleteClass */
  override var flipX: scala.Boolean = js.native
  /**
    * The vertically flipped state of the Game Object.
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    */
  /* CompleteClass */
  override var flipY: scala.Boolean = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  override var height: scala.Double = js.native
  /**
    * The next power of two value from the height of the Fill Pattern frame.
    */
  var potHeight: phaserLib.integer = js.native
  /**
    * The next power of two value from the width of the Fill Pattern frame.
    */
  var potWidth: phaserLib.integer = js.native
  /**
    * The renderer in use by this Tile Sprite.
    */
  var renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer | phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer = js.native
  /**
    * The horizontal scroll position of the Tile Sprite.
    */
  var tilePositionX: scala.Double = js.native
  /**
    * The vertical scroll position of the Tile Sprite.
    */
  var tilePositionY: scala.Double = js.native
  /**
    * The horizontal scale of the Tile Sprite texture.
    */
  var tileScaleX: scala.Double = js.native
  /**
    * The vertical scale of the Tile Sprite texture.
    */
  var tileScaleY: scala.Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  override var width: scala.Double = js.native
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): scala.Unit = js.native
  /**
    * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
    */
  /* CompleteClass */
  override def resetFlip(): this.type = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: phaserLib.integer): this.type = js.native
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setDisplaySize(width: scala.Double, height: scala.Double): this.type = js.native
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlip(x: scala.Boolean, y: scala.Boolean): this.type = js.native
  /**
    * Sets the horizontal flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipX(value: scala.Boolean): this.type = js.native
  /**
    * Sets the vertical flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipY(value: scala.Boolean): this.type = js.native
  /**
    * Sets the frame this Game Object will use to render with.
    * 
    * The Frame has to belong to the current Texture being used.
    * 
    * It can be either a string or an index.
    * @param frame The name or index of the frame within the Texture.
    */
  def setFrame(frame: java.lang.String): this.type = js.native
  def setFrame(frame: phaserLib.integer): this.type = js.native
  /**
    * Sets the internal size of this Game Object, as used for frame or physics body creation.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setSize(width: scala.Double, height: scala.Double): this.type = js.native
  /**
    * Sets the texture and frame this Game Object will use to render with.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * @param key The key of the texture to be used, as stored in the Texture Manager.
    * @param frame The name or index of the frame within the Texture.
    */
  def setTexture(key: java.lang.String): this.type = js.native
  def setTexture(key: java.lang.String, frame: java.lang.String): this.type = js.native
  def setTexture(key: java.lang.String, frame: phaserLib.integer): this.type = js.native
  /**
    * Sets {@link Phaser.GameObjects.TileSprite#tilePositionX} and {@link Phaser.GameObjects.TileSprite#tilePositionY}.
    * @param x The x position of this sprite's tiling texture.
    * @param y The y position of this sprite's tiling texture.
    */
  def setTilePosition(): this.type = js.native
  def setTilePosition(x: scala.Double): this.type = js.native
  def setTilePosition(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets {@link Phaser.GameObjects.TileSprite#tileScaleX} and {@link Phaser.GameObjects.TileSprite#tileScaleY}.
    * @param x The horizontal scale of the tiling texture. If not given it will use the current `tileScaleX` value.
    * @param y The vertical scale of the tiling texture. If not given it will use the `x` value. Default x.
    */
  def setTileScale(): this.type = js.native
  def setTileScale(x: scala.Double): this.type = js.native
  def setTileScale(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: scala.Boolean): this.type = js.native
  /**
    * Toggles the horizontal flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipX(): this.type = js.native
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipY(): this.type = js.native
}

