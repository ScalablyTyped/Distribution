package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialDefinition extends js.Object {
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
  implicit class CredentialDefinitionOps[Self <: CredentialDefinition] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: CredentialDefinitionID): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema_id(value: CredentialSchemaID): Self = this.set("schema_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema_name(value: String): Self = this.set("schema_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

