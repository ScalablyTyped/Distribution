package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredicateChoice extends js.Object {
  var cred_def_id: CredentialDefinitionID
  var predicate: String
  var schema_id: CredentialSchemaID
}

object PredicateChoice {
  @scala.inline
  def apply(cred_def_id: CredentialDefinitionID, predicate: String, schema_id: CredentialSchemaID): PredicateChoice = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateChoice]
  }
}

