package typings
package npmDashListDashAuthorDashPackagesLib.npmDashListDashAuthorDashPackagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** registry port. Default: 443 (HTTPS) or 80 (HTTP). */
  var port: js.UndefOr[
    npmDashListDashAuthorDashPackagesLib.npmDashListDashAuthorDashPackagesLibNumbers.`443` | npmDashListDashAuthorDashPackagesLib.npmDashListDashAuthorDashPackagesLibNumbers.`80`
  ] = js.undefined
  /** registry protocol. Default: 'https'. */
  var protocol: js.UndefOr[
    npmDashListDashAuthorDashPackagesLib.npmDashListDashAuthorDashPackagesLibStrings.http | npmDashListDashAuthorDashPackagesLib.npmDashListDashAuthorDashPackagesLibStrings.https
  ] = js.undefined
  /** registry. Default: 'registry.npmjs.org'. */
  var registry: js.UndefOr[java.lang.String] = js.undefined
  /** author username (required). */
  var username: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    username: java.lang.String,
    port: npmDashListDashAuthorDashPackagesLib.npmDashListDashAuthorDashPackagesLibNumbers.`443` | npmDashListDashAuthorDashPackagesLib.npmDashListDashAuthorDashPackagesLibNumbers.`80` = null,
    protocol: npmDashListDashAuthorDashPackagesLib.npmDashListDashAuthorDashPackagesLibStrings.http | npmDashListDashAuthorDashPackagesLib.npmDashListDashAuthorDashPackagesLibStrings.https = null,
    registry: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(username = username)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Options]
  }
}

