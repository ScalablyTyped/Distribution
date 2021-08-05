package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialDefinition extends StObject {
  
  var data: js.Any
  
  var id: CredentialDefinitionID
  
  var schema_id: CredentialSchemaID
  
  var schema_name: String
  
  var version: String
}
object CredentialDefinition {
  
  inline def apply(
    data: js.Any,
    id: CredentialDefinitionID,
    schema_id: CredentialSchemaID,
    schema_name: String,
    version: String
  ): CredentialDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], schema_name = schema_name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialDefinition]
  }
  
  extension [Self <: CredentialDefinition](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: CredentialDefinitionID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSchema_id(value: CredentialSchemaID): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
    
    inline def setSchema_name(value: String): Self = StObject.set(x, "schema_name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
