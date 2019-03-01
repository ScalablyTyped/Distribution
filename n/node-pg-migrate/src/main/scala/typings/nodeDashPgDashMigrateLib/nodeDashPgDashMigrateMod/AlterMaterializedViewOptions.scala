package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterMaterializedViewOptions extends js.Object {
  var cluster: js.UndefOr[
    scala.Null | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false` | java.lang.String
  ] = js.undefined
  var extension: js.UndefOr[java.lang.String] = js.undefined
  var storageParameters: js.UndefOr[js.Object] = js.undefined
}

object AlterMaterializedViewOptions {
  @scala.inline
  def apply(
    cluster: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false` | java.lang.String = null,
    extension: java.lang.String = null,
    storageParameters: js.Object = null
  ): AlterMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (storageParameters != null) __obj.updateDynamic("storageParameters")(storageParameters)
    __obj.asInstanceOf[AlterMaterializedViewOptions]
  }
}

