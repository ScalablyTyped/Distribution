package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailString extends js.Object {
  var email: js.UndefOr[String] = js.undefined
}

object EmailString {
  @scala.inline
  def apply(email: String = null): EmailString = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailString]
  }
}

