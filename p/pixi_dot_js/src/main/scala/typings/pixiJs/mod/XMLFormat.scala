package typings.pixiJs.mod

import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "XMLFormat")
@js.native
open class XMLFormat ()
  extends typings.pixiTextBitmap.mod.XMLFormat
/* static members */
object XMLFormat {
  
  @JSImport("pixi.js", "XMLFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the XML into BitmapFontData that we can use.
    * @param xml
    * @returns - Data to use for BitmapFont
    */
  inline def parse(xml: XMLDocument): typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData]
  
  /**
    * Check if resource refers to xml font data.
    * @param data
    * @returns - True if resource could be treated as font data, false otherwise.
    */
  inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
