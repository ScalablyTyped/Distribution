package typings.openssiDashWebsdk.openssiDashWebsdkMod

import typings.openssiDashWebsdk.Anon_Attributes
import typings.openssiDashWebsdk.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credential extends js.Object {
  var credential_definition_id: CredentialDefinitionID
  var id: String
  var issuer_did: DID
  var offer: js.UndefOr[Anon_Attributes] = js.undefined
  var properties: Properties
  var role: String
  var schema_name: String
  var schema_version: String
  var state: CredentialState
  var to: Anon_Name
}

object Credential {
  @scala.inline
  def apply(
    credential_definition_id: CredentialDefinitionID,
    id: String,
    issuer_did: DID,
    properties: Properties,
    role: String,
    schema_name: String,
    schema_version: String,
    state: CredentialState,
    to: Anon_Name,
    offer: Anon_Attributes = null
  ): Credential = {
    val __obj = js.Dynamic.literal(credential_definition_id = credential_definition_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issuer_did = issuer_did.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], schema_name = schema_name.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (offer != null) __obj.updateDynamic("offer")(offer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
}

