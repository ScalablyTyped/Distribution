package typings
package nodeDashWindowsLib.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var account: java.lang.String
  var domain: java.lang.String
  var mungeCredentialsAfterInstall: js.UndefOr[scala.Boolean] = js.undefined
  var password: java.lang.String
}

object User {
  @scala.inline
  def apply(
    account: java.lang.String,
    domain: java.lang.String,
    password: java.lang.String,
    mungeCredentialsAfterInstall: js.UndefOr[scala.Boolean] = js.undefined
  ): User = {
    val __obj = js.Dynamic.literal(account = account, domain = domain, password = password)
    if (!js.isUndefined(mungeCredentialsAfterInstall)) __obj.updateDynamic("mungeCredentialsAfterInstall")(mungeCredentialsAfterInstall)
    __obj.asInstanceOf[User]
  }
}

