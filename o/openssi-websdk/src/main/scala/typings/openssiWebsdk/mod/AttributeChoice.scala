package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeChoice extends StObject {
  
  var cred_def_id: CredentialDefinitionID
  
  var name: String
  
  var schema_id: CredentialSchemaID
  
  var value: String
}
object AttributeChoice {
  
  inline def apply(cred_def_id: CredentialDefinitionID, name: String, schema_id: CredentialSchemaID, value: String): AttributeChoice = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeChoice]
  }
  
  extension [Self <: AttributeChoice](x: Self) {
    
    inline def setCred_def_id(value: CredentialDefinitionID): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema_id(value: CredentialSchemaID): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
