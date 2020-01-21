package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitParamsAuthor extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object GitCreateCommitParamsAuthor {
  @scala.inline
  def apply(date: String = null, email: String = null, name: String = null): GitCreateCommitParamsAuthor = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateCommitParamsAuthor]
  }
}

