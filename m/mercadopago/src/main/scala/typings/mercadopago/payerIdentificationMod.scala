package typings.mercadopago

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payerIdentificationMod {
  
  trait Identification extends StObject {
    
    var number: String
    
    var `type`: String
  }
  object Identification {
    
    inline def apply(number: String, `type`: String): Identification = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identification]
    }
    
    extension [Self <: Identification](x: Self) {
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
