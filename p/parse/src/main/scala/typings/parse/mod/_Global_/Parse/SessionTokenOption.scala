package typings.parse.mod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionTokenOption extends js.Object {
  var sessionToken: js.UndefOr[String] = js.undefined
}

object SessionTokenOption {
  @scala.inline
  def apply(sessionToken: String = null): SessionTokenOption = {
    val __obj = js.Dynamic.literal()
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionTokenOption]
  }
}

