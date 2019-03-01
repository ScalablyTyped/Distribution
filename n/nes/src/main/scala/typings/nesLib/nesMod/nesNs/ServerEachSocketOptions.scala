package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerEachSocketOptions extends js.Object {
  var subscription: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[js.Any] = js.undefined
}

object ServerEachSocketOptions {
  @scala.inline
  def apply(subscription: java.lang.String = null, user: js.Any = null): ServerEachSocketOptions = {
    val __obj = js.Dynamic.literal()
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ServerEachSocketOptions]
  }
}

