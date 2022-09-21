package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operations extends StObject {
  
  /** @description Array of [SCIM operations](https://tools.ietf.org/html/rfc7644#section-3.5.2). */
  var Operations: js.Array[Op]
  
  /** @description The SCIM schema URIs. */
  var schemas: js.Array[String]
}
object Operations {
  
  inline def apply(Operations: js.Array[Op], schemas: js.Array[String]): Operations = {
    val __obj = js.Dynamic.literal(Operations = Operations.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operations]
  }
  
  extension [Self <: Operations](x: Self) {
    
    inline def setOperations(value: js.Array[Op]): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: Op*): Self = StObject.set(x, "Operations", js.Array(value*))
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
