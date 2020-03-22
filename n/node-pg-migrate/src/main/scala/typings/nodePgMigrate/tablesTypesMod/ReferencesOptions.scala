package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateStrings.FULL
import typings.nodePgMigrate.nodePgMigrateStrings.SIMPLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferencesOptions extends js.Object {
  var `match`: js.UndefOr[FULL | SIMPLE] = js.undefined
  var onDelete: js.UndefOr[Action] = js.undefined
  var onUpdate: js.UndefOr[Action] = js.undefined
  var references: Name
  var referencesConstraintComment: js.UndefOr[String] = js.undefined
  var referencesConstraintName: js.UndefOr[String] = js.undefined
}

object ReferencesOptions {
  @scala.inline
  def apply(
    references: Name,
    `match`: FULL | SIMPLE = null,
    onDelete: Action = null,
    onUpdate: Action = null,
    referencesConstraintComment: String = null,
    referencesConstraintName: String = null
  ): ReferencesOptions = {
    val __obj = js.Dynamic.literal(references = references.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    if (referencesConstraintComment != null) __obj.updateDynamic("referencesConstraintComment")(referencesConstraintComment.asInstanceOf[js.Any])
    if (referencesConstraintName != null) __obj.updateDynamic("referencesConstraintName")(referencesConstraintName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencesOptions]
  }
}

