package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialDefinition extends js.Object {
  var data: js.Any
  var id: CredentialDefinitionID
  var schema_id: CredentialSchemaID
  var schema_name: String
  var version: String
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
}

