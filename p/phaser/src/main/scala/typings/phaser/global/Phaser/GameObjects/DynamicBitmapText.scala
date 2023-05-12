package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * BMFont (Windows, free): {@link http://www.angelcode.com/products/bmfont/|http://www.angelcode.com/products/bmfont/}
  * Glyph Designer (OS X, commercial): {@link http://www.71squared.com/en/glyphdesigner|http://www.71squared.com/en/glyphdesigner}
  * Snow BMF (Web-based, free): {@link https://snowb.org//|https://snowb.org/}
  * Littera (Flash-based, free): {@link http://kvazars.com/littera/|http://kvazars.com/littera/}
  * 
  * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
  * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: {@link http://codebeautify.org/xmltojson|http://codebeautify.org/xmltojson}
  */
@JSGlobal("Phaser.GameObjects.DynamicBitmapText")
@js.native
open class DynamicBitmapText protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.DynamicBitmapText {
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
    * The depth of this Game Object within the Scene. Ensure this value is only ever set to a number data-type.
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
    * @param value The depth of this Game Object. Ensure this value is only ever a number data-type.
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
