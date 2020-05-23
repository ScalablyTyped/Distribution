package typings.passport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProperty extends js.Object {
  var userProperty: String
}

object UserProperty {
  @scala.inline
  def apply(userProperty: String): UserProperty = {
    val __obj = js.Dynamic.literal(userProperty = userProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProperty]
  }
}

