package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateStrings.FULL
import typings.nodePgMigrate.nodePgMigrateStrings.SIMPLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<node-pg-migrate.node-pg-migrate/dist/operations/tablesTypes.ReferencesOptions> */
trait ColumnDefinition extends js.Object {
  var check: js.UndefOr[String] = js.undefined
  var collation: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String | Null] = js.undefined
  var default: js.UndefOr[Value] = js.undefined
  var deferrable: js.UndefOr[Boolean] = js.undefined
  var deferred: js.UndefOr[Boolean] = js.undefined
  var expressionGenerated: js.UndefOr[String] = js.undefined
  /**
    * @deprecated use sequenceGenerated
    */
  var generated: js.UndefOr[SequenceGeneratedOptions] = js.undefined
  var `match`: js.UndefOr[FULL | SIMPLE] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
  var onDelete: js.UndefOr[Action] = js.undefined
  var onUpdate: js.UndefOr[Action] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var references: js.UndefOr[Name] = js.undefined
  var referencesConstraintComment: js.UndefOr[String] = js.undefined
  var referencesConstraintName: js.UndefOr[String] = js.undefined
  var sequenceGenerated: js.UndefOr[SequenceGeneratedOptions] = js.undefined
  var `type`: String
  var unique: js.UndefOr[Boolean] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    `type`: String,
    check: String = null,
    collation: String = null,
    comment: js.UndefOr[Null | String] = js.undefined,
    default: js.UndefOr[Null | Value] = js.undefined,
    deferrable: js.UndefOr[Boolean] = js.undefined,
    deferred: js.UndefOr[Boolean] = js.undefined,
    expressionGenerated: String = null,
    generated: SequenceGeneratedOptions = null,
    `match`: FULL | SIMPLE = null,
    notNull: js.UndefOr[Boolean] = js.undefined,
    onDelete: Action = null,
    onUpdate: Action = null,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    references: Name = null,
    referencesConstraintComment: String = null,
    referencesConstraintName: String = null,
    sequenceGenerated: SequenceGeneratedOptions = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(deferrable)) __obj.updateDynamic("deferrable")(deferrable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred.get.asInstanceOf[js.Any])
    if (expressionGenerated != null) __obj.updateDynamic("expressionGenerated")(expressionGenerated.asInstanceOf[js.Any])
    if (generated != null) __obj.updateDynamic("generated")(generated.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.get.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey.get.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (referencesConstraintComment != null) __obj.updateDynamic("referencesConstraintComment")(referencesConstraintComment.asInstanceOf[js.Any])
    if (referencesConstraintName != null) __obj.updateDynamic("referencesConstraintName")(referencesConstraintName.asInstanceOf[js.Any])
    if (sequenceGenerated != null) __obj.updateDynamic("sequenceGenerated")(sequenceGenerated.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
}

