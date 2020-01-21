package typings.parse

import typings.parse.mod._Global_.Parse.AuthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthData extends js.Object {
  var authData: js.UndefOr[AuthData] = js.undefined
}

object AnonAuthData {
  @scala.inline
  def apply(authData: AuthData = null): AnonAuthData = {
    val __obj = js.Dynamic.literal()
    if (authData != null) __obj.updateDynamic("authData")(authData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthData]
  }
}

