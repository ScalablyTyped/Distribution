package typings
package pkgDashConfLib.pkgDashConfMod.pkgConfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  // Directory to start looking up for a package.json file.
  // Default: process.cwd()
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  // Default config.
  var defaults: js.UndefOr[js.Object] = js.undefined
  // Skip package.json files that have the namespaced config explicitly set to false.
  var skipOnFalse: js.UndefOr[scala.Boolean] = js.undefined
}

