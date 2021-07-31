package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.Text.TextMetrics
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Text Game Object.
  * 
  * Text objects work by creating their own internal hidden Canvas and then renders text to it using
  * the standard Canvas `fillText` API. It then creates a texture from this canvas which is rendered
  * to your game during the render pass.
  * 
  * Because it uses the Canvas API you can take advantage of all the features this offers, such as
  * applying gradient fills to the text, or strokes, shadows and more. You can also use custom fonts
  * loaded externally, such as Google or TypeKit Web fonts.
  * 
  * **Important:** The font name must be quoted if it contains certain combinations of digits or
  * special characters, either when creating the Text object, or when setting the font via `setFont`
  * or `setFontFamily`, e.g.:
  * 
  * ```javascript
  * this.add.text(0, 0, 'Hello World', { fontFamily: 'Georgia, "Goudy Bookletter 1911", Times, serif' });
  * ```
  * 
  * ```javascript
  * this.add.text(0, 0, 'Hello World', { font: '"Press Start 2P"' });
  * ```
  * 
  * You can only display fonts that are currently loaded and available to the browser: therefore fonts must
  * be pre-loaded. Phaser does not do ths for you, so you will require the use of a 3rd party font loader,
  * or have the fonts ready available in the CSS on the page in which your Phaser game resides.
  * 
  * See {@link http://www.jordanm.co.uk/tinytype this compatibility table} for the available default fonts
  * across mobile browsers.
  * 
  * A note on performance: Every time the contents of a Text object changes, i.e. changing the text being
  * displayed, or the style of the text, it needs to remake the Text canvas, and if on WebGL, re-upload the
  * new texture to the GPU. This can be an expensive operation if used often, or with large quantities of
  * Text objects in your game. If you run into performance issues you would be better off using Bitmap Text
  * instead, as it benefits from batching and avoids expensive Canvas API calls.
  */
@JSImport("phaser", "GameObjects.Text")
@js.native
class Text protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Text {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param text The text this Text object will display.
    * @param style The text style configuration object.
    */
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    text: String,
    style: typings.phaser.Phaser.Types.GameObjects.Text.TextStyle
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    text: js.Array[String],
    style: typings.phaser.Phaser.Types.GameObjects.Text.TextStyle
  ) = this()
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  var depth: Double = js.native
  
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  var displayHeight: Double = js.native
  
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  var displayWidth: Double = js.native
  
  /**
    * The horizontally flipped state of the Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  var flipX: Boolean = js.native
  
  /**
    * The vertically flipped state of the Game Object.
    * 
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  var flipY: Boolean = js.native
  
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  var height: Double = js.native
  
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
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: integer): this.type = js.native
  
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setDisplaySize(width: Double, height: Double): this.type = js.native
  
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * 
    * A Game Object that is flipped will render inversed on the flipped axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlip(x: Boolean, y: Boolean): this.type = js.native
  
  /**
    * Sets the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipX(value: Boolean): this.type = js.native
  
  /**
    * Sets the vertical flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipY(value: Boolean): this.type = js.native
  
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
  override def setSize(width: Double, height: Double): this.type = js.native
  
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  
  /**
    * Toggles the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  override def toggleFlipX(): this.type = js.native
  
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipY(): this.type = js.native
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
  
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  var width: Double = js.native
}
object Text {
  
  @JSImport("phaser", "GameObjects.Text")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an object containing dimensions of the Text object.
    * @param text The Text object to calculate the size from.
    * @param size The Text metrics to use when calculating the size.
    * @param lines The lines of text to calculate the size from.
    */
  /* static member */
  @scala.inline
  def GetTextSize(text: typings.phaser.Phaser.GameObjects.Text, size: TextMetrics, lines: js.Array[js.Any]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTextSize")(text.asInstanceOf[js.Any], size.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  /**
    * Calculates the ascent, descent and fontSize of a given font style.
    * @param textStyle The TextStyle object to measure.
    */
  /* static member */
  @scala.inline
  def MeasureText(textStyle: typings.phaser.Phaser.GameObjects.TextStyle): TextMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("MeasureText")(textStyle.asInstanceOf[js.Any]).asInstanceOf[TextMetrics]
}
