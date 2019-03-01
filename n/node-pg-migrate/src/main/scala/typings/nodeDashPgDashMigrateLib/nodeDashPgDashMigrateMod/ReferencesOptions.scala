package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferencesOptions extends js.Object {
  var `match`: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.FULL | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.SIMPLE
  ] = js.undefined
  var onDelete: js.UndefOr[Action] = js.undefined
  var onUpdate: js.UndefOr[Action] = js.undefined
  var references: js.UndefOr[Name] = js.undefined
  var referencesConstraintName: js.UndefOr[java.lang.String] = js.undefined
}

object ReferencesOptions {
  @scala.inline
  def apply(
    `match`: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.FULL | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.SIMPLE = null,
    onDelete: Action = null,
    onUpdate: Action = null,
    references: Name = null,
    referencesConstraintName: java.lang.String = null
  ): ReferencesOptions = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (referencesConstraintName != null) __obj.updateDynamic("referencesConstraintName")(referencesConstraintName)
    __obj.asInstanceOf[ReferencesOptions]
  }
}

