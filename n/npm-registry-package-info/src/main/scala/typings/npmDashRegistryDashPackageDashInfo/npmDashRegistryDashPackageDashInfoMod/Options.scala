package typings.npmDashRegistryDashPackageDashInfo.npmDashRegistryDashPackageDashInfoMod

import typings.npmDashRegistryDashPackageDashInfo.npmDashRegistryDashPackageDashInfoStrings.http
import typings.npmDashRegistryDashPackageDashInfo.npmDashRegistryDashPackageDashInfoStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Boolean indicating whether to return only the latest package information from a registry. */
  var latest: js.UndefOr[Boolean] = js.undefined
  /** Array of package names (required). */
  var packages: js.Array[String]
  /** Registry port. Default: 443 (HTTPS) or 80 (HTTP). */
  var port: js.UndefOr[Double] = js.undefined
  /** Registry protocol. Default: 'https'. */
  var protocol: js.UndefOr[http | https] = js.undefined
  /** Registry. Default: 'registry.npmjs.org'. */
  var registry: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    packages: js.Array[String],
    latest: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    protocol: http | https = null,
    registry: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(packages = packages)
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Options]
  }
}

