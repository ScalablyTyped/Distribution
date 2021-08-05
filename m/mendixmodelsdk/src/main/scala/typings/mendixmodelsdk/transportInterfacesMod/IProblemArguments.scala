package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProblemArguments extends StObject {
  
  var keys: js.Array[String]
  
  var values: js.Array[String]
}
object IProblemArguments {
  
  inline def apply(keys: js.Array[String], values: js.Array[String]): IProblemArguments = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProblemArguments]
  }
  
  extension [Self <: IProblemArguments](x: Self) {
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
