package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(code = code, field = field, resource = resource)
  
    __obj.asInstanceOf[TeamsAddMemberResponseErrorsItem]
  }
}

