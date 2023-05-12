package typings.pixiTextBitmap

import typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatsXmlformatMod {
  
  @JSImport("@pixi/text-bitmap/lib/formats/XMLFormat", "XMLFormat")
  @js.native
  open class XMLFormat () extends StObject
  /* static members */
  object XMLFormat {
    
    @JSImport("@pixi/text-bitmap/lib/formats/XMLFormat", "XMLFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert the XML into BitmapFontData that we can use.
      * @param xml
      * @returns - Data to use for BitmapFont
      */
    inline def parse(xml: Document): BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[BitmapFontData]
    
    /**
      * Check if resource refers to xml font data.
      * @param data
      * @returns - True if resource could be treated as font data, false otherwise.
      */
    inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
