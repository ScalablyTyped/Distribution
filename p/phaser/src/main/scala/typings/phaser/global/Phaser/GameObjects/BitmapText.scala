package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Types.GameObjects.BitmapText.BitmapFontData
import typings.phaser.integer
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  * Littera (Web-based, free): {@link http://kvazars.com/littera/|http://kvazars.com/littera/}
  * 
  * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
  * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: {@link http://codebeautify.org/xmltojson|http://codebeautify.org/xmltojson}
  */
@JSGlobal("Phaser.GameObjects.BitmapText")
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
  def this(scene: Scene, x: Double, y: Double, font: String) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: String) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: js.Array[String]) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: js.UndefOr[scala.Nothing], size: Double) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: String, size: Double) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: js.Array[String], size: Double) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    font: String,
    text: js.UndefOr[scala.Nothing],
    size: js.UndefOr[scala.Nothing],
    align: integer
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    font: String,
    text: js.UndefOr[scala.Nothing],
    size: Double,
    align: integer
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    font: String,
    text: String,
    size: js.UndefOr[scala.Nothing],
    align: integer
  ) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: String, size: Double, align: integer) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    font: String,
    text: js.Array[String],
    size: js.UndefOr[scala.Nothing],
    align: integer
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    font: String,
    text: js.Array[String],
    size: Double,
    align: integer
  ) = this()
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
    * @param scene The Scene to parse the Bitmap Font for.
    * @param fontName The key of the font to add to the Bitmap Font cache.
    * @param textureKey The key of the BitmapFont's texture.
    * @param frameKey The key of the BitmapFont texture's frame.
    * @param xmlKey The key of the XML data of the font to parse.
    * @param xSpacing The x-axis spacing to add between each letter.
    * @param ySpacing The y-axis spacing to add to the line height.
    */
  def ParseFromAtlas(scene: Scene, fontName: String, textureKey: String, frameKey: String, xmlKey: String): Boolean = js.native
  def ParseFromAtlas(
    scene: Scene,
    fontName: String,
    textureKey: String,
    frameKey: String,
    xmlKey: String,
    xSpacing: js.UndefOr[scala.Nothing],
    ySpacing: integer
  ): Boolean = js.native
  def ParseFromAtlas(
    scene: Scene,
    fontName: String,
    textureKey: String,
    frameKey: String,
    xmlKey: String,
    xSpacing: integer
  ): Boolean = js.native
  def ParseFromAtlas(
    scene: Scene,
    fontName: String,
    textureKey: String,
    frameKey: String,
    xmlKey: String,
    xSpacing: integer,
    ySpacing: integer
  ): Boolean = js.native
  
  /**
    * Parse an XML font to Bitmap Font data for the Bitmap Font cache.
    * @param xml The XML Document to parse the font from.
    * @param xSpacing The x-axis spacing to add between each letter. Default 0.
    * @param ySpacing The y-axis spacing to add to the line height. Default 0.
    * @param frame The texture frame to take into account while parsing.
    */
  def ParseXMLBitmapFont(xml: XMLDocument): BitmapFontData = js.native
  def ParseXMLBitmapFont(
    xml: XMLDocument,
    xSpacing: js.UndefOr[scala.Nothing],
    ySpacing: js.UndefOr[scala.Nothing],
    frame: Frame
  ): BitmapFontData = js.native
  def ParseXMLBitmapFont(xml: XMLDocument, xSpacing: js.UndefOr[scala.Nothing], ySpacing: integer): BitmapFontData = js.native
  def ParseXMLBitmapFont(xml: XMLDocument, xSpacing: js.UndefOr[scala.Nothing], ySpacing: integer, frame: Frame): BitmapFontData = js.native
  def ParseXMLBitmapFont(xml: XMLDocument, xSpacing: integer): BitmapFontData = js.native
  def ParseXMLBitmapFont(xml: XMLDocument, xSpacing: integer, ySpacing: js.UndefOr[scala.Nothing], frame: Frame): BitmapFontData = js.native
  def ParseXMLBitmapFont(xml: XMLDocument, xSpacing: integer, ySpacing: integer): BitmapFontData = js.native
  def ParseXMLBitmapFont(xml: XMLDocument, xSpacing: integer, ySpacing: integer, frame: Frame): BitmapFontData = js.native
}
