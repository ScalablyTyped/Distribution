package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends ReferencesOptions {
  var check: js.UndefOr[java.lang.String] = js.undefined
  var collation: js.UndefOr[java.lang.String] = js.undefined
  var comment: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var default: js.UndefOr[Value] = js.undefined
  var deferrable: js.UndefOr[scala.Boolean] = js.undefined
  var deferred: js.UndefOr[scala.Boolean] = js.undefined
  var notNull: js.UndefOr[scala.Boolean] = js.undefined
  var primaryKey: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    check: java.lang.String = null,
    collation: java.lang.String = null,
    comment: java.lang.String = null,
    default: Value = null,
    deferrable: js.UndefOr[scala.Boolean] = js.undefined,
    deferred: js.UndefOr[scala.Boolean] = js.undefined,
    `match`: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.FULL | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.SIMPLE = null,
    notNull: js.UndefOr[scala.Boolean] = js.undefined,
    onDelete: Action = null,
    onUpdate: Action = null,
    primaryKey: js.UndefOr[scala.Boolean] = js.undefined,
    references: Name = null,
    referencesConstraintName: java.lang.String = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (check != null) __obj.updateDynamic("check")(check)
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(deferrable)) __obj.updateDynamic("deferrable")(deferrable)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey)
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (referencesConstraintName != null) __obj.updateDynamic("referencesConstraintName")(referencesConstraintName)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[ColumnDefinition]
  }
}

