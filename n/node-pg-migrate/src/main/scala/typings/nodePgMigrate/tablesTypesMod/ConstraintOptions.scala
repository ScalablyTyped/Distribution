package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintOptions extends js.Object {
  var check: js.UndefOr[String | js.Array[String]] = js.native
  var comment: js.UndefOr[String] = js.native
  var deferrable: js.UndefOr[Boolean] = js.native
  var deferred: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[String] = js.native
  var foreignKeys: js.UndefOr[ForeignKeyOptions | js.Array[ForeignKeyOptions]] = js.native
  var primaryKey: js.UndefOr[Name | js.Array[Name]] = js.native
  var unique: js.UndefOr[Name | (js.Array[Name | js.Array[Name]])] = js.native
}

object ConstraintOptions {
  @scala.inline
  def apply(): ConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintOptions]
  }
  @scala.inline
  implicit class ConstraintOptionsOps[Self <: ConstraintOptions] (val x: Self) extends AnyVal {
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
    def setCheckVarargs(value: String*): Self = this.set("check", js.Array(value :_*))
    @scala.inline
    def setCheck(value: String | js.Array[String]): Self = this.set("check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setDeferrable(value: Boolean): Self = this.set("deferrable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferrable: Self = this.set("deferrable", js.undefined)
    @scala.inline
    def setDeferred(value: Boolean): Self = this.set("deferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    @scala.inline
    def setExclude(value: String): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setForeignKeysVarargs(value: ForeignKeyOptions*): Self = this.set("foreignKeys", js.Array(value :_*))
    @scala.inline
    def setForeignKeys(value: ForeignKeyOptions | js.Array[ForeignKeyOptions]): Self = this.set("foreignKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeignKeys: Self = this.set("foreignKeys", js.undefined)
    @scala.inline
    def setPrimaryKeyVarargs(value: Name*): Self = this.set("primaryKey", js.Array(value :_*))
    @scala.inline
    def setPrimaryKey(value: Name | js.Array[Name]): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setUniqueVarargs(value: (Name | js.Array[Name])*): Self = this.set("unique", js.Array(value :_*))
    @scala.inline
    def setUnique(value: Name | (js.Array[Name | js.Array[Name]])): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
  
}

