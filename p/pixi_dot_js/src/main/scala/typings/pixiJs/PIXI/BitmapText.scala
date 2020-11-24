package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A BitmapText object will create a line or multiple lines of text using bitmap font.
  *
  * The primary advantage of this class over Text is that all of your textures are pre-generated and loading,
  * meaning that rendering is fast, and changing text has no performance implications.
  *
  * Supporting character sets other than latin, such as CJK languages, may be impractical due to the number of characters.
  *
  * To split a line you can use '\n', '\r' or '\r\n' in your string.
  *
  * PixiJS can auto-generate fonts on-the-fly using BitmapFont or use fnt files provided by:
  * http://www.angelcode.com/products/bmfont/ for Windows or
  * http://www.bmglyph.com/ for Mac.
  *
  * A BitmapText can only be created when the font is loaded.
  *
  * ```js
  * // in this case the font is in a file called 'desyrel.fnt'
  * let bitmapText = new PIXI.BitmapText("text using a fancy font!", {font: "35px Desyrel", align: "right"});
  * ```
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@js.native
trait BitmapText extends Container {
  
  /**
    * The alignment of the BitmapText object.
    *
    * @member {string}
    * @default 'left'
    */
  var align: String = js.native
  
  /**
    * The anchor sets the origin point of the text.
    *
    * The default is `(0,0)`, this means the text's origin is the top left.
    *
    * Setting the anchor to `(0.5,0.5)` means the text's origin is centered.
    *
    * Setting the anchor to `(1,1)` would mean the text's origin point will be the bottom right corner.
    *
    * @member {PIXI.Point | number}
    */
  var anchor: Point | Double = js.native
  
  /**
    * Set to `true` if the BitmapText needs to be redrawn.
    *
    * @member {boolean} PIXI.BitmapText#dirty
    */
  var dirty: Boolean = js.native
  
  /**
    * The name of the BitmapFont.
    *
    * @member {string}
    */
  var fontName: String = js.native
  
  /**
    * The size of the font to display.
    *
    * @member {number}
    */
  var fontSize: Double = js.native
  
  /**
    * Additional space between characters.
    *
    * @member {number}
    */
  var letterSpacing: Double = js.native
  
  /**
    * The max line height. This is useful when trying to use the total height of the Text,
    * i.e. when trying to vertically align.
    *
    * @member {number}
    * @readonly
    */
  val maxLineHeight: Double = js.native
  
  /**
    * The max width of this bitmap text in pixels. If the text provided is longer than the
    * value provided, line breaks will be automatically inserted in the last whitespace.
    * Disable by setting the value to 0.
    *
    * @member {number}
    */
  var maxWidth: Double = js.native
  
  /**
    * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
    * Advantages can include sharper image quality (like text) and faster rendering on canvas.
    * The main disadvantage is movement of objects may appear less smooth.
    * To set the global default, change {@link PIXI.settings.ROUND_PIXELS}
    *
    * @member {boolean} PIXI.BitmapText#roundPixels
    * @default PIXI.settings.ROUND_PIXELS
    */
  var roundPixels: Boolean = js.native
  
  /**
    * The text of the BitmapText object.
    *
    * @member {string}
    */
  var text: String = js.native
  
  /**
    * The height of the overall text, different from fontSize,
    * which is defined in the style object.
    *
    * @member {number}
    * @readonly
    */
  val textHeight: Double = js.native
  
  /**
    * The width of the overall text, different from fontSize,
    * which is defined in the style object.
    *
    * @member {number}
    * @readonly
    */
  val textWidth: Double = js.native
  
  /**
    * The tint of the BitmapText object.
    *
    * @member {number}
    * @default 0xffffff
    */
  var tint: Double = js.native
  
  /**
    * Renders text and updates it when needed. This should only be called
    * if the BitmapFont is regenerated.
    */
  def updateText(): Unit = js.native
}
