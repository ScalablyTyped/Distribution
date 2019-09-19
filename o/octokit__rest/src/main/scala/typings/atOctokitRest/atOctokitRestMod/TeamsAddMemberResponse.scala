package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(errors = errors, message = message)
  
    __obj.asInstanceOf[TeamsAddMemberResponse]
  }
}

