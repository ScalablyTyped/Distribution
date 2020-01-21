package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOptions extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var expireTime: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[Role] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(data: String = null, expireTime: Int | Double = null, role: Role = null): TokenOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenOptions]
  }
}

