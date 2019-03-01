package typings
package npmDashRegistryDashPackageDashInfoLib.npmDashRegistryDashPackageDashInfoMod.pkginfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Boolean indicating whether to return only the latest package information from a registry. */
  var latest: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of package names (required). */
  var packages: js.Array[java.lang.String]
  /** Registry port. Default: 443 (HTTPS) or 80 (HTTP). */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Registry protocol. Default: 'https'. */
  var protocol: js.UndefOr[
    npmDashRegistryDashPackageDashInfoLib.npmDashRegistryDashPackageDashInfoLibStrings.http | npmDashRegistryDashPackageDashInfoLib.npmDashRegistryDashPackageDashInfoLibStrings.https
  ] = js.undefined
  /** Registry. Default: 'registry.npmjs.org'. */
  var registry: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    packages: js.Array[java.lang.String],
    latest: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    protocol: npmDashRegistryDashPackageDashInfoLib.npmDashRegistryDashPackageDashInfoLibStrings.http | npmDashRegistryDashPackageDashInfoLib.npmDashRegistryDashPackageDashInfoLibStrings.https = null,
    registry: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("packages")(packages)
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Options]
  }
}

