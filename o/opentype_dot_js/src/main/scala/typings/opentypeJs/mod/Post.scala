package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Post extends StObject {
  
  var glyphNameIndex: js.UndefOr[js.Array[Double]] = js.undefined
  
  var isFixedPitch: Double
  
  var italicAngle: Double
  
  var maxMemType1: Double
  
  var maxMemType42: Double
  
  var minMemType1: Double
  
  var minMemType42: Double
  
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  var numberOfGlyphs: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[js.Array[Double]] = js.undefined
  
  var underlinePosition: Double
  
  var underlineThickness: Double
  
  var version: Double
}
object Post {
  
  inline def apply(
    isFixedPitch: Double,
    italicAngle: Double,
    maxMemType1: Double,
    maxMemType42: Double,
    minMemType1: Double,
    minMemType42: Double,
    underlinePosition: Double,
    underlineThickness: Double,
    version: Double
  ): Post = {
    val __obj = js.Dynamic.literal(isFixedPitch = isFixedPitch.asInstanceOf[js.Any], italicAngle = italicAngle.asInstanceOf[js.Any], maxMemType1 = maxMemType1.asInstanceOf[js.Any], maxMemType42 = maxMemType42.asInstanceOf[js.Any], minMemType1 = minMemType1.asInstanceOf[js.Any], minMemType42 = minMemType42.asInstanceOf[js.Any], underlinePosition = underlinePosition.asInstanceOf[js.Any], underlineThickness = underlineThickness.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
    
    inline def setGlyphNameIndex(value: js.Array[Double]): Self = StObject.set(x, "glyphNameIndex", value.asInstanceOf[js.Any])
    
    inline def setGlyphNameIndexUndefined: Self = StObject.set(x, "glyphNameIndex", js.undefined)
    
    inline def setGlyphNameIndexVarargs(value: Double*): Self = StObject.set(x, "glyphNameIndex", js.Array(value*))
    
    inline def setIsFixedPitch(value: Double): Self = StObject.set(x, "isFixedPitch", value.asInstanceOf[js.Any])
    
    inline def setItalicAngle(value: Double): Self = StObject.set(x, "italicAngle", value.asInstanceOf[js.Any])
    
    inline def setMaxMemType1(value: Double): Self = StObject.set(x, "maxMemType1", value.asInstanceOf[js.Any])
    
    inline def setMaxMemType42(value: Double): Self = StObject.set(x, "maxMemType42", value.asInstanceOf[js.Any])
    
    inline def setMinMemType1(value: Double): Self = StObject.set(x, "minMemType1", value.asInstanceOf[js.Any])
    
    inline def setMinMemType42(value: Double): Self = StObject.set(x, "minMemType42", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setNumberOfGlyphs(value: Double): Self = StObject.set(x, "numberOfGlyphs", value.asInstanceOf[js.Any])
    
    inline def setNumberOfGlyphsUndefined: Self = StObject.set(x, "numberOfGlyphs", js.undefined)
    
    inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setUnderlinePosition(value: Double): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
    
    inline def setUnderlineThickness(value: Double): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
