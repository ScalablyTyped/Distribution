package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddMemberResponse extends js.Object {
  var errors: js.UndefOr[js.Array[TeamsAddMemberResponseErrorsItem]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object TeamsAddMemberResponse {
  @scala.inline
  def apply(errors: js.Array[TeamsAddMemberResponseErrorsItem] = null, message: java.lang.String = null): TeamsAddMemberResponse = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[TeamsAddMemberResponse]
  }
}

