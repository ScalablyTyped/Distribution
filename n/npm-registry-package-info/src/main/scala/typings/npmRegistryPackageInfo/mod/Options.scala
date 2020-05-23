package typings.npmRegistryPackageInfo.mod

import typings.npmRegistryPackageInfo.npmRegistryPackageInfoStrings.http
import typings.npmRegistryPackageInfo.npmRegistryPackageInfoStrings.https
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
    port: js.UndefOr[Double] = js.undefined,
    protocol: http | https = null,
    registry: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

