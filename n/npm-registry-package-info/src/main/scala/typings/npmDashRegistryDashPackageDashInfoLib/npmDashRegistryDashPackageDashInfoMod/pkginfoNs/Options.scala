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

