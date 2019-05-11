package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BitmapText objects work by taking a texture file and an XML or JSON file that describes the font structure.
  * 
  * During rendering for each letter of the text is rendered to the display, proportionally spaced out and aligned to
  * match the font structure.
  * 
  * Dynamic Bitmap Text objects are different from Static Bitmap Text in that they invoke a callback for each
  * letter being rendered during the render pass. This callback allows you to manipulate the properties of
  * each letter being rendered, such as its position, scale or tint, allowing you to create interesting effects
  * like jiggling text, which can't be done with Static text. This means that Dynamic Text takes more processing
  * time, so only use them if you require the callback ability they have.
  * 
  * BitmapText objects are less flexible than Text objects, in that they have less features such as shadows, fills and the ability
  * to use Web Fonts, however you trade this flexibility for rendering speed. You can also create visually compelling BitmapTexts by
  * processing the font texture in an image editor, applying fills and any other effects required.
  * 
  * To create multi-line text insert \r, \n or \r\n escape codes into the text string.
  * 
  * To create a BitmapText data files you need a 3rd party app such as:
  * 
  * BMFont (Windows, free): http://www.angelcode.com/products/bmfont/
  * Glyph Designer (OS X, commercial): http://www.71squared.com/en/glyphdesigner
  * Littera (Web-based, free): http://kvazars.com/littera/
  * 
  * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
  * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: http://codebeautify.org/xmltojson
  */
@JSGlobal("Phaser.GameObjects.DynamicBitmapText")
@js.native
class DynamicBitmapText protected () extends BitmapText {
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
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, font: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, font: java.lang.String, text: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, font: java.lang.String, text: js.Array[java.lang.String]) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, font: java.lang.String, text: java.lang.String, size: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, font: java.lang.String, text: js.Array[java.lang.String], size: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, font: java.lang.String, text: java.lang.String, size: scala.Double, align: phaserLib.integer) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, font: java.lang.String, text: js.Array[java.lang.String], size: scala.Double, align: phaserLib.integer) = this()
  /**
    * The data object that is populated during rendering, then passed to the displayCallback.
    * You should modify this object then return it back from the callback. It's updated values
    * will be used to render the specific glyph.
    * 
    * Please note that if you need a reference to this object locally in your game code then you
    * should shallow copy it, as it's updated and re-used for every glyph in the text.
    */
  var callbackData: phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.DisplayCallbackConfig = js.native
  /**
    * The crop height of the Bitmap Text.
    */
  var cropHeight: scala.Double = js.native
  /**
    * The crop width of the Bitmap Text.
    */
  var cropWidth: scala.Double = js.native
  /**
    * A callback that alters how each character of the Bitmap Text is rendered.
    */
  @JSName("displayCallback")
  var displayCallback_Original: phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.DisplayCallback = js.native
  /**
    * The horizontal scroll position of the Bitmap Text.
    */
  var scrollX: scala.Double = js.native
  /**
    * The vertical scroll position of the Bitmap Text.
    */
  var scrollY: scala.Double = js.native
  /**
    * A callback that alters how each character of the Bitmap Text is rendered.
    */
  def displayCallback(display: phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.DisplayCallbackConfig): scala.Unit = js.native
  /**
    * Set a callback that alters how each character of the Bitmap Text is rendered.
    * 
    * The callback receives a {@link Phaser.Types.GameObjects.BitmapText.DisplayCallbackConfig} object that contains information about the character that's
    * about to be rendered.
    * 
    * It should return an object with `x`, `y`, `scale` and `rotation` properties that will be used instead of the
    * usual values when rendering.
    * @param callback The display callback to set.
    */
  def setDisplayCallback(callback: phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.DisplayCallback): DynamicBitmapText = js.native
  /**
    * Set the horizontal scroll position of this Bitmap Text.
    * @param value The horizontal scroll position to set.
    */
  def setScrollX(value: scala.Double): DynamicBitmapText = js.native
  /**
    * Set the vertical scroll position of this Bitmap Text.
    * @param value The vertical scroll position to set.
    */
  def setScrollY(value: scala.Double): DynamicBitmapText = js.native
  /**
    * Set the crop size of this Bitmap Text.
    * @param width The width of the crop.
    * @param height The height of the crop.
    */
  def setSize(width: scala.Double, height: scala.Double): DynamicBitmapText = js.native
}

