package typings
package opentokLib.opentokMod.OpenTokNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOptions extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var expireTime: js.UndefOr[scala.Double] = js.undefined
  var role: js.UndefOr[Role] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(data: java.lang.String = null, expireTime: scala.Int | scala.Double = null, role: Role = null): TokenOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[TokenOptions]
  }
}

