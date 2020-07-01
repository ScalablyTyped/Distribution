package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipForUserLegacyResponse422Data extends js.Object {
  var errors: js.Array[Code]
  var message: String
}

object TeamsAddOrUpdateMembershipForUserLegacyResponse422Data {
  @scala.inline
  def apply(errors: js.Array[Code], message: String): TeamsAddOrUpdateMembershipForUserLegacyResponse422Data = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserLegacyResponse422Data]
  }
}

