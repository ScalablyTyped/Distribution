package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConstraintOptions extends js.Object {
  var check: js.UndefOr[java.lang.String] = js.undefined
  var deferrable: js.UndefOr[scala.Boolean] = js.undefined
  var deferred: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[java.lang.String] = js.undefined
  var foreignKeys: js.UndefOr[ForeignKeyOptions | js.Array[ForeignKeyOptions]] = js.undefined
  var primaryKey: js.UndefOr[Name | js.Array[Name]] = js.undefined
  var unique: js.UndefOr[js.Array[Name] | js.Array[js.Array[Name]]] = js.undefined
}

