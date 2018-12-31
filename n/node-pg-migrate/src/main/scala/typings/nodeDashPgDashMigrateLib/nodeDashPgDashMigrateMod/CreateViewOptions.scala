package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateViewOptions extends js.Object {
  var checkOption: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.CASCADED | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.LOCAL
  ] = js.undefined
  var columns: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var temporary: js.UndefOr[scala.Boolean] = js.undefined
}

