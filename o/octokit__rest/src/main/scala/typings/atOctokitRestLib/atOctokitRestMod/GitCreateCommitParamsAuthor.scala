package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitParamsAuthor extends js.Object {
  var date: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object GitCreateCommitParamsAuthor {
  @scala.inline
  def apply(date: java.lang.String = null, email: java.lang.String = null, name: java.lang.String = null): GitCreateCommitParamsAuthor = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GitCreateCommitParamsAuthor]
  }
}

