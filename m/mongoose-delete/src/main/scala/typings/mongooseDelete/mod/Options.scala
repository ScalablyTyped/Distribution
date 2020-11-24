package typings.mongooseDelete.mod

import typings.mongooseDelete.mongooseDeleteStrings.all
import typings.mongooseDelete.mongooseDeleteStrings.deleteAt
import typings.mongooseDelete.mongooseDeleteStrings.deleted
import typings.mongooseDelete.mongooseDeleteStrings.deletedBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var deletedAt: Boolean = js.native
  
  var deletedBy: Boolean = js.native
  
  /**
    * DeleteBy Schema type, equal to
    * ```
    * Schema({
    * deletedBy: {
    *  type: options.deletedByType
    *  }
    * })
    * ```
    * @default ObjectId
    */
  var deletedByType: js.Any = js.native
  
  var indexFields: Boolean | all | (js.Array[deleted | deleteAt | deletedBy]) = js.native
  
  var overrideMethods: Boolean | all | js.Array[overridableMethods] = js.native
  
  var validateBeforeDelete: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(
    deletedAt: Boolean,
    deletedBy: Boolean,
    deletedByType: js.Any,
    indexFields: Boolean | all | (js.Array[deleted | deleteAt | deletedBy]),
    overrideMethods: Boolean | all | js.Array[overridableMethods],
    validateBeforeDelete: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedByType = deletedByType.asInstanceOf[js.Any], indexFields = indexFields.asInstanceOf[js.Any], overrideMethods = overrideMethods.asInstanceOf[js.Any], validateBeforeDelete = validateBeforeDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDeletedBy(value: Boolean): Self = this.set("deletedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedByType(value: js.Any): Self = this.set("deletedByType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexFieldsVarargs(value: (deleted | deleteAt | deletedBy)*): Self = this.set("indexFields", js.Array(value :_*))
    
    @scala.inline
    def setIndexFields(value: Boolean | all | (js.Array[deleted | deleteAt | deletedBy])): Self = this.set("indexFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideMethodsVarargs(value: overridableMethods*): Self = this.set("overrideMethods", js.Array(value :_*))
    
    @scala.inline
    def setOverrideMethods(value: Boolean | all | js.Array[overridableMethods]): Self = this.set("overrideMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateBeforeDelete(value: Boolean): Self = this.set("validateBeforeDelete", value.asInstanceOf[js.Any])
  }
}
