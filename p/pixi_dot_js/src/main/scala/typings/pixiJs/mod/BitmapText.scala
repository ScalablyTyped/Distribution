package typings.pixiJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiJs.AnonFont
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A BitmapText object will create a line or multiple lines of text using bitmap font.
  *
  * The primary advantage of this class over Text is that all of your textures are pre-generated and loading,
  * meaning that rendering is fast, and changing text has no performance implications.
  *
  * The primary disadvantage is that you need to preload the bitmap font assets, and thus the styling is set in stone.
  * Supporting character sets other than latin, such as CJK languages, may be impractical due to the number of characters.
  *
  * To split a line you can use '\n', '\r' or '\r\n' in your string.
  *
  * You can generate the fnt files using
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
@JSImport("pixi.js", "BitmapText")
@js.native
class BitmapText protected ()
  extends typings.pixiJs.PIXI.BitmapText {
  def this(text: String, style: AnonFont) = this()
}

/* static members */
@JSImport("pixi.js", "BitmapText")
@js.native
object BitmapText extends js.Object {
  def registerFont(xml: XMLDocument, textures: js.Array[typings.pixiJs.PIXI.Texture]): js.Any = js.native
  /**
    * Register a bitmap font with data and a texture.
    *
    * @static
    * @param {XMLDocument} xml - The XML document data.
    * @param {Object.<string, PIXI.Texture>|PIXI.Texture|PIXI.Texture[]} textures - List of textures for each page.
    *  If providing an object, the key is the `<page>` element's `file` attribute in the FNT file.
    * @return {Object} Result font object with font, size, lineHeight and char fields.
    */
  def registerFont(xml: XMLDocument, textures: StringDictionary[typings.pixiJs.PIXI.Texture]): js.Any = js.native
  def registerFont(xml: XMLDocument, textures: typings.pixiJs.PIXI.Texture): js.Any = js.native
}

