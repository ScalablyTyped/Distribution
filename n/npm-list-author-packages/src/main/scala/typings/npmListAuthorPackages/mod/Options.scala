package typings.npmListAuthorPackages.mod

import typings.npmListAuthorPackages.npmListAuthorPackagesNumbers.`443`
import typings.npmListAuthorPackages.npmListAuthorPackagesNumbers.`80`
import typings.npmListAuthorPackages.npmListAuthorPackagesStrings.http
import typings.npmListAuthorPackages.npmListAuthorPackagesStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** registry port. Default: 443 (HTTPS) or 80 (HTTP). */
  var port: js.UndefOr[`443` | `80`] = js.undefined
  /** registry protocol. Default: 'https'. */
  var protocol: js.UndefOr[http | https] = js.undefined
  /** registry. Default: 'registry.npmjs.org'. */
  var registry: js.UndefOr[String] = js.undefined
  /** author username (required). */
  var username: String
}

object Options {
  @scala.inline
  def apply(
    username: String,
    port: `443` | `80` = null,
    protocol: http | https = null,
    registry: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

