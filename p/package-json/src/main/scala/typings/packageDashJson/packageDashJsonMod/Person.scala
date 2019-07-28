package typings.packageDashJson.packageDashJsonMod

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
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Person]
  }
}

