package typings.pixiJs.mod

import typings.pixiTextBitmap.anon.PartialIBitmapTextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BitmapText")
@js.native
open class BitmapText protected ()
  extends typings.pixiTextBitmap.mod.BitmapText {
  /**
    * @param text - A string that you would like the text to display.
    * @param style - The style parameters.
    * @param {string} style.fontName - The installed BitmapFont name.
    * @param {number} [style.fontSize] - The size of the font in pixels, e.g. 24. If undefined,
    *.     this will default to the BitmapFont size.
    * @param {string} [style.align='left'] - Alignment for multiline text ('left', 'center', 'right' or 'justify'),
    *      does not affect single line text.
    * @param {number} [style.tint=0xFFFFFF] - The tint color.
    * @param {number} [style.letterSpacing=0] - The amount of spacing between letters.
    * @param {number} [style.maxWidth=0] - The max width of the text before line wrapping.
    */
  def this(text: String) = this()
  def this(text: String, style: PartialIBitmapTextStyle) = this()
}
/* static members */
object BitmapText {
  
  @JSImport("pixi.js", "BitmapText")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "BitmapText.styleDefaults")
  @js.native
  def styleDefaults: PartialIBitmapTextStyle = js.native
  inline def styleDefaults_=(x: PartialIBitmapTextStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleDefaults")(x.asInstanceOf[js.Any])
}
