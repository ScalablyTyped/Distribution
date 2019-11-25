package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.FULL
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.SIMPLE
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
    `match`: FULL | SIMPLE = null,
    onDelete: Action = null,
    onUpdate: Action = null,
    references: Name = null,
    referencesConstraintComment: String = null,
    referencesConstraintName: String = null
  ): ForeignKeyOptions = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (referencesConstraintComment != null) __obj.updateDynamic("referencesConstraintComment")(referencesConstraintComment.asInstanceOf[js.Any])
    if (referencesConstraintName != null) __obj.updateDynamic("referencesConstraintName")(referencesConstraintName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignKeyOptions]
  }
}

