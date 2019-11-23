package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Texture
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.BitmapText.BitmapFontData
import typings.phaser.Phaser.Types.GameObjects.BitmapText.BitmapTextSize
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BitmapText objects work by taking a texture file and an XML or JSON file that describes the font structure.
  * 
  * During rendering for each letter of the text is rendered to the display, proportionally spaced out and aligned to
  * match the font structure.
  * 
  * BitmapText objects are less flexible than Text objects, in that they have less features such as shadows, fills and the ability
  * to use Web Fonts, however you trade this flexibility for rendering speed. You can also create visually compelling BitmapTexts by
  * processing the font texture in an image editor, applying fills and any other effects required.
  * 
  * To create multi-line text insert \r, \n or \r\n escape codes into the text string.
  * 
  * To create a BitmapText data files you need a 3rd party app such as:
  * 
  * BMFont (Windows, free): {@link http://www.angelcode.com/products/bmfont/|http://www.angelcode.com/products/bmfont/}
  * Glyph Designer (OS X, commercial): {@link http://www.71squared.com/en/glyphdesigner|http://www.71squared.com/en/glyphdesigner}
  * Littera (Web-based, free): {@link http://kvazars.com/littera/|http://kvazars.com/littera/}
  * 
  * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
  * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: {@link http://codebeautify.org/xmltojson|http://codebeautify.org/xmltojson}
  */
@JSGlobal("Phaser.GameObjects.BitmapText")
@js.native
class BitmapText protected ()
  extends GameObject
     with Alpha
     with BlendMode
     with Depth
     with Mask
     with Origin
     with Pipeline
     with ScrollFactor
     with Texture
     with Tint
     with Transform
     with Visible {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. It can only belong to one Scene at any given time.
    * @param x The x coordinate of this Game Object in world space.
    * @param y The y coordinate of this Game Object in world space.
    * @param font The key of the font to use from the Bitmap Font cache.
    * @param text The string, or array of strings, to be set as the content of this Bitmap Text.
    * @param size The font size of this Bitmap Text.
    * @param align The alignment of the text in a multi-line BitmapText object. Default 0.
    */
  def this(scene: Scene, x: Double, y: Double, font: String) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: String) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: js.Array[String]) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: String, size: Double) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: js.Array[String], size: Double) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: String, size: Double, align: integer) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    font: String,
    text: js.Array[String],
    size: Double,
    align: integer
  ) = this()
  /**
    * Controls the alignment of each line of text in this BitmapText object.
    * 
    * Only has any effect when this BitmapText contains multiple lines of text, split with carriage-returns.
    * Has no effect with single-lines of text.
    * 
    * See the methods `setLeftAlign`, `setCenterAlign` and `setRightAlign`.
    * 
    * 0 = Left aligned (default)
    * 1 = Middle aligned
    * 2 = Right aligned
    * 
    * The alignment position is based on the longest line of text.
    */
  var align: integer = js.native
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
  override var depth: Double = js.native
  /**
    * The key of the Bitmap Font used by this Bitmap Text.
    * To change the font after creation please use `setFont`.
    */
  val font: String = js.native
  /**
    * The data of the Bitmap Font used by this Bitmap Text.
    */
  val fontData: BitmapFontData = js.native
  /**
    * The font size of this Bitmap Text.
    * 
    * You can also use the method `setFontSize` if you want a chainable way to change the font size.
    */
  var fontSize: Double = js.native
  /**
    * The height of this bitmap text.
    */
  val height: Double = js.native
  /**
    * Adds / Removes spacing between characters.
    * 
    * Can be a negative or positive number.
    * 
    * You can also use the method `setLetterSpacing` if you want a chainable way to change the letter spacing.
    */
  var letterSpacing: Double = js.native
  /**
    * The maximum display width of this BitmapText in pixels.
    * 
    * If BitmapText.text is longer than maxWidth then the lines will be automatically wrapped
    * based on the last whitespace character found in the line.
    * 
    * If no whitespace was found then no wrapping will take place and consequently the maxWidth value will not be honored.
    * 
    * Disable maxWidth by setting the value to 0.
    */
  var maxWidth: Double = js.native
  /**
    * The text that this Bitmap Text object displays.
    * 
    * You can also use the method `setText` if you want a chainable way to change the text content.
    */
  var text: String = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * The width of this Bitmap Text.
    */
  val width: Double = js.native
  /**
    * The character code used to detect for word wrapping.
    * Defaults to 32 (a space character).
    */
  var wordWrapCharCode: Double = js.native
  /**
    * Calculate the bounds of this Bitmap Text.
    * 
    * An object is returned that contains the position, width and height of the Bitmap Text in local and global
    * contexts.
    * 
    * Local size is based on just the font size and a [0, 0] position.
    * 
    * Global size takes into account the Game Object's scale, world position and display origin.
    * 
    * Also in the object is data regarding the length of each line, should this be a multi-line BitmapText.
    * @param round Whether to round the results to the nearest integer.
    */
  def getTextBounds(): BitmapTextSize = js.native
  def getTextBounds(round: Boolean): BitmapTextSize = js.native
  /**
    * Set the lines of text in this BitmapText to be center-aligned.
    * This only has any effect if this BitmapText contains more than one line of text.
    */
  def setCenterAlign(): this.type = js.native
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
  override def setDepth(value: integer): this.type = js.native
  /**
    * Changes the font this BitmapText is using to render.
    * 
    * The new texture is loaded and applied to the BitmapText. The existing test, size and alignment are preserved,
    * unless overridden via the arguments.
    * @param font The key of the font to use from the Bitmap Font cache.
    * @param size The font size of this Bitmap Text. If not specified the current size will be used.
    * @param align The alignment of the text in a multi-line BitmapText object. If not specified the current alignment will be used. Default 0.
    */
  def setFont(font: String): this.type = js.native
  def setFont(font: String, size: Double): this.type = js.native
  def setFont(font: String, size: Double, align: integer): this.type = js.native
  /**
    * Set the font size of this Bitmap Text.
    * @param size The font size to set.
    */
  def setFontSize(size: Double): this.type = js.native
  /**
    * Set the lines of text in this BitmapText to be left-aligned.
    * This only has any effect if this BitmapText contains more than one line of text.
    */
  def setLeftAlign(): this.type = js.native
  /**
    * Sets the letter spacing between each character of this Bitmap Text.
    * Can be a positive value to increase the space, or negative to reduce it.
    * Spacing is applied after the kerning values have been set.
    * @param spacing The amount of horizontal space to add between each character. Default 0.
    */
  def setLetterSpacing(): this.type = js.native
  def setLetterSpacing(spacing: Double): this.type = js.native
  /**
    * Sets the maximum display width of this BitmapText in pixels.
    * 
    * If `BitmapText.text` is longer than `maxWidth` then the lines will be automatically wrapped
    * based on the previous whitespace character found in the line.
    * 
    * If no whitespace was found then no wrapping will take place and consequently the `maxWidth` value will not be honored.
    * 
    * Disable maxWidth by setting the value to 0.
    * 
    * You can set the whitespace character to be searched for by setting the `wordWrapCharCode` parameter or property.
    * @param value The maximum display width of this BitmapText in pixels. Set to zero to disable.
    * @param wordWrapCharCode The character code to check for when word wrapping. Defaults to 32 (the space character).
    */
  def setMaxWidth(value: Double): this.type = js.native
  def setMaxWidth(value: Double, wordWrapCharCode: Double): this.type = js.native
  /**
    * Set the lines of text in this BitmapText to be right-aligned.
    * This only has any effect if this BitmapText contains more than one line of text.
    */
  def setRightAlign(): this.type = js.native
  /**
    * Set the textual content of this BitmapText.
    * 
    * An array of strings will be converted into multi-line text. Use the align methods to change multi-line alignment.
    * @param value The string, or array of strings, to be set as the content of this BitmapText.
    */
  def setText(value: String): this.type = js.native
  def setText(value: js.Array[String]): this.type = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
}

/* static members */
@JSGlobal("Phaser.GameObjects.BitmapText")
@js.native
object BitmapText extends js.Object {
  /**
    * Center align the text characters in a multi-line BitmapText object.
    */
  var ALIGN_CENTER: integer = js.native
  /**
    * Left align the text characters in a multi-line BitmapText object.
    */
  var ALIGN_LEFT: integer = js.native
  /**
    * Right align the text characters in a multi-line BitmapText object.
    */
  var ALIGN_RIGHT: integer = js.native
  /**
    * Parse an XML Bitmap Font from an Atlas.
    * 
    * Adds the parsed Bitmap Font data to the cache with the `fontName` key.
    */
  var ParseFromAtlas: js.Function = js.native
  /**
    * Parse an XML font to Bitmap Font data for the Bitmap Font cache.
    */
  var ParseXMLBitmapFont: js.Function = js.native
}

