package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipForUserInOrgResponse422Data extends js.Object {
  var errors: js.Array[Code]
  var message: String
}

object TeamsAddOrUpdateMembershipForUserInOrgResponse422Data {
  @scala.inline
  def apply(errors: js.Array[Code], message: String): TeamsAddOrUpdateMembershipForUserInOrgResponse422Data = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserInOrgResponse422Data]
  }
}

