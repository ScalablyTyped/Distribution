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
import typings.phaser.Phaser.Types.GameObjects.Text.TextMetrics
import typings.phaser.Phaser.Types.GameObjects.Text.TextPadding
import typings.phaser.TextStyleWordWrapCallback
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
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
@js.native
trait Text
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
    * Whether to automatically round line positions.
    */
  var autoRound: Boolean = js.native
  /**
    * The canvas element that the text is rendered to.
    */
  var canvas: HTMLCanvasElement = js.native
  /**
    * The context of the canvas element that the text is rendered to.
    */
  var context: CanvasRenderingContext2D = js.native
  /**
    * Whether the text or its settings have changed and need updating.
    */
  var dirty: Boolean = js.native
  /**
    * The line spacing value.
    * This value is added to the font height to calculate the overall line height.
    * Only has an effect if this Text object contains multiple lines of text.
    * 
    * If you update this property directly, instead of using the `setLineSpacing` method, then
    * be sure to call `updateText` after, or you won't see the change reflected in the Text object.
    */
  var lineSpacing: Double = js.native
  /**
    * Specify a padding value which is added to the line width and height when calculating the Text size.
    * Allows you to add extra spacing if the browser is unable to accurately determine the true font dimensions.
    */
  var padding: js.Object = js.native
  /**
    * The renderer in use by this Text object.
    */
  var renderer: CanvasRenderer | WebGLRenderer = js.native
  /**
    * The Regular Expression that is used to split the text up into lines, in
    * multi-line text. By default this is `/(?:\r\n|\r|\n)/`.
    * You can change this RegExp to be anything else that you may need.
    */
  var splitRegExp: js.Object = js.native
  /**
    * The Text Style object.
    * 
    * Manages the style of this Text object.
    */
  var style: TextStyle = js.native
  /**
    * The text string being rendered by this Text Game Object.
    */
  var text: String = js.native
  /**
    * Advanced wrapping algorithm that will wrap words as the line grows longer than its horizontal
    * bounds. Consecutive spaces will be collapsed and replaced with a single space. Lines will be
    * trimmed of white space before processing. Throws an error if wordWrapWidth is less than a
    * single character.
    * @param text The text to perform word wrap detection against.
    * @param context The Canvas Rendering Context.
    * @param wordWrapWidth The word wrap width.
    */
  def advancedWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Double): String = js.native
  /**
    * Greedy wrapping algorithm that will wrap words as the line grows longer than its horizontal
    * bounds. Spaces are not collapsed and whitespace is not trimmed.
    * @param text The text to perform word wrap detection against.
    * @param context The Canvas Rendering Context.
    * @param wordWrapWidth The word wrap width.
    */
  def basicWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Double): String = js.native
  /**
    * Get the current text metrics.
    */
  def getTextMetrics(): TextMetrics = js.native
  /**
    * Runs the given text through this Text objects word wrapping and returns the results as an
    * array, where each element of the array corresponds to a wrapped line of text.
    * @param text The text for which the wrapping will be calculated. If unspecified, the Text objects current text will be used.
    */
  def getWrappedText(text: String): js.Array[String] = js.native
  /**
    * Initialize right to left text.
    */
  def initRTL(): Unit = js.native
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
  /**
    * Greedy wrapping algorithm that will wrap words as the line grows longer than its horizontal
    * bounds.
    * @param text The text to perform word wrap detection against.
    */
  def runWordWrap(text: String): String = js.native
  /**
    * Set the alignment of the text in this Text object.
    * 
    * The argument can be one of: `left`, `right`, `center` or `justify`.
    * 
    * Alignment only works if the Text object has more than one line of text.
    * @param align The text alignment for multi-line text. Default 'left'.
    */
  def setAlign(): this.type = js.native
  def setAlign(align: String): this.type = js.native
  /**
    * Set the background color.
    * @param color The background color.
    */
  def setBackgroundColor(color: String): this.type = js.native
  /**
    * Set the text fill color.
    * @param color The text fill color.
    */
  def setColor(color: String): this.type = js.native
  /**
    * Set the fill style to be used by the Text object.
    * 
    * This can be any valid CanvasRenderingContext2D fillStyle value, such as
    * a color (in hex, rgb, rgba, hsl or named values), a gradient or a pattern.
    * 
    * See the [MDN fillStyle docs](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle) for more details.
    * @param color The text fill style. Can be any valid CanvasRenderingContext `fillStyle` value.
    */
  def setFill(color: String): this.type = js.native
  def setFill(color: js.Any): this.type = js.native
  /**
    * Set a fixed width and height for the text.
    * 
    * Pass in `0` for either of these parameters to disable fixed width or height respectively.
    * @param width The fixed width to set. `0` disables fixed width.
    * @param height The fixed height to set. `0` disables fixed height.
    */
  def setFixedSize(width: Double, height: Double): this.type = js.native
  /**
    * Set the font.
    * 
    * If a string is given, the font family is set.
    * 
    * If an object is given, the `fontFamily`, `fontSize` and `fontStyle`
    * properties of that object are set.
    * 
    * **Important:** The font name must be quoted if it contains certain combinations of digits or
    * special characters:
    * 
    * ```javascript
    * Text.setFont('"Press Start 2P"');
    * ```
    * 
    * Equally, if you wish to provide a list of fallback fonts, then you should ensure they are all
    * quoted properly, too:
    * 
    * ```javascript
    * Text.setFont('Georgia, "Goudy Bookletter 1911", Times, serif');
    * ```
    * @param font The font family or font settings to set.
    */
  def setFont(font: String): this.type = js.native
  /**
    * Set the font family.
    * 
    * **Important:** The font name must be quoted if it contains certain combinations of digits or
    * special characters:
    * 
    * ```javascript
    * Text.setFont('"Press Start 2P"');
    * ```
    * 
    * Equally, if you wish to provide a list of fallback fonts, then you should ensure they are all
    * quoted properly, too:
    * 
    * ```javascript
    * Text.setFont('Georgia, "Goudy Bookletter 1911", Times, serif');
    * ```
    * @param family The font family.
    */
  def setFontFamily(family: String): this.type = js.native
  /**
    * Set the font size.
    * @param size The font size.
    */
  def setFontSize(size: Double): this.type = js.native
  /**
    * Set the font style.
    * @param style The font style.
    */
  def setFontStyle(style: String): this.type = js.native
  /**
    * Sets the line spacing value.
    * 
    * This value is _added_ to the height of the font when calculating the overall line height.
    * This only has an effect if this Text object consists of multiple lines of text.
    * @param value The amount to add to the font height to achieve the overall line height.
    */
  def setLineSpacing(value: Double): this.type = js.native
  /**
    * Set the maximum number of lines to draw.
    * @param max The maximum number of lines to draw. Default 0.
    */
  def setMaxLines(): this.type = js.native
  def setMaxLines(max: integer): this.type = js.native
  /**
    * Set the text padding.
    * 
    * 'left' can be an object.
    * 
    * If only 'left' and 'top' are given they are treated as 'x' and 'y'.
    * @param left The left padding value, or a padding config object.
    * @param top The top padding value.
    * @param right The right padding value.
    * @param bottom The bottom padding value.
    */
  def setPadding(left: Double, top: Double, right: Double, bottom: Double): this.type = js.native
  def setPadding(left: TextPadding, top: Double, right: Double, bottom: Double): this.type = js.native
  /**
    * Set the resolution used by this Text object.
    * 
    * By default it will be set to match the resolution set in the Game Config,
    * but you can override it via this method, or by specifying it in the Text style configuration object.
    * 
    * It allows for much clearer text on High DPI devices, at the cost of memory because it uses larger
    * internal Canvas textures for the Text.
    * 
    * Therefore, please use with caution, as the more high res Text you have, the more memory it uses.
    * @param value The resolution for this Text object to use.
    */
  def setResolution(value: Double): this.type = js.native
  /**
    * Set the shadow settings.
    * @param x The horizontal shadow offset. Default 0.
    * @param y The vertical shadow offset. Default 0.
    * @param color The shadow color. Default '#000'.
    * @param blur The shadow blur radius. Default 0.
    * @param shadowStroke Whether to stroke the shadow. Default false.
    * @param shadowFill Whether to fill the shadow. Default true.
    */
  def setShadow(
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    color: js.UndefOr[String],
    blur: js.UndefOr[Double],
    shadowStroke: js.UndefOr[Boolean],
    shadowFill: js.UndefOr[Boolean]
  ): this.type = js.native
  /**
    * Set the shadow blur radius.
    * @param blur The shadow blur radius.
    */
  def setShadowBlur(blur: Double): this.type = js.native
  /**
    * Set the shadow color.
    * @param color The shadow color.
    */
  def setShadowColor(color: String): this.type = js.native
  /**
    * Enable or disable shadow fill.
    * @param enabled Whether shadow fill is enabled or not.
    */
  def setShadowFill(enabled: Boolean): this.type = js.native
  /**
    * Set the shadow offset.
    * @param x The horizontal shadow offset.
    * @param y The vertical shadow offset.
    */
  def setShadowOffset(x: Double, y: Double): this.type = js.native
  /**
    * Enable or disable shadow stroke.
    * @param enabled Whether shadow stroke is enabled or not.
    */
  def setShadowStroke(enabled: Boolean): this.type = js.native
  /**
    * Set the stroke settings.
    * @param color The stroke color.
    * @param thickness The stroke thickness.
    */
  def setStroke(color: String, thickness: Double): this.type = js.native
  /**
    * Set the text style.
    * @param style The style settings to set.
    */
  def setStyle(style: js.Object): this.type = js.native
  /**
    * Set the text to display.
    * 
    * An array of strings will be joined with `\n` line breaks.
    * @param value The string, or array of strings, to be set as the content of this Text object.
    */
  def setText(value: String): this.type = js.native
  def setText(value: js.Array[String]): this.type = js.native
  /**
    * Set a custom callback for wrapping lines. Pass in null to remove wrapping by callback.
    * @param callback A custom function that will be responsible for wrapping the
    * text. It will receive two arguments: text (the string to wrap), textObject (this Text
    * instance). It should return the wrapped lines either as an array of lines or as a string with
    * newline characters in place to indicate where breaks should happen.
    * @param scope The scope that will be applied when the callback is invoked. Default null.
    */
  def setWordWrapCallback(callback: TextStyleWordWrapCallback): this.type = js.native
  def setWordWrapCallback(callback: TextStyleWordWrapCallback, scope: js.Object): this.type = js.native
  /**
    * Set the width (in pixels) to use for wrapping lines. Pass in null to remove wrapping by width.
    * @param width The maximum width of a line in pixels. Set to null to remove wrapping.
    * @param useAdvancedWrap Whether or not to use the advanced wrapping
    * algorithm. If true, spaces are collapsed and whitespace is trimmed from lines. If false,
    * spaces and whitespace are left as is. Default false.
    */
  def setWordWrapWidth(width: Double): this.type = js.native
  def setWordWrapWidth(width: Double, useAdvancedWrap: Boolean): this.type = js.native
  /**
    * Update the displayed text.
    */
  def updateText(): this.type = js.native
}

