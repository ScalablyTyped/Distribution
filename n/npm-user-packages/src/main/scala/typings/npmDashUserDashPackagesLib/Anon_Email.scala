package typings
package npmDashUserDashPackagesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(
    name: java.lang.String,
    email: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null
  ): Anon_Email = {
    val __obj = js.Dynamic.literal(name = name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Email]
  }
}

