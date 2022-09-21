package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Types.GameObjects.BitmapText.BitmapFontData
import typings.std.XMLDocument
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
  * Littera (Web-based, free): {@link http://kvazars.com/littera/|http://kvazars.com/littera/}
  * 
  * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
  * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: {@link http://codebeautify.org/xmltojson|http://codebeautify.org/xmltojson}
  */
@JSImport("phaser", "GameObjects.BitmapText")
@js.native
open class BitmapText protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.BitmapText {
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
  def this(scene: Scene, x: Double, y: Double, font: String, text: Unit, size: Double) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: String, size: Double, align: Double) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: String, size: Unit, align: Double) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    font: String,
    text: js.Array[String],
    size: Double,
    align: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    font: String,
    text: js.Array[String],
    size: Unit,
    align: Double
  ) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: Unit, size: Double, align: Double) = this()
  def this(scene: Scene, x: Double, y: Double, font: String, text: Unit, size: Unit, align: Double) = this()
  
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
  override def setDepth(value: Double): this.type = js.native
  
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
object BitmapText {
  
  @JSImport("phaser", "GameObjects.BitmapText")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Center align the text characters in a multi-line BitmapText object.
    */
  /* static member */
  @JSImport("phaser", "GameObjects.BitmapText.ALIGN_CENTER")
  @js.native
  def ALIGN_CENTER: Double = js.native
  inline def ALIGN_CENTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGN_CENTER")(x.asInstanceOf[js.Any])
  
  /**
    * Left align the text characters in a multi-line BitmapText object.
    */
  /* static member */
  @JSImport("phaser", "GameObjects.BitmapText.ALIGN_LEFT")
  @js.native
  def ALIGN_LEFT: Double = js.native
  inline def ALIGN_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGN_LEFT")(x.asInstanceOf[js.Any])
  
  /**
    * Right align the text characters in a multi-line BitmapText object.
    */
  /* static member */
  @JSImport("phaser", "GameObjects.BitmapText.ALIGN_RIGHT")
  @js.native
  def ALIGN_RIGHT: Double = js.native
  inline def ALIGN_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALIGN_RIGHT")(x.asInstanceOf[js.Any])
  
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
  /* static member */
  inline def ParseFromAtlas(scene: Scene, fontName: String, textureKey: String, frameKey: String, xmlKey: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromAtlas")(scene.asInstanceOf[js.Any], fontName.asInstanceOf[js.Any], textureKey.asInstanceOf[js.Any], frameKey.asInstanceOf[js.Any], xmlKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ParseFromAtlas(
    scene: Scene,
    fontName: String,
    textureKey: String,
    frameKey: String,
    xmlKey: String,
    xSpacing: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromAtlas")(scene.asInstanceOf[js.Any], fontName.asInstanceOf[js.Any], textureKey.asInstanceOf[js.Any], frameKey.asInstanceOf[js.Any], xmlKey.asInstanceOf[js.Any], xSpacing.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ParseFromAtlas(
    scene: Scene,
    fontName: String,
    textureKey: String,
    frameKey: String,
    xmlKey: String,
    xSpacing: Double,
    ySpacing: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromAtlas")(scene.asInstanceOf[js.Any], fontName.asInstanceOf[js.Any], textureKey.asInstanceOf[js.Any], frameKey.asInstanceOf[js.Any], xmlKey.asInstanceOf[js.Any], xSpacing.asInstanceOf[js.Any], ySpacing.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ParseFromAtlas(
    scene: Scene,
    fontName: String,
    textureKey: String,
    frameKey: String,
    xmlKey: String,
    xSpacing: Unit,
    ySpacing: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromAtlas")(scene.asInstanceOf[js.Any], fontName.asInstanceOf[js.Any], textureKey.asInstanceOf[js.Any], frameKey.asInstanceOf[js.Any], xmlKey.asInstanceOf[js.Any], xSpacing.asInstanceOf[js.Any], ySpacing.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Parse an XML font to Bitmap Font data for the Bitmap Font cache.
    * @param xml The XML Document to parse the font from.
    * @param frame The texture frame to take into account when creating the uv data.
    * @param xSpacing The x-axis spacing to add between each letter. Default 0.
    * @param ySpacing The y-axis spacing to add to the line height. Default 0.
    */
  /* static member */
  inline def ParseXMLBitmapFont(xml: XMLDocument, frame: Frame): BitmapFontData = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseXMLBitmapFont")(xml.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[BitmapFontData]
  inline def ParseXMLBitmapFont(xml: XMLDocument, frame: Frame, xSpacing: Double): BitmapFontData = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseXMLBitmapFont")(xml.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], xSpacing.asInstanceOf[js.Any])).asInstanceOf[BitmapFontData]
  inline def ParseXMLBitmapFont(xml: XMLDocument, frame: Frame, xSpacing: Double, ySpacing: Double): BitmapFontData = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseXMLBitmapFont")(xml.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], xSpacing.asInstanceOf[js.Any], ySpacing.asInstanceOf[js.Any])).asInstanceOf[BitmapFontData]
  inline def ParseXMLBitmapFont(xml: XMLDocument, frame: Frame, xSpacing: Unit, ySpacing: Double): BitmapFontData = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseXMLBitmapFont")(xml.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], xSpacing.asInstanceOf[js.Any], ySpacing.asInstanceOf[js.Any])).asInstanceOf[BitmapFontData]
}
