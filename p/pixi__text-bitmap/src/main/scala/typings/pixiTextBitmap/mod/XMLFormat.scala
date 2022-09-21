package typings.pixiTextBitmap.mod

import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/text-bitmap", "XMLFormat")
@js.native
open class XMLFormat () extends StObject
/* static members */
object XMLFormat {
  
  @JSImport("@pixi/text-bitmap", "XMLFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the XML into BitmapFontData that we can use.
    * @param xml
    * @returns - Data to use for BitmapFont
    */
  inline def parse(xml: XMLDocument): BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[BitmapFontData]
  
  /**
    * Check if resource refers to xml font data.
    * @param data
    * @returns - True if resource could be treated as font data, false otherwise.
    */
  inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
