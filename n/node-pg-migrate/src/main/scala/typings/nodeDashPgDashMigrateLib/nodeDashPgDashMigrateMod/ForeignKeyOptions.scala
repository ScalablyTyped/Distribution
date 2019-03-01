package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignKeyOptions extends ReferencesOptions {
  var columns: Name | js.Array[Name]
}

object ForeignKeyOptions {
  @scala.inline
  def apply(
    columns: Name | js.Array[Name],
    `match`: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.FULL | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.SIMPLE = null,
    onDelete: Action = null,
    onUpdate: Action = null,
    references: Name = null,
    referencesConstraintName: java.lang.String = null
  ): ForeignKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (referencesConstraintName != null) __obj.updateDynamic("referencesConstraintName")(referencesConstraintName)
    __obj.asInstanceOf[ForeignKeyOptions]
  }
}

