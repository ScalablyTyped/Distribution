package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddMemberLegacyResponse extends js.Object {
  var errors: js.Array[TeamsAddMemberLegacyResponseErrorsItem]
  var message: String
}

object TeamsAddMemberLegacyResponse {
  @scala.inline
  def apply(errors: js.Array[TeamsAddMemberLegacyResponseErrorsItem], message: String): TeamsAddMemberLegacyResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsAddMemberLegacyResponse]
  }
}

