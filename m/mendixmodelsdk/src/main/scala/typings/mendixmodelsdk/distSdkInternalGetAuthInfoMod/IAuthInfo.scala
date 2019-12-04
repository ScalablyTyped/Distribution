package typings.mendixmodelsdk.distSdkInternalGetAuthInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthInfo extends js.Object {
  var openid: js.UndefOr[String] = js.undefined
  var password: String
  var username: String
}

object IAuthInfo {
  @scala.inline
  def apply(password: String, username: String, openid: String = null): IAuthInfo = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (openid != null) __obj.updateDynamic("openid")(openid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthInfo]
  }
}

