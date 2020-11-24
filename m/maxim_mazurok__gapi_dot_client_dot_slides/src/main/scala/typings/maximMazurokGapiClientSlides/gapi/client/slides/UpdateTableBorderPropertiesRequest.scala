package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableBorderPropertiesRequest extends js.Object {
  
  /** The border position in the table range the updates should apply to. If a border position is not specified, the updates will apply to all borders in the table range. */
  var borderPosition: js.UndefOr[String] = js.native
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableBorderProperties` is implied and should not be specified. A single `"*"` can be used as
    * short-hand for listing every field. For example to update the table border solid fill color, set `fields` to `"tableBorderFill.solidFill.color"`. To reset a property to its default
    * value, include its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  
  /** The object ID of the table. */
  var objectId: js.UndefOr[String] = js.native
  
  /** The table border properties to update. */
  var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.native
  
  /** The table range representing the subset of the table to which the updates are applied. If a table range is not specified, the updates will apply to the entire table. */
  var tableRange: js.UndefOr[TableRange] = js.native
}
object UpdateTableBorderPropertiesRequest {
  
  @scala.inline
  def apply(): UpdateTableBorderPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableBorderPropertiesRequest]
  }
  
  @scala.inline
  implicit class UpdateTableBorderPropertiesRequestOps[Self <: UpdateTableBorderPropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setBorderPosition(value: String): Self = this.set("borderPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderPosition: Self = this.set("borderPosition", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setTableBorderProperties(value: TableBorderProperties): Self = this.set("tableBorderProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBorderProperties: Self = this.set("tableBorderProperties", js.undefined)
    
    @scala.inline
    def setTableRange(value: TableRange): Self = this.set("tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRange: Self = this.set("tableRange", js.undefined)
  }
}
