package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialSchema extends js.Object {
  var attr_names: js.Array[String]
  var id: CredentialSchemaID
  var name: String
  var namever: String
  var version: String
}

object CredentialSchema {
  @scala.inline
  def apply(
    attr_names: js.Array[String],
    id: CredentialSchemaID,
    name: String,
    namever: String,
    version: String
  ): CredentialSchema = {
    val __obj = js.Dynamic.literal(attr_names = attr_names.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namever = namever.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialSchema]
  }
}

