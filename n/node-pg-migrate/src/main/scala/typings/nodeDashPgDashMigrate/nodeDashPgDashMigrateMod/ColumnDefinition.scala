package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.Anon_ALWAYS
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.FULL
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.SIMPLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends ReferencesOptions {
  var check: js.UndefOr[String] = js.undefined
  var collation: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String | Null] = js.undefined
  var default: js.UndefOr[Value] = js.undefined
  var deferrable: js.UndefOr[Boolean] = js.undefined
  var deferred: js.UndefOr[Boolean] = js.undefined
  var generated: js.UndefOr[Anon_ALWAYS with SequenceOptions] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var `type`: String
  var unique: js.UndefOr[Boolean] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    `type`: String,
    check: String = null,
    collation: String = null,
    comment: String = null,
    default: Value = null,
    deferrable: js.UndefOr[Boolean] = js.undefined,
    deferred: js.UndefOr[Boolean] = js.undefined,
    generated: Anon_ALWAYS with SequenceOptions = null,
    `match`: FULL | SIMPLE = null,
    notNull: js.UndefOr[Boolean] = js.undefined,
    onDelete: Action = null,
    onUpdate: Action = null,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    references: Name = null,
    referencesConstraintComment: String = null,
    referencesConstraintName: String = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (check != null) __obj.updateDynamic("check")(check)
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(deferrable)) __obj.updateDynamic("deferrable")(deferrable)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    if (generated != null) __obj.updateDynamic("generated")(generated)
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey)
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (referencesConstraintComment != null) __obj.updateDynamic("referencesConstraintComment")(referencesConstraintComment)
    if (referencesConstraintName != null) __obj.updateDynamic("referencesConstraintName")(referencesConstraintName)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[ColumnDefinition]
  }
}

