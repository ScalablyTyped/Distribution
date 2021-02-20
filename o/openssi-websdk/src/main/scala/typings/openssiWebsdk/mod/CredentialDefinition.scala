package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialDefinition extends StObject {
  
  var data: js.Any = js.native
  
  var id: CredentialDefinitionID = js.native
  
  var schema_id: CredentialSchemaID = js.native
  
  var schema_name: String = js.native
  
  var version: String = js.native
}
object CredentialDefinition {
  
  @scala.inline
  def apply(
    data: js.Any,
    id: CredentialDefinitionID,
    schema_id: CredentialSchemaID,
    schema_name: String,
    version: String
  ): CredentialDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], schema_name = schema_name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialDefinition]
  }
  
  @scala.inline
  implicit class CredentialDefinitionMutableBuilder[Self <: CredentialDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CredentialDefinitionID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_id(value: CredentialSchemaID): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema_name(value: String): Self = StObject.set(x, "schema_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
