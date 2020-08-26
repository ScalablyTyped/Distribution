package typings.mongooseDelete.anon

import typings.mongooseDelete.mod.overridableMethods
import typings.mongooseDelete.mongooseDeleteStrings.all
import typings.mongooseDelete.mongooseDeleteStrings.deleteAt
import typings.mongooseDelete.mongooseDeleteStrings.deleted
import typings.mongooseDelete.mongooseDeleteStrings.deletedBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mongoose-delete.mongoose-delete.Options> */
@js.native
trait PartialOptions extends js.Object {
  var deletedAt: js.UndefOr[Boolean] = js.native
  var deletedBy: js.UndefOr[Boolean] = js.native
  var deletedByType: js.UndefOr[js.Any] = js.native
  var indexFields: js.UndefOr[Boolean | all | deleted | deleteAt | deletedBy] = js.native
  var overrideMethods: js.UndefOr[Boolean | all | js.Array[overridableMethods]] = js.native
  var validateBeforeDelete: js.UndefOr[Boolean] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setDeletedAt(value: Boolean): Self = this.set("deletedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedAt: Self = this.set("deletedAt", js.undefined)
    @scala.inline
    def setDeletedBy(value: Boolean): Self = this.set("deletedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedBy: Self = this.set("deletedBy", js.undefined)
    @scala.inline
    def setDeletedByType(value: js.Any): Self = this.set("deletedByType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedByType: Self = this.set("deletedByType", js.undefined)
    @scala.inline
    def setIndexFields(value: Boolean | all | deleted | deleteAt | deletedBy): Self = this.set("indexFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexFields: Self = this.set("indexFields", js.undefined)
    @scala.inline
    def setOverrideMethodsVarargs(value: overridableMethods*): Self = this.set("overrideMethods", js.Array(value :_*))
    @scala.inline
    def setOverrideMethods(value: Boolean | all | js.Array[overridableMethods]): Self = this.set("overrideMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideMethods: Self = this.set("overrideMethods", js.undefined)
    @scala.inline
    def setValidateBeforeDelete(value: Boolean): Self = this.set("validateBeforeDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateBeforeDelete: Self = this.set("validateBeforeDelete", js.undefined)
  }
  
}

