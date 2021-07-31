package typings.pixiJs.global.PIXI

import typings.pixiJs.anon.FontName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
@JSGlobal("PIXI.BitmapText")
@js.native
class BitmapText protected ()
  extends StObject
     with typings.pixiJs.PIXI.BitmapText {
  def this(text: String, style: FontName) = this()
}
object BitmapText {
  
  @JSGlobal("PIXI.BitmapText")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Register a bitmap font with data and a texture.
    *
    * @deprecated since 5.3.0
    * @see PIXI.BitmapFont.install
    * @static
    */
  /* static member */
  @scala.inline
  def registerFont(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFont")().asInstanceOf[Unit]
  
  /**
    * Get the list of installed fonts.
    *
    * @see PIXI.BitmapFont.available
    * @deprecated since 5.3.0
    * @static
    * @readonly
    * @member {Object.<string, PIXI.BitmapFont>}
    */
  /* static member */
  object fonts
}
