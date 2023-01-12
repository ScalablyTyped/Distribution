package typings.pixiTextBitmap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBitmapFontDataMod {
  
  @JSImport("@pixi/text-bitmap/lib/BitmapFontData", "BitmapFontData")
  @js.native
  open class BitmapFontData () extends StObject {
    
    /** @readonly */
    var char: js.Array[IBitmapFontDataChar] = js.native
    
    /** @readonly */
    var common: js.Array[IBitmapFontDataCommon] = js.native
    
    /** @readonly */
    var distanceField: js.Array[IBitmapFontDataDistanceField] = js.native
    
    /** @readonly */
    var info: js.Array[IBitmapFontDataInfo] = js.native
    
    /** @readonly */
    var kerning: js.Array[IBitmapFontDataKerning] = js.native
    
    /** @readonly */
    var page: js.Array[IBitmapFontDataPage] = js.native
  }
  
  trait IBitmapFontDataChar extends StObject {
    
    /** Height of character in page. */
    var height: Double
    
    /** Unique id of character */
    var id: Double
    
    /** {@link PIXI.IBitmapFontDataPage} id */
    var page: Double
    
    /** Width of character in page. */
    var width: Double
    
    /** x-position of character in page. */
    var x: Double
    
    /** Advancement to apply to next character. */
    var xadvance: Double
    
    /** x-offset to apply when rendering character */
    var xoffset: Double
    
    /** y-position of character in page. */
    var y: Double
    
    /** y-offset to apply when rendering character. */
    var yoffset: Double
  }
  object IBitmapFontDataChar {
    
    inline def apply(
      height: Double,
      id: Double,
      page: Double,
      width: Double,
      x: Double,
      xadvance: Double,
      xoffset: Double,
      y: Double,
      yoffset: Double
    ): IBitmapFontDataChar = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xadvance = xadvance.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapFontDataChar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapFontDataChar] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXadvance(value: Double): Self = StObject.set(x, "xadvance", value.asInstanceOf[js.Any])
      
      inline def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBitmapFontDataCommon extends StObject {
    
    /** Line height, in pixels. */
    var lineHeight: Double
  }
  object IBitmapFontDataCommon {
    
    inline def apply(lineHeight: Double): IBitmapFontDataCommon = {
      val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapFontDataCommon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapFontDataCommon] (val x: Self) extends AnyVal {
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBitmapFontDataDistanceField extends StObject {
    
    /** Range of distance */
    var distanceRange: Double
    
    /** Type of distance field */
    var fieldType: String
  }
  object IBitmapFontDataDistanceField {
    
    inline def apply(distanceRange: Double, fieldType: String): IBitmapFontDataDistanceField = {
      val __obj = js.Dynamic.literal(distanceRange = distanceRange.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapFontDataDistanceField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapFontDataDistanceField] (val x: Self) extends AnyVal {
      
      inline def setDistanceRange(value: Double): Self = StObject.set(x, "distanceRange", value.asInstanceOf[js.Any])
      
      inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBitmapFontDataInfo extends StObject {
    
    /** Font face */
    var face: String
    
    /** Font size */
    var size: Double
  }
  object IBitmapFontDataInfo {
    
    inline def apply(face: String, size: Double): IBitmapFontDataInfo = {
      val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapFontDataInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapFontDataInfo] (val x: Self) extends AnyVal {
      
      inline def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBitmapFontDataKerning extends StObject {
    
    /** x-offset to apply between first & second characters when they are next to each other. */
    var amount: Double
    
    /** First character of pair */
    var first: Double
    
    /** Second character of pair */
    var second: Double
  }
  object IBitmapFontDataKerning {
    
    inline def apply(amount: Double, first: Double, second: Double): IBitmapFontDataKerning = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapFontDataKerning]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapFontDataKerning] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBitmapFontDataPage extends StObject {
    
    /** File name */
    var file: String
    
    /** Unique id for bitmap texture */
    var id: Double
  }
  object IBitmapFontDataPage {
    
    inline def apply(file: String, id: Double): IBitmapFontDataPage = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitmapFontDataPage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBitmapFontDataPage] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
