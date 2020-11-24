package typings.mongooseSequence.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceOptions extends js.Object {
  
              // If true, the counter will not be incremented on saving a new document. Default to false
  var collection_name: js.UndefOr[String] = js.native
  
     // The field to reference for a scoped counter. Optional
  var disable_hooks: js.UndefOr[Boolean] = js.native
  
                    // The name of the field to increment. Mandatory, default is _id
  var id: js.UndefOr[String] = js.native
  
  var inc_field: String = js.native
  
                          // Id of the sequence. Is mandatory only for scoped sequences but its use is strongly encouraged.
  var reference_fields: js.UndefOr[js.Array[String]] = js.native
}
object SequenceOptions {
  
  @scala.inline
  def apply(inc_field: String): SequenceOptions = {
    val __obj = js.Dynamic.literal(inc_field = inc_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceOptions]
  }
  
  @scala.inline
  implicit class SequenceOptionsOps[Self <: SequenceOptions] (val x: Self) extends AnyVal {
    
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
    def setInc_field(value: String): Self = this.set("inc_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection_name(value: String): Self = this.set("collection_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection_name: Self = this.set("collection_name", js.undefined)
    
    @scala.inline
    def setDisable_hooks(value: Boolean): Self = this.set("disable_hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_hooks: Self = this.set("disable_hooks", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setReference_fieldsVarargs(value: String*): Self = this.set("reference_fields", js.Array(value :_*))
    
    @scala.inline
    def setReference_fields(value: js.Array[String]): Self = this.set("reference_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference_fields: Self = this.set("reference_fields", js.undefined)
  }
}
