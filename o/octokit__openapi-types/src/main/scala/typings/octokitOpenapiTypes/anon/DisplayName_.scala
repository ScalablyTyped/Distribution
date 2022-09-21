package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayName_ extends StObject {
  
  /** @description The name of the SCIM group. This must match the GitHub organization that the group maps to. */
  var displayName: String
  
  var members: js.UndefOr[js.Array[Value]] = js.undefined
  
  /** @description The SCIM schema URIs. */
  var schemas: js.Array[String]
}
object DisplayName_ {
  
  inline def apply(displayName: String, schemas: js.Array[String]): DisplayName_ = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName_]
  }
  
  extension [Self <: DisplayName_](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[Value]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: Value*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
