package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateStrings.FULL
import typings.nodePgMigrate.nodePgMigrateStrings.SIMPLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferencesOptions extends js.Object {
  var `match`: js.UndefOr[FULL | SIMPLE] = js.native
  var onDelete: js.UndefOr[Action] = js.native
  var onUpdate: js.UndefOr[Action] = js.native
  var references: Name = js.native
  var referencesConstraintComment: js.UndefOr[String] = js.native
  var referencesConstraintName: js.UndefOr[String] = js.native
}

object ReferencesOptions {
  @scala.inline
  def apply(references: Name): ReferencesOptions = {
    val __obj = js.Dynamic.literal(references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencesOptions]
  }
  @scala.inline
  implicit class ReferencesOptionsOps[Self <: ReferencesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReferences(value: Name): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: FULL | SIMPLE): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setOnDelete(value: Action): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    @scala.inline
    def setOnUpdate(value: Action): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setReferencesConstraintComment(value: String): Self = this.set("referencesConstraintComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferencesConstraintComment: Self = this.set("referencesConstraintComment", js.undefined)
    @scala.inline
    def setReferencesConstraintName(value: String): Self = this.set("referencesConstraintName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferencesConstraintName: Self = this.set("referencesConstraintName", js.undefined)
  }
  
}

