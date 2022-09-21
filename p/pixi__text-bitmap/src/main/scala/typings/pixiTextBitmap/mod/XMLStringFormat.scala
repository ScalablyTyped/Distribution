package typings.pixiTextBitmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/text-bitmap", "XMLStringFormat")
@js.native
open class XMLStringFormat () extends StObject
/* static members */
object XMLStringFormat {
  
  @JSImport("@pixi/text-bitmap", "XMLStringFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the text XML into BitmapFontData that we can use.
    * @param xmlTxt
    * @returns - Data to use for BitmapFont
    */
  inline def parse(xmlTxt: String): BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xmlTxt.asInstanceOf[js.Any]).asInstanceOf[BitmapFontData]
  
  /**
    * Check if resource refers to text xml font data.
    * @param data
    * @returns - True if resource could be treated as font data, false otherwise.
    */
  inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
