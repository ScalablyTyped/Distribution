package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionTokenOption extends js.Object {
  var sessionToken: js.UndefOr[java.lang.String] = js.undefined
}

object SessionTokenOption {
  @scala.inline
  def apply(sessionToken: java.lang.String = null): SessionTokenOption = {
    val __obj = js.Dynamic.literal()
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    __obj.asInstanceOf[SessionTokenOption]
  }
}

