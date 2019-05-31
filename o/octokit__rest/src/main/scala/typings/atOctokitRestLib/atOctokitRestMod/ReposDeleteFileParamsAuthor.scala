package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileParamsAuthor extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ReposDeleteFileParamsAuthor {
  @scala.inline
  def apply(email: java.lang.String = null, name: java.lang.String = null): ReposDeleteFileParamsAuthor = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ReposDeleteFileParamsAuthor]
  }
}

