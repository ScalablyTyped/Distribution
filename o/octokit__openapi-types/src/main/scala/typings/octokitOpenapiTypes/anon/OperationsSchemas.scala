package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationsSchemas extends StObject {
  
  /**
    * @description Set of operations to be performed
    * @example [
    *   {
    *     "op": "replace",
    *     "value": {
    *       "active": false
    *     }
    *   }
    * ]
    */
  var Operations: js.Array[OpPath]
  
  var schemas: js.UndefOr[js.Array[String]] = js.undefined
}
object OperationsSchemas {
  
  inline def apply(Operations: js.Array[OpPath]): OperationsSchemas = {
    val __obj = js.Dynamic.literal(Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationsSchemas]
  }
  
  extension [Self <: OperationsSchemas](x: Self) {
    
    inline def setOperations(value: js.Array[OpPath]): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: OpPath*): Self = StObject.set(x, "Operations", js.Array(value*))
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
