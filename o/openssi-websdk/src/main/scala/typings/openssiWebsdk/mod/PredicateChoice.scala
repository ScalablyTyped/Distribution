package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredicateChoice extends js.Object {
  var cred_def_id: CredentialDefinitionID = js.native
  var predicate: String = js.native
  var schema_id: CredentialSchemaID = js.native
}

object PredicateChoice {
  @scala.inline
  def apply(cred_def_id: CredentialDefinitionID, predicate: String, schema_id: CredentialSchemaID): PredicateChoice = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateChoice]
  }
  @scala.inline
  implicit class PredicateChoiceOps[Self <: PredicateChoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCred_def_id(value: CredentialDefinitionID): Self = this.set("cred_def_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicate(value: String): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema_id(value: CredentialSchemaID): Self = this.set("schema_id", value.asInstanceOf[js.Any])
  }
  
}

