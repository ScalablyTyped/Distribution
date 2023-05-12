package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.PostPipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Texture
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Types.GameObjects.BitmapText.BitmapFontData
import typings.phaser.Phaser.Types.GameObjects.BitmapText.BitmapTextCharacter
import typings.phaser.Phaser.Types.GameObjects.BitmapText.BitmapTextSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * Snow BMF (Web-based, free): {@link https://snowb.org//|https://snowb.org/}
  * Littera (Flash-based, free): {@link http://kvazars.com/littera/|http://kvazars.com/littera/}
  * 
  * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
  * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: {@link http://codebeautify.org/xmltojson|http://codebeautify.org/xmltojson}
  */
@js.native
trait BitmapText
  extends StObject
     with GameObject
     with Alpha
     with BlendMode
     with Depth
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with PostPipeline
     with ScrollFactor
     with Texture
     with Tint
     with Transform
     with Visible {
  
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
  var align: Double = js.native
  
  /**
    * The displayed height of this Bitmap Text.
    * 
    * This value takes into account the scale factor.
    * 
    * This property is read-only.
    */
  val displayHeight: Double = js.native
  
  /**
    * The displayed width of this Bitmap Text.
    * 
    * This value takes into account the scale factor.
    * 
    * This property is read-only.
    */
  val displayWidth: Double = js.native
  
  /**
    * The alpha value of the drop shadow.
    * 
    * You can set this directly, or use `Phaser.GameObjects.BitmapText#setDropShadow`.
    */
  var dropShadowAlpha: Double = js.native
  
  /**
    * The color of the drop shadow.
    * 
    * You can set this directly, or use `Phaser.GameObjects.BitmapText#setDropShadow`.
    */
  var dropShadowColor: Double = js.native
  
  /**
    * The horizontal offset of the drop shadow.
    * 
    * You can set this directly, or use `Phaser.GameObjects.BitmapText#setDropShadow`.
    */
  var dropShadowX: Double = js.native
  
  /**
    * The vertical offset of the drop shadow.
    * 
    * You can set this directly, or use `Phaser.GameObjects.BitmapText#setDropShadow`.
    */
  var dropShadowY: Double = js.native
  
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
    * Indicates whether the font texture is from an atlas or not.
    */
  val fromAtlas: Boolean = js.native
  
  /**
    * Gets the character located at the given x/y coordinate within this Bitmap Text.
    * 
    * The coordinates you pass in are translated into the local space of the
    * Bitmap Text, however, it is up to you to first translate the input coordinates to world space.
    * 
    * If you wish to use this in combination with an input event, be sure
    * to pass in `Pointer.worldX` and `worldY` so they are in world space.
    * 
    * In some cases, based on kerning, characters can overlap. When this happens,
    * the first character in the word is returned.
    * 
    * Note that this does not work for DynamicBitmapText if you have changed the
    * character positions during render. It will only scan characters in their un-translated state.
    * @param x The x position to check.
    * @param y The y position to check.
    * @param camera The Camera which is being tested against. If not given will use the Scene default camera.
    */
  def getCharacterAt(x: Double, y: Double): BitmapTextCharacter = js.native
  def getCharacterAt(x: Double, y: Double, camera: Camera): BitmapTextCharacter = js.native
  
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
    * @param round Whether to round the results up to the nearest integer. Default false.
    */
  def getTextBounds(): BitmapTextSize = js.native
  def getTextBounds(round: Boolean): BitmapTextSize = js.native
  
  /**
    * The height of this Bitmap text.
    * 
    * This property is read-only.
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
    * Adds / Removes spacing between lines.
    * 
    * Can be a negative or positive number.
    * 
    * You can also use the method `setLineSpacing` if you want a chainable way to change the line spacing.
    */
  var lineSpacing: Double = js.native
  
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
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
  
  /**
    * Set the lines of text in this BitmapText to be center-aligned.
    * This only has any effect if this BitmapText contains more than one line of text.
    */
  def setCenterAlign(): this.type = js.native
  
  /**
    * Sets a tint on a range of characters in this Bitmap Text, starting from the `start` parameter index
    * and running for `length` quantity of characters.
    * 
    * The `start` parameter can be negative. In this case, it starts at the end of the text and counts
    * backwards `start` places.
    * 
    * You can also pass in -1 as the `length` and it will tint all characters from `start`
    * up until the end of the string.
    * Remember that spaces and punctuation count as characters.
    * 
    * This is a WebGL only feature and only works with Static Bitmap Text, not Dynamic.
    * 
    * The tint works by taking the pixel color values from the Bitmap Text texture, and then
    * multiplying it by the color value of the tint. You can provide either one color value,
    * in which case the whole character will be tinted in that color. Or you can provide a color
    * per corner. The colors are blended together across the extent of the character range.
    * 
    * To swap this from being an additive tint to a fill based tint, set the `tintFill` parameter to `true`.
    * 
    * To modify the tint color once set, call this method again with new color values.
    * 
    * Using `setWordTint` can override tints set by this function, and vice versa.
    * 
    * To remove a tint call this method with just the `start`, and optionally, the `length` parameters defined.
    * @param start The starting character to begin the tint at. If negative, it counts back from the end of the text. Default 0.
    * @param length The number of characters to tint. Remember that spaces count as a character too. Pass -1 to tint all characters from `start` onwards. Default 1.
    * @param tintFill Use a fill-based tint (true), or an additive tint (false) Default false.
    * @param topLeft The tint being applied to the top-left of the character. If not other values are given this value is applied evenly, tinting the whole character. Default 0xffffff.
    * @param topRight The tint being applied to the top-right of the character.
    * @param bottomLeft The tint being applied to the bottom-left of the character.
    * @param bottomRight The tint being applied to the bottom-right of the character.
    */
  def setCharacterTint(
    start: js.UndefOr[Double],
    length: js.UndefOr[Double],
    tintFill: js.UndefOr[Boolean],
    topLeft: js.UndefOr[Double],
    topRight: js.UndefOr[Double],
    bottomLeft: js.UndefOr[Double],
    bottomRight: js.UndefOr[Double]
  ): this.type = js.native
  
  /**
    * Sets a drop shadow effect on this Bitmap Text.
    * 
    * This is a WebGL only feature and only works with Static Bitmap Text, not Dynamic.
    * 
    * You can set the vertical and horizontal offset of the shadow, as well as the color and alpha.
    * 
    * Once a shadow has been enabled you can modify the `dropShadowX` and `dropShadowY` properties of this
    * Bitmap Text directly to adjust the position of the shadow in real-time.
    * 
    * If you wish to clear the shadow, call this method with no parameters specified.
    * @param x The horizontal offset of the drop shadow. Default 0.
    * @param y The vertical offset of the drop shadow. Default 0.
    * @param color The color of the drop shadow, given as a hex value, i.e. `0x000000` for black. Default 0x000000.
    * @param alpha The alpha of the drop shadow, given as a float between 0 and 1. This is combined with the Bitmap Text alpha as well. Default 0.5.
    */
  def setDropShadow(): this.type = js.native
  def setDropShadow(x: Double): this.type = js.native
  def setDropShadow(x: Double, y: Double): this.type = js.native
  def setDropShadow(x: Double, y: Double, color: Double): this.type = js.native
  def setDropShadow(x: Double, y: Double, color: Double, alpha: Double): this.type = js.native
  def setDropShadow(x: Double, y: Double, color: Unit, alpha: Double): this.type = js.native
  def setDropShadow(x: Double, y: Unit, color: Double): this.type = js.native
  def setDropShadow(x: Double, y: Unit, color: Double, alpha: Double): this.type = js.native
  def setDropShadow(x: Double, y: Unit, color: Unit, alpha: Double): this.type = js.native
  def setDropShadow(x: Unit, y: Double): this.type = js.native
  def setDropShadow(x: Unit, y: Double, color: Double): this.type = js.native
  def setDropShadow(x: Unit, y: Double, color: Double, alpha: Double): this.type = js.native
  def setDropShadow(x: Unit, y: Double, color: Unit, alpha: Double): this.type = js.native
  def setDropShadow(x: Unit, y: Unit, color: Double): this.type = js.native
  def setDropShadow(x: Unit, y: Unit, color: Double, alpha: Double): this.type = js.native
  def setDropShadow(x: Unit, y: Unit, color: Unit, alpha: Double): this.type = js.native
  
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
  def setFont(font: String, size: Double, align: Double): this.type = js.native
  def setFont(font: String, size: Unit, align: Double): this.type = js.native
  
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
    * Sets the line spacing value. This value is added to the font height to
    * calculate the overall line height.
    * 
    * Spacing can be a negative or positive number.
    * 
    * Only has an effect if this BitmapText object contains multiple lines of text.
    * @param spacing The amount of space to add between each line in multi-line text. Default 0.
    */
  def setLineSpacing(): this.type = js.native
  def setLineSpacing(spacing: Double): this.type = js.native
  
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
    * Sets a tint on a matching word within this Bitmap Text.
    * 
    * The `word` parameter can be either a string or a number.
    * 
    * If a string, it will run a string comparison against the text contents, and if matching,
    * it will tint the whole word.
    * 
    * If a number, if till that word, based on its offset within the text contents.
    * 
    * The `count` parameter controls how many words are replaced. Pass in -1 to replace them all.
    * 
    * This parameter is ignored if you pass a number as the `word` to be searched for.
    * 
    * This is a WebGL only feature and only works with Static Bitmap Text, not Dynamic.
    * 
    * The tint works by taking the pixel color values from the Bitmap Text texture, and then
    * multiplying it by the color value of the tint. You can provide either one color value,
    * in which case the whole character will be tinted in that color. Or you can provide a color
    * per corner. The colors are blended together across the extent of the character range.
    * 
    * To swap this from being an additive tint to a fill based tint, set the `tintFill` parameter to `true`.
    * 
    * To modify the tint color once set, call this method again with new color values.
    * 
    * Using `setCharacterTint` can override tints set by this function, and vice versa.
    * @param word The word to search for. Either a string, or an index of the word in the words array.
    * @param count The number of matching words to tint. Pass -1 to tint all matching words. Default 1.
    * @param tintFill Use a fill-based tint (true), or an additive tint (false) Default false.
    * @param topLeft The tint being applied to the top-left of the word. If not other values are given this value is applied evenly, tinting the whole word. Default 0xffffff.
    * @param topRight The tint being applied to the top-right of the word.
    * @param bottomLeft The tint being applied to the bottom-left of the word.
    * @param bottomRight The tint being applied to the bottom-right of the word.
    */
  def setWordTint(
    word: String | Double,
    count: js.UndefOr[Double],
    tintFill: js.UndefOr[Boolean],
    topLeft: js.UndefOr[Double],
    topRight: js.UndefOr[Double],
    bottomLeft: js.UndefOr[Double],
    bottomRight: js.UndefOr[Double]
  ): this.type = js.native
  
  /**
    * The text that this Bitmap Text object displays.
    * 
    * You can also use the method `setText` if you want a chainable way to change the text content.
    */
  var text: String = js.native
  
  /**
    * The width of this Bitmap Text.
    * 
    * This property is read-only.
    */
  val width: Double = js.native
  
  /**
    * The character code used to detect for word wrapping.
    * Defaults to 32 (a space character).
    */
  var wordWrapCharCode: Double = js.native
}
