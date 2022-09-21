package typings.mercadopago

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneMod {
  
  trait Phone extends StObject {
    
    var area_code: String
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var number: String
  }
  object Phone {
    
    inline def apply(area_code: String, number: String): Phone = {
      val __obj = js.Dynamic.literal(area_code = area_code.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Phone]
    }
    
    extension [Self <: Phone](x: Self) {
      
      inline def setArea_code(value: String): Self = StObject.set(x, "area_code", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
}
