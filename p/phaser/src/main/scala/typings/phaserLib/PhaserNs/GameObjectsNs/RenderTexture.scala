package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Render Texture.
  * 
  * A Render Texture is a special texture that allows any number of Game Objects to be drawn to it. You can take many complex objects and
  * draw them all to this one texture, which can they be used as the texture for other Game Object's. It's a way to generate dynamic
  * textures at run-time that are WebGL friendly and don't invoke expensive GPU uploads.
  * 
  * Note that under WebGL a FrameBuffer, which is what the Render Texture uses internally, cannot be anti-aliased. This means
  * that when drawing objects such as Shapes to a Render Texture they will appear to be drawn with no aliasing, however this
  * is a technical limitation of WebGL. To get around it, create your shape as a texture in an art package, then draw that
  * to the Render Texture.
  */
@JSGlobal("Phaser.GameObjects.RenderTexture")
@js.native
class RenderTexture protected ()
  extends GameObject
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Alpha
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.BlendMode
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.ComputedSize
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
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the Render Texture. Default 32.
    * @param height The height of the Render Texture. Default 32.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, width: phaserLib.integer) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, width: phaserLib.integer, height: phaserLib.integer) = this()
  /**
    * An internal Camera that can be used to move around the Render Texture.
    * Control it just like you would any Scene Camera. The difference is that it only impacts the placement of what
    * is drawn to the Render Texture. You can scroll, zoom and rotate this Camera.
    */
  var camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.BaseCamera = js.native
  /**
    * The HTML Canvas Element that the Render Texture is drawing to when using the Canvas Renderer.
    */
  var canvas: stdLib.HTMLCanvasElement = js.native
  /**
    * A reference to the Rendering Context belonging to the Canvas Element this Render Texture is drawing to.
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
    * Is this Render Texture dirty or not? If not it won't spend time clearing or filling itself.
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
    * The Frame corresponding to this Render Texture.
    */
  var frame: phaserLib.PhaserNs.TexturesNs.Frame = js.native
  /**
    * A reference to the GL Frame Buffer this Render Texture is drawing to.
    * This is only set if Phaser is running with the WebGL Renderer.
    */
  var framebuffer: stdLib.WebGLFramebuffer = js.native
  /**
    * A reference to the WebGL Rendering Context.
    */
  var gl: stdLib.WebGLRenderingContext = js.native
  /**
    * The alpha of the Render Texture when rendered.
    */
  var globalAlpha: scala.Double = js.native
  /**
    * The tint of the Render Texture when rendered.
    */
  var globalTint: scala.Double = js.native
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
    * A reference to either the Canvas or WebGL Renderer that the Game instance is using.
    */
  var renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer | phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer = js.native
  /**
    * The Texture corresponding to this Render Texture.
    */
  var texture: phaserLib.PhaserNs.TexturesNs.Texture = js.native
  /**
    * A reference to the Texture Manager.
    */
  var textureManager: phaserLib.PhaserNs.TexturesNs.TextureManager = js.native
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
    * Clears the Render Texture.
    */
  def clear(): this.type = js.native
  /**
    * Draws the given object, or an array of objects, to this Render Texture.
    * 
    * It can accept any of the following:
    * 
    * * Any renderable Game Object, such as a Sprite, Text, Graphics or TileSprite.
    * * Dynamic and Static Tilemap Layers.
    * * A Group. The contents of which will be iterated and drawn in turn.
    * * A Container. The contents of which will be iterated fully, and drawn in turn.
    * * A Scene's Display List. Pass in `Scene.children` to draw the whole list.
    * * Another Render Texture.
    * * A Texture Frame instance.
    * * A string. This is used to look-up a texture from the Texture Manager.
    * 
    * Note: You cannot draw a Render Texture to itself.
    * 
    * If passing in a Group or Container it will only draw children that return `true`
    * when their `willRender()` method is called. I.e. a Container with 10 children,
    * 5 of which have `visible=false` will only draw the 5 visible ones.
    * 
    * If passing in an array of Game Objects it will draw them all, regardless if
    * they pass a `willRender` check or not.
    * 
    * You can pass in a string in which case it will look for a texture in the Texture
    * Manager matching that string, and draw the base frame. If you need to specify
    * exactly which frame to draw then use the method `drawFrame` instead.
    * 
    * You can pass in the `x` and `y` coordinates to draw the objects at. The use of
    * the coordinates differ based on what objects are being drawn. If the object is
    * a Group, Container or Display List, the coordinates are _added_ to the positions
    * of the children. For all other types of object, the coordinates are exact.
    * 
    * The `alpha` and `tint` values are only used by Texture Frames.
    * Game Objects use their own alpha and tint values when being drawn.
    * 
    * Calling this method causes the WebGL batch to flush, so it can write the texture
    * data to the framebuffer being used internally. The batch is flushed at the end,
    * after the entries have been iterated. So if you've a bunch of objects to draw,
    * try and pass them in an array in one single call, rather than making lots of
    * separate calls.
    * @param entries Any renderable Game Object, or Group, Container, Display List, other Render Texture, Texture Frame or an array of any of these.
    * @param x The x position to draw the Frame at, or the offset applied to the object.
    * @param y The y position to draw the Frame at, or the offset applied to the object.
    * @param alpha The alpha value. Only used for Texture Frames and if not specified defaults to the `globalAlpha` property. Game Objects use their own current alpha value.
    * @param tint WebGL only. The tint color value. Only used for Texture Frames and if not specified defaults to the `globalTint` property. Game Objects use their own current tint value.
    */
  def draw(entries: js.Any): this.type = js.native
  def draw(entries: js.Any, x: scala.Double): this.type = js.native
  def draw(entries: js.Any, x: scala.Double, y: scala.Double): this.type = js.native
  def draw(entries: js.Any, x: scala.Double, y: scala.Double, alpha: scala.Double): this.type = js.native
  def draw(entries: js.Any, x: scala.Double, y: scala.Double, alpha: scala.Double, tint: scala.Double): this.type = js.native
  /**
    * Draws the Texture Frame to the Render Texture at the given position.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * 
    * ```javascript
    * var rt = this.add.renderTexture(0, 0, 800, 600);
    * rt.drawFrame(key, frame);
    * ```
    * 
    * You can optionally provide a position, alpha and tint value to apply to the frame
    * before it is drawn.
    * 
    * Calling this method will cause a batch flush, so if you've got a stack of things to draw
    * in a tight loop, try using the `draw` method instead.
    * 
    * If you need to draw a Sprite to this Render Texture, use the `draw` method instead.
    * @param key The key of the texture to be used, as stored in the Texture Manager.
    * @param frame The name or index of the frame within the Texture.
    * @param x The x position to draw the frame at. Default 0.
    * @param y The y position to draw the frame at. Default 0.
    * @param alpha The alpha to use. If not specified it uses the `globalAlpha` property.
    * @param tint WebGL only. The tint color to use. If not specified it uses the `globalTint` property.
    */
  def drawFrame(key: java.lang.String): this.type = js.native
  def drawFrame(key: java.lang.String, frame: java.lang.String): this.type = js.native
  def drawFrame(key: java.lang.String, frame: java.lang.String, x: scala.Double): this.type = js.native
  def drawFrame(key: java.lang.String, frame: java.lang.String, x: scala.Double, y: scala.Double): this.type = js.native
  def drawFrame(
    key: java.lang.String,
    frame: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    alpha: scala.Double
  ): this.type = js.native
  def drawFrame(
    key: java.lang.String,
    frame: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    alpha: scala.Double,
    tint: scala.Double
  ): this.type = js.native
  def drawFrame(key: java.lang.String, frame: phaserLib.integer): this.type = js.native
  def drawFrame(key: java.lang.String, frame: phaserLib.integer, x: scala.Double): this.type = js.native
  def drawFrame(key: java.lang.String, frame: phaserLib.integer, x: scala.Double, y: scala.Double): this.type = js.native
  def drawFrame(
    key: java.lang.String,
    frame: phaserLib.integer,
    x: scala.Double,
    y: scala.Double,
    alpha: scala.Double
  ): this.type = js.native
  def drawFrame(
    key: java.lang.String,
    frame: phaserLib.integer,
    x: scala.Double,
    y: scala.Double,
    alpha: scala.Double,
    tint: scala.Double
  ): this.type = js.native
  /**
    * Draws the given object, or an array of objects, to this Render Texture using a blend mode of ERASE.
    * This has the effect of erasing any filled pixels in the objects from this Render Texture.
    * 
    * It can accept any of the following:
    * 
    * * Any renderable Game Object, such as a Sprite, Text, Graphics or TileSprite.
    * * Dynamic and Static Tilemap Layers.
    * * A Group. The contents of which will be iterated and drawn in turn.
    * * A Container. The contents of which will be iterated fully, and drawn in turn.
    * * A Scene's Display List. Pass in `Scene.children` to draw the whole list.
    * * Another Render Texture.
    * * A Texture Frame instance.
    * * A string. This is used to look-up a texture from the Texture Manager.
    * 
    * Note: You cannot erase a Render Texture from itself.
    * 
    * If passing in a Group or Container it will only draw children that return `true`
    * when their `willRender()` method is called. I.e. a Container with 10 children,
    * 5 of which have `visible=false` will only draw the 5 visible ones.
    * 
    * If passing in an array of Game Objects it will draw them all, regardless if
    * they pass a `willRender` check or not.
    * 
    * You can pass in a string in which case it will look for a texture in the Texture
    * Manager matching that string, and draw the base frame.
    * 
    * You can pass in the `x` and `y` coordinates to draw the objects at. The use of
    * the coordinates differ based on what objects are being drawn. If the object is
    * a Group, Container or Display List, the coordinates are _added_ to the positions
    * of the children. For all other types of object, the coordinates are exact.
    * 
    * Calling this method causes the WebGL batch to flush, so it can write the texture
    * data to the framebuffer being used internally. The batch is flushed at the end,
    * after the entries have been iterated. So if you've a bunch of objects to draw,
    * try and pass them in an array in one single call, rather than making lots of
    * separate calls.
    * @param entries Any renderable Game Object, or Group, Container, Display List, other Render Texture, Texture Frame or an array of any of these.
    * @param x The x position to draw the Frame at, or the offset applied to the object.
    * @param y The y position to draw the Frame at, or the offset applied to the object.
    */
  def erase(entries: js.Any): this.type = js.native
  def erase(entries: js.Any, x: scala.Double): this.type = js.native
  def erase(entries: js.Any, x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Fills the Render Texture with the given color.
    * @param rgb The color to fill the Render Texture with.
    * @param alpha The alpha value used by the fill. Default 1.
    * @param x The left coordinate of the fill rectangle. Default 0.
    * @param y The top coordinate of the fill rectangle. Default 0.
    * @param width The width of the fill rectangle. Default this.frame.cutWidth.
    * @param height The height of the fill rectangle. Default this.frame.cutHeight.
    */
  def fill(rgb: scala.Double): this.type = js.native
  def fill(rgb: scala.Double, alpha: scala.Double): this.type = js.native
  def fill(rgb: scala.Double, alpha: scala.Double, x: scala.Double): this.type = js.native
  def fill(rgb: scala.Double, alpha: scala.Double, x: scala.Double, y: scala.Double): this.type = js.native
  def fill(rgb: scala.Double, alpha: scala.Double, x: scala.Double, y: scala.Double, width: scala.Double): this.type = js.native
  def fill(
    rgb: scala.Double,
    alpha: scala.Double,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): this.type = js.native
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
    * Resizes the Render Texture to the new dimensions given.
    * 
    * If Render Texture was created from specific frame, only the size of the frame will be changed. The size of the source
    * texture will not change.
    * 
    * If Render Texture was not created from specific frame, the following will happen:
    * In WebGL it will destroy and then re-create the frame buffer being used by the Render Texture.
    * In Canvas it will resize the underlying canvas element.
    * Both approaches will erase everything currently drawn to the Render Texture.
    * 
    * If the dimensions given are the same as those already being used, calling this method will do nothing.
    * @param width The new width of the Render Texture.
    * @param height The new height of the Render Texture. If not specified, will be set the same as the `width`.
    */
  def resize(width: scala.Double): this.type = js.native
  def resize(width: scala.Double, height: scala.Double): this.type = js.native
  /**
    * Stores a copy of this Render Texture in the Texture Manager using the given key.
    * 
    * After doing this, any texture based Game Object, such as a Sprite, can use the contents of this
    * Render Texture by using the texture key:
    * 
    * ```javascript
    * var rt = this.add.renderTexture(0, 0, 128, 128);
    * 
    * // Draw something to the Render Texture
    * 
    * rt.saveTexture('doodle');
    * 
    * this.add.image(400, 300, 'doodle');
    * ```
    * 
    * Updating the contents of this Render Texture will automatically update _any_ Game Object
    * that is using it as a texture. Calling `saveTexture` again will not save another copy
    * of the same texture, it will just rename the key of the existing copy.
    * 
    * By default it will create a single base texture. You can add frames to the texture
    * by using the `Texture.add` method. After doing this, you can then allow Game Objects
    * to use a specific frame from a Render Texture.
    * @param key The unique key to store the texture as within the global Texture Manager.
    */
  def saveTexture(key: java.lang.String): phaserLib.PhaserNs.TexturesNs.Texture = js.native
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
    * Set the alpha to use when rendering this Render Texture.
    * @param alpha The alpha value.
    */
  def setGlobalAlpha(alpha: scala.Double): this.type = js.native
  /**
    * Set the tint to use when rendering this Render Texture.
    * @param tint The tint value.
    */
  def setGlobalTint(tint: phaserLib.integer): this.type = js.native
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

