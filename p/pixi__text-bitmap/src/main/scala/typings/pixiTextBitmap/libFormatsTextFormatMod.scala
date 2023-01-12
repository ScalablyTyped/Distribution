package typings.pixiTextBitmap

import typings.pixiTextBitmap.anon.Amount
import typings.pixiTextBitmap.anon.Count
import typings.pixiTextBitmap.anon.DistanceRange
import typings.pixiTextBitmap.anon.Face
import typings.pixiTextBitmap.anon.File
import typings.pixiTextBitmap.anon.Height
import typings.pixiTextBitmap.anon.LineHeight
import typings.pixiTextBitmap.libBitmapFontDataMod.BitmapFontData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatsTextFormatMod {
  
  @JSImport("@pixi/text-bitmap/lib/formats/TextFormat", "TextFormat")
  @js.native
  open class TextFormat () extends StObject
  /* static members */
  object TextFormat {
    
    @JSImport("@pixi/text-bitmap/lib/formats/TextFormat", "TextFormat")
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
  
  trait IBitmapFontRawData extends StObject {
    
    var char: js.Array[Height]
    
    var chars: js.Array[Count]
    
    var common: js.Array[LineHeight]
    
    var distanceField: js.UndefOr[js.Array[DistanceRange]] = js.undefined
    
    var info: js.Array[Face]
    
    var kerning: js.UndefOr[js.Array[Amount]] = js.undefined
    
    var kernings: js.UndefOr[js.Array[Count]] = js.undefined
    
    var page: js.Array[File]
  }
  object IBitmapFontRawData {
    
    inline def apply(
      char: js.Array[Height],
      chars: js.Array[Count],
      common: js.Array[LineHeight],
      info: js.Array[Face],
      page: js.Array[File]
    ): IBitmapFontRawData = {
      val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapFontRawData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapFontRawData] (val x: Self) extends AnyVal {
      
      inline def setChar(value: js.Array[Height]): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setCharVarargs(value: Height*): Self = StObject.set(x, "char", js.Array(value*))
      
      inline def setChars(value: js.Array[Count]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsVarargs(value: Count*): Self = StObject.set(x, "chars", js.Array(value*))
      
      inline def setCommon(value: js.Array[LineHeight]): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setCommonVarargs(value: LineHeight*): Self = StObject.set(x, "common", js.Array(value*))
      
      inline def setDistanceField(value: js.Array[DistanceRange]): Self = StObject.set(x, "distanceField", value.asInstanceOf[js.Any])
      
      inline def setDistanceFieldUndefined: Self = StObject.set(x, "distanceField", js.undefined)
      
      inline def setDistanceFieldVarargs(value: DistanceRange*): Self = StObject.set(x, "distanceField", js.Array(value*))
      
      inline def setInfo(value: js.Array[Face]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoVarargs(value: Face*): Self = StObject.set(x, "info", js.Array(value*))
      
      inline def setKerning(value: js.Array[Amount]): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setKerningVarargs(value: Amount*): Self = StObject.set(x, "kerning", js.Array(value*))
      
      inline def setKernings(value: js.Array[Count]): Self = StObject.set(x, "kernings", value.asInstanceOf[js.Any])
      
      inline def setKerningsUndefined: Self = StObject.set(x, "kernings", js.undefined)
      
      inline def setKerningsVarargs(value: Count*): Self = StObject.set(x, "kernings", js.Array(value*))
      
      inline def setPage(value: js.Array[File]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageVarargs(value: File*): Self = StObject.set(x, "page", js.Array(value*))
    }
  }
}
