package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddMemberResponseErrorsItem extends js.Object {
  var code: String
  var field: String
  var resource: String
}

object TeamsAddMemberResponseErrorsItem {
  @scala.inline
  def apply(code: String, field: String, resource: String): TeamsAddMemberResponseErrorsItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsAddMemberResponseErrorsItem]
  }
}

