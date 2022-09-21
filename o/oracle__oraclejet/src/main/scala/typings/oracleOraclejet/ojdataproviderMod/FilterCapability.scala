package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCapability extends StObject {
  
  var operators: js.Array[String]
}
object FilterCapability {
  
  inline def apply(operators: js.Array[String]): FilterCapability = {
    val __obj = js.Dynamic.literal(operators = operators.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCapability]
  }
  
  extension [Self <: FilterCapability](x: Self) {
    
    inline def setOperators(value: js.Array[String]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsVarargs(value: String*): Self = StObject.set(x, "operators", js.Array(value*))
  }
}
