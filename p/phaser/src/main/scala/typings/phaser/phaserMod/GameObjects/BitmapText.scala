package typings.phaser.phaserMod.GameObjects

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
@JSImport("phaser", "GameObjects.BitmapText")
@js.native
class BitmapText protected ()
  extends typings.phaser.Phaser.GameObjects.BitmapText {
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
  def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, font: String) = this()
  def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, font: String, text: String) = this()
  def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, font: String, text: js.Array[String]) = this()
  def this(scene: typings.phaser.Phaser.Scene, x: Double, y: Double, font: String, text: String, size: Double) = this()
  def this(
    scene: typings.phaser.Phaser.Scene,
    x: Double,
    y: Double,
    font: String,
    text: js.Array[String],
    size: Double
  ) = this()
  def this(
    scene: typings.phaser.Phaser.Scene,
    x: Double,
    y: Double,
    font: String,
    text: String,
    size: Double,
    align: integer
  ) = this()
  def this(
    scene: typings.phaser.Phaser.Scene,
    x: Double,
    y: Double,
    font: String,
    text: js.Array[String],
    size: Double,
    align: integer
  ) = this()
}

/* static members */
@JSImport("phaser", "GameObjects.BitmapText")
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

