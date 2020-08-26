package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.Text.TextMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typings.phaser.Phaser.GameObjects.Text {
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
}

/* static members */
@JSImport("phaser", "GameObjects.Text")
@js.native
object Text extends js.Object {
  /**
    * Returns an object containing dimensions of the Text object.
    * @param text The Text object to calculate the size from.
    * @param size The Text metrics to use when calculating the size.
    * @param lines The lines of text to calculate the size from.
    */
  def GetTextSize(text: typings.phaser.Phaser.GameObjects.Text, size: TextMetrics, lines: js.Array[_]): js.Object = js.native
  /**
    * Calculates the ascent, descent and fontSize of a given font style.
    * @param textStyle The TextStyle object to measure.
    */
  def MeasureText(textStyle: typings.phaser.Phaser.GameObjects.TextStyle): TextMetrics = js.native
}

