package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restriction extends js.Object {
  var cred_def_id: js.UndefOr[CredentialDefinitionID] = js.undefined
  var issuer_did: js.UndefOr[DID] = js.undefined
  var schema_id: js.UndefOr[CredentialSchemaID] = js.undefined
  var schema_issuer_did: js.UndefOr[DID] = js.undefined
  var schema_name: js.UndefOr[String] = js.undefined
  var schema_version: js.UndefOr[String] = js.undefined
}

object Restriction {
  @scala.inline
  def apply(
    cred_def_id: CredentialDefinitionID = null,
    issuer_did: DID = null,
    schema_id: CredentialSchemaID = null,
    schema_issuer_did: DID = null,
    schema_name: String = null,
    schema_version: String = null
  ): Restriction = {
    val __obj = js.Dynamic.literal()
    if (cred_def_id != null) __obj.updateDynamic("cred_def_id")(cred_def_id.asInstanceOf[js.Any])
    if (issuer_did != null) __obj.updateDynamic("issuer_did")(issuer_did.asInstanceOf[js.Any])
    if (schema_id != null) __obj.updateDynamic("schema_id")(schema_id.asInstanceOf[js.Any])
    if (schema_issuer_did != null) __obj.updateDynamic("schema_issuer_did")(schema_issuer_did.asInstanceOf[js.Any])
    if (schema_name != null) __obj.updateDynamic("schema_name")(schema_name.asInstanceOf[js.Any])
    if (schema_version != null) __obj.updateDynamic("schema_version")(schema_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Restriction]
  }
}

