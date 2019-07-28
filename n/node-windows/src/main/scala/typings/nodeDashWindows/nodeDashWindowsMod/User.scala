package typings.nodeDashWindows.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var account: String
  var domain: String
  var mungeCredentialsAfterInstall: js.UndefOr[Boolean] = js.undefined
  var password: String
}

object User {
  @scala.inline
  def apply(
    account: String,
    domain: String,
    password: String,
    mungeCredentialsAfterInstall: js.UndefOr[Boolean] = js.undefined
  ): User = {
    val __obj = js.Dynamic.literal(account = account, domain = domain, password = password)
    if (!js.isUndefined(mungeCredentialsAfterInstall)) __obj.updateDynamic("mungeCredentialsAfterInstall")(mungeCredentialsAfterInstall)
    __obj.asInstanceOf[User]
  }
}

