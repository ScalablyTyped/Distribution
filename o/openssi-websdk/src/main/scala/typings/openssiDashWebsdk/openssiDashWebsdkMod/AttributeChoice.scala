package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeChoice extends js.Object {
  var cred_def_id: CredentialDefinitionID
  var name: String
  var schema_id: CredentialSchemaID
  var value: String
}

object AttributeChoice {
  @scala.inline
  def apply(cred_def_id: CredentialDefinitionID, name: String, schema_id: CredentialSchemaID, value: String): AttributeChoice = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttributeChoice]
  }
}

