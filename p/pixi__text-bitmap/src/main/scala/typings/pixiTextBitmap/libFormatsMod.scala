package typings.pixiTextBitmap

import typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatsMod {
  
  @JSImport("@pixi/text-bitmap/lib/formats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/text-bitmap/lib/formats", "TextFormat")
  @js.native
  open class TextFormat ()
    extends typings.pixiTextBitmap.libFormatsTextFormatMod.TextFormat
  /* static members */
  object TextFormat {
    
    @JSImport("@pixi/text-bitmap/lib/formats", "TextFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert text font data to a javascript object.
      * @param txt - Raw string data to be converted
      * @returns - Parsed font data
      */
    inline def parse(txt: String): BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(txt.asInstanceOf[js.Any]).asInstanceOf[BitmapFontData]
    
    /**
      * Check if resource refers to txt font data.
      * @param data
      * @returns - True if resource could be treated as font data, false otherwise.
      */
    inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@pixi/text-bitmap/lib/formats", "XMLFormat")
  @js.native
  open class XMLFormat ()
    extends typings.pixiTextBitmap.libFormatsXmlformatMod.XMLFormat
  /* static members */
  object XMLFormat {
    
    @JSImport("@pixi/text-bitmap/lib/formats", "XMLFormat")
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
  
  @JSImport("@pixi/text-bitmap/lib/formats", "XMLStringFormat")
  @js.native
  open class XMLStringFormat ()
    extends typings.pixiTextBitmap.libFormatsXmlstringformatMod.XMLStringFormat
  /* static members */
  object XMLStringFormat {
    
    @JSImport("@pixi/text-bitmap/lib/formats", "XMLStringFormat")
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
  
  inline def autoDetectFormat(data: Any): (/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectFormat")(data.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: typeof TextFormat */ js.Any) | Null]
}
