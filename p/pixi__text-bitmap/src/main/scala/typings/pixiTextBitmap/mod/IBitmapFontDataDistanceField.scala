package typings.pixiTextBitmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  extension [Self <: IBitmapFontDataDistanceField](x: Self) {
    
    inline def setDistanceRange(value: Double): Self = StObject.set(x, "distanceRange", value.asInstanceOf[js.Any])
    
    inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
  }
}
