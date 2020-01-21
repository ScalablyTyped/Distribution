package typings.packageJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  val email: js.UndefOr[String] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  val url: js.UndefOr[String] = js.undefined
}

object Person {
  @scala.inline
  def apply(email: String = null, name: String = null, url: String = null): Person = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
}

