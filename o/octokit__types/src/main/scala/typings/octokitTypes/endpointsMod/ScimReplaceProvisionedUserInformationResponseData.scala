package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Created
import typings.octokitTypes.anon.FamilyName
import typings.octokitTypes.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimReplaceProvisionedUserInformationResponseData extends js.Object {
  var active: Boolean
  var emails: js.Array[Value]
  var externalId: String
  var id: String
  var meta: Created
  var name: FamilyName
  var schemas: js.Array[String]
  var userName: String
}

object ScimReplaceProvisionedUserInformationResponseData {
  @scala.inline
  def apply(
    active: Boolean,
    emails: js.Array[Value],
    externalId: String,
    id: String,
    meta: Created,
    name: FamilyName,
    schemas: js.Array[String],
    userName: String
  ): ScimReplaceProvisionedUserInformationResponseData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimReplaceProvisionedUserInformationResponseData]
  }
}

