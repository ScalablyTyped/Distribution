package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeChoice extends js.Object {
  var cred_def_id: CredentialDefinitionID = js.native
  var name: String = js.native
  var schema_id: CredentialSchemaID = js.native
  var value: String = js.native
}

object AttributeChoice {
  @scala.inline
  def apply(cred_def_id: CredentialDefinitionID, name: String, schema_id: CredentialSchemaID, value: String): AttributeChoice = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeChoice]
  }
  @scala.inline
  implicit class AttributeChoiceOps[Self <: AttributeChoice] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema_id(value: CredentialSchemaID): Self = this.set("schema_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

