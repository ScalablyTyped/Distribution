package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextItem extends StObject {
  
  /**
    * - Text direction: 'ttb', 'ltr' or 'rtl'.
    */
  var dir: String
  
  /**
    * - Font name used by PDF.js for converted font.
    */
  var fontName: String
  
  /**
    * - Indicating if the text content is followed by a
    * line-break.
    */
  var hasEOL: Boolean
  
  /**
    * - Height in device space.
    */
  var height: Double
  
  /**
    * - Text content.
    */
  var str: String
  
  /**
    * - Transformation matrix.
    */
  var transform: js.Array[Any]
  
  /**
    * - Width in device space.
    */
  var width: Double
}
object TextItem {
  
  inline def apply(
    dir: String,
    fontName: String,
    hasEOL: Boolean,
    height: Double,
    str: String,
    transform: js.Array[Any],
    width: Double
  ): TextItem = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], hasEOL = hasEOL.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextItem]
  }
  
  extension [Self <: TextItem](x: Self) {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setHasEOL(value: Boolean): Self = StObject.set(x, "hasEOL", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: js.Array[Any]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformVarargs(value: Any*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
