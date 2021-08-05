package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontConstructorOptionsBase extends StObject {
  
  var ascender: Double
  
  var descender: Double
  
  var familyName: String
  
  var styleName: String
  
  var unitsPerEm: Double
}
object FontConstructorOptionsBase {
  
  inline def apply(ascender: Double, descender: Double, familyName: String, styleName: String, unitsPerEm: Double): FontConstructorOptionsBase = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any], unitsPerEm = unitsPerEm.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConstructorOptionsBase]
  }
  
  extension [Self <: FontConstructorOptionsBase](x: Self) {
    
    inline def setAscender(value: Double): Self = StObject.set(x, "ascender", value.asInstanceOf[js.Any])
    
    inline def setDescender(value: Double): Self = StObject.set(x, "descender", value.asInstanceOf[js.Any])
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
    
    inline def setUnitsPerEm(value: Double): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
  }
}
