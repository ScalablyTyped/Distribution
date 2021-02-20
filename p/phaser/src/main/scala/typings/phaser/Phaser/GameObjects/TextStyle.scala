package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Types.GameObjects.Text.TextMetrics
import typings.phaser.TextStyleWordWrapCallback
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextStyle class manages all of the style settings for a Text object.
  * 
  * Text Game Objects create a TextStyle instance automatically, which is
  * accessed via the `Text.style` property. You do not normally need to
  * instantiate one yourself.
  */
@js.native
trait TextStyle extends StObject {
  
  /**
    * The text alignment.
    */
  var align: String = js.native
  
  /**
    * The background color.
    */
  var backgroundColor: String = js.native
  
  /**
    * The amount of horizontal padding added to the width of the text when calculating the font metrics.
    */
  var baselineX: Double = js.native
  
  /**
    * The amount of vertical padding added to the height of the text when calculating the font metrics.
    */
  var baselineY: Double = js.native
  
  /**
    * The text fill color.
    */
  var color: String = js.native
  
  /**
    * Destroy this Text Style.
    */
  def destroy(): Unit = js.native
  
  /**
    * The fixed height of the text.
    * 
    * `0` means no fixed height.
    */
  var fixedHeight: Double = js.native
  
  /**
    * The fixed width of the text.
    * 
    * `0` means no fixed with.
    */
  var fixedWidth: Double = js.native
  
  /**
    * The font family.
    */
  var fontFamily: String = js.native
  
  /**
    * The font size.
    */
  var fontSize: String = js.native
  
  /**
    * The font style.
    */
  var fontStyle: String = js.native
  
  /**
    * Get the current text metrics.
    */
  def getTextMetrics(): TextMetrics = js.native
  
  /**
    * The maximum number of lines to draw.
    */
  var maxLines: integer = js.native
  
  /**
    * The Text object that this TextStyle is styling.
    */
  var parent: Text = js.native
  
  /**
    * The resolution the text is rendered to its internal canvas at.
    * The default is 0, which means it will use the resolution set in the Game Config.
    */
  var resolution: Double = js.native
  
  /**
    * Whether the text should render right to left.
    */
  var rtl: Boolean = js.native
  
  /**
    * Set the alignment of the text in this Text object.
    * 
    * The argument can be one of: `left`, `right`, `center` or `justify`.
    * 
    * Alignment only works if the Text object has more than one line of text.
    * @param align The text alignment for multi-line text. Default 'left'.
    */
  def setAlign(): Text = js.native
  def setAlign(align: String): Text = js.native
  
  /**
    * Set the background color.
    * @param color The background color.
    */
  def setBackgroundColor(color: String): Text = js.native
  
  /**
    * Set the text fill color.
    * @param color The text fill color.
    */
  def setColor(color: String): Text = js.native
  
  /**
    * Set the text fill color.
    * @param color The text fill color.
    */
  def setFill(color: String): Text = js.native
  
  /**
    * Set a fixed width and height for the text.
    * 
    * Pass in `0` for either of these parameters to disable fixed width or height respectively.
    * @param width The fixed width to set.
    * @param height The fixed height to set.
    */
  def setFixedSize(width: Double, height: Double): Text = js.native
  
  /**
    * Set the font.
    * 
    * If a string is given, the font family is set.
    * 
    * If an object is given, the `fontFamily`, `fontSize` and `fontStyle`
    * properties of that object are set.
    * @param font The font family or font settings to set.
    * @param updateText Whether to update the text immediately. Default true.
    */
  def setFont(font: String): Text = js.native
  def setFont(font: String, updateText: Boolean): Text = js.native
  def setFont(font: js.Object): Text = js.native
  def setFont(font: js.Object, updateText: Boolean): Text = js.native
  
  /**
    * Set the font family.
    * @param family The font family.
    */
  def setFontFamily(family: String): Text = js.native
  
  def setFontSize(size: String): Text = js.native
  /**
    * Set the font size.
    * @param size The font size.
    */
  def setFontSize(size: Double): Text = js.native
  
  /**
    * Set the font style.
    * @param style The font style.
    */
  def setFontStyle(style: String): Text = js.native
  
  /**
    * Set the maximum number of lines to draw.
    * @param max The maximum number of lines to draw. Default 0.
    */
  def setMaxLines(): Text = js.native
  def setMaxLines(max: integer): Text = js.native
  
  /**
    * Set the resolution used by the Text object.
    * 
    * By default it will be set to match the resolution set in the Game Config,
    * but you can override it via this method. It allows for much clearer text on High DPI devices,
    * at the cost of memory because it uses larger internal Canvas textures for the Text.
    * 
    * Please use with caution, as the more high res Text you have, the more memory it uses up.
    * @param value The resolution for this Text object to use.
    */
  def setResolution(value: Double): Text = js.native
  
  /**
    * Set the shadow settings.
    * 
    * Calling this method always re-measures the parent Text object,
    * so only call it when you actually change the shadow settings.
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
  ): Text = js.native
  
  /**
    * Set the shadow blur radius.
    * @param blur The shadow blur radius. Default 0.
    */
  def setShadowBlur(): Text = js.native
  def setShadowBlur(blur: Double): Text = js.native
  
  /**
    * Set the shadow color.
    * @param color The shadow color. Default '#000'.
    */
  def setShadowColor(): Text = js.native
  def setShadowColor(color: String): Text = js.native
  
  /**
    * Enable or disable shadow fill.
    * @param enabled Whether shadow fill is enabled or not.
    */
  def setShadowFill(enabled: Boolean): Text = js.native
  
  /**
    * Set the shadow offset.
    * @param x The horizontal shadow offset. Default 0.
    * @param y The vertical shadow offset. Default 0.
    */
  def setShadowOffset(): Text = js.native
  def setShadowOffset(x: js.UndefOr[scala.Nothing], y: Double): Text = js.native
  def setShadowOffset(x: Double): Text = js.native
  def setShadowOffset(x: Double, y: Double): Text = js.native
  
  /**
    * Enable or disable shadow stroke.
    * @param enabled Whether shadow stroke is enabled or not.
    */
  def setShadowStroke(enabled: Boolean): Text = js.native
  
  /**
    * Set the stroke settings.
    * @param color The stroke color.
    * @param thickness The stroke thickness.
    */
  def setStroke(color: String, thickness: Double): Text = js.native
  
  /**
    * Set the text style.
    * @param style The style settings to set.
    * @param updateText Whether to update the text immediately. Default true.
    * @param setDefaults Use the default values is not set, or the local values. Default false.
    */
  def setStyle(style: typings.phaser.Phaser.Types.GameObjects.Text.TextStyle): Text = js.native
  def setStyle(
    style: typings.phaser.Phaser.Types.GameObjects.Text.TextStyle,
    updateText: js.UndefOr[scala.Nothing],
    setDefaults: Boolean
  ): Text = js.native
  def setStyle(style: typings.phaser.Phaser.Types.GameObjects.Text.TextStyle, updateText: Boolean): Text = js.native
  def setStyle(
    style: typings.phaser.Phaser.Types.GameObjects.Text.TextStyle,
    updateText: Boolean,
    setDefaults: Boolean
  ): Text = js.native
  
  /**
    * Set the test string to use when measuring the font.
    * @param string The test string to use when measuring the font.
    */
  def setTestString(string: String): Text = js.native
  
  /**
    * Set a custom callback for wrapping lines.
    * 
    * Pass in null to remove wrapping by callback.
    * @param callback A custom function that will be responsible for wrapping the
    * text. It will receive two arguments: text (the string to wrap), textObject (this Text
    * instance). It should return the wrapped lines either as an array of lines or as a string with
    * newline characters in place to indicate where breaks should happen.
    * @param scope The scope that will be applied when the callback is invoked. Default null.
    */
  def setWordWrapCallback(callback: TextStyleWordWrapCallback): Text = js.native
  def setWordWrapCallback(callback: TextStyleWordWrapCallback, scope: js.Object): Text = js.native
  
  /**
    * Set the width (in pixels) to use for wrapping lines.
    * 
    * Pass in null to remove wrapping by width.
    * @param width The maximum width of a line in pixels. Set to null to remove wrapping.
    * @param useAdvancedWrap Whether or not to use the advanced wrapping
    * algorithm. If true, spaces are collapsed and whitespace is trimmed from lines. If false,
    * spaces and whitespace are left as is. Default false.
    */
  def setWordWrapWidth(width: Double): Text = js.native
  def setWordWrapWidth(width: Double, useAdvancedWrap: Boolean): Text = js.native
  
  /**
    * The shadow blur radius.
    */
  var shadowBlur: Double = js.native
  
  /**
    * The shadow color.
    */
  var shadowColor: String = js.native
  
  /**
    * Whether shadow fill is enabled or not.
    */
  var shadowFill: Boolean = js.native
  
  /**
    * The horizontal shadow offset.
    */
  var shadowOffsetX: Double = js.native
  
  /**
    * The vertical shadow offset.
    */
  var shadowOffsetY: Double = js.native
  
  /**
    * Whether shadow stroke is enabled or not.
    */
  var shadowStroke: Boolean = js.native
  
  /**
    * The text stroke color.
    */
  var stroke: String = js.native
  
  /**
    * The text stroke thickness.
    */
  var strokeThickness: Double = js.native
  
  /**
    * Synchronize the font settings to the given Canvas Rendering Context.
    * @param canvas The Canvas Element.
    * @param context The Canvas Rendering Context.
    */
  def syncFont(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D): Unit = js.native
  
  /**
    * Synchronize the shadow settings to the given Canvas Rendering Context.
    * @param context The Canvas Rendering Context.
    * @param enabled Whether shadows are enabled or not.
    */
  def syncShadow(context: CanvasRenderingContext2D, enabled: Boolean): Unit = js.native
  
  /**
    * Synchronize the text style settings to the given Canvas Rendering Context.
    * @param canvas The Canvas Element.
    * @param context The Canvas Rendering Context.
    */
  def syncStyle(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D): Unit = js.native
  
  /**
    * The test string to use when measuring the font.
    */
  var testString: String = js.native
  
  /**
    * Build a JSON representation of this Text Style.
    */
  def toJSON(): js.Object = js.native
  
  /**
    * Update the style settings for the parent Text object.
    * @param recalculateMetrics Whether to recalculate font and text metrics.
    */
  def update(recalculateMetrics: Boolean): Text = js.native
  
  /**
    * A custom function that will be responsible for wrapping the text. It will receive two
    * arguments: text (the string to wrap), textObject (this Text instance). It should return
    * the wrapped lines either as an array of lines or as a string with newline characters in
    * place to indicate where breaks should happen. Setting this directly will not re-run the
    * word wrapping algorithm. To change the callback and re-wrap, use
    * {@link Phaser.GameObjects.TextStyle#setWordWrapCallback}.
    */
  var wordWrapCallback: TextStyleWordWrapCallback | Null = js.native
  
  /**
    * The scope that will be applied when the wordWrapCallback is invoked. Setting this directly will not re-run the
    * word wrapping algorithm. To change the callback and re-wrap, use
    * {@link Phaser.GameObjects.TextStyle#setWordWrapCallback}.
    */
  var wordWrapCallbackScope: js.Object | Null = js.native
  
  /**
    * Whether or not to use the advanced wrapping algorithm. If true, spaces are collapsed and
    * whitespace is trimmed from lines. If false, spaces and whitespace are left as is. Setting
    * this property directly will not re-run the word wrapping algorithm. To change the
    * advanced setting and re-wrap, use {@link Phaser.GameObjects.TextStyle#setWordWrapWidth}.
    */
  var wordWrapUseAdvanced: Boolean = js.native
  
  /**
    * The maximum width of a line of text in pixels. Null means no line wrapping. Setting this
    * property directly will not re-run the word wrapping algorithm. To change the width and
    * re-wrap, use {@link Phaser.GameObjects.TextStyle#setWordWrapWidth}.
    */
  var wordWrapWidth: Double | Null = js.native
}
