package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schemas extends StObject {
  
  /** @description Array of [SCIM operations](https://tools.ietf.org/html/rfc7644#section-3.5.2). */
  var Operations: js.Array[StringDictionary[Any]]
  
  /** @description The SCIM schema URIs. */
  var schemas: js.Array[String]
}
object Schemas {
  
  inline def apply(Operations: js.Array[StringDictionary[Any]], schemas: js.Array[String]): Schemas = {
    val __obj = js.Dynamic.literal(Operations = Operations.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schemas]
  }
  
  extension [Self <: Schemas](x: Self) {
    
    inline def setOperations(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "Operations", js.Array(value*))
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
