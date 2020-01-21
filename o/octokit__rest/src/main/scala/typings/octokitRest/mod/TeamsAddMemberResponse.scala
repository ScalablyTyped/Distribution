package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddMemberResponse extends js.Object {
  var errors: js.Array[TeamsAddMemberResponseErrorsItem]
  var message: String
}

object TeamsAddMemberResponse {
  @scala.inline
  def apply(errors: js.Array[TeamsAddMemberResponseErrorsItem], message: String): TeamsAddMemberResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsAddMemberResponse]
  }
}

