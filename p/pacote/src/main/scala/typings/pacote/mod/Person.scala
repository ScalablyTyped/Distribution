package typings.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var name: String
  var url: js.UndefOr[String] = js.undefined
}

object Person {
  @scala.inline
  def apply(name: String, email: String = null, url: String = null): Person = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
}

