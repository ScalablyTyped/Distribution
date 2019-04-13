package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddMemberResponseErrorsItem extends js.Object {
  var code: java.lang.String
  var field: java.lang.String
  var resource: java.lang.String
}

object TeamsAddMemberResponseErrorsItem {
  @scala.inline
  def apply(code: java.lang.String, field: java.lang.String, resource: java.lang.String): TeamsAddMemberResponseErrorsItem = {
    val __obj = js.Dynamic.literal(code = code, field = field, resource = resource)
  
    __obj.asInstanceOf[TeamsAddMemberResponseErrorsItem]
  }
}

