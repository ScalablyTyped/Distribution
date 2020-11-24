package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the LinkedDataTypeCollection object, for use in `linkedDataTypeCollection.set({ ... })`. */
@js.native
trait LinkedDataTypeCollectionUpdateData extends js.Object {
  
  var items: js.UndefOr[js.Array[LinkedDataTypeData]] = js.native
}
object LinkedDataTypeCollectionUpdateData {
  
  @scala.inline
  def apply(): LinkedDataTypeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeCollectionUpdateData]
  }
  
  @scala.inline
  implicit class LinkedDataTypeCollectionUpdateDataOps[Self <: LinkedDataTypeCollectionUpdateData] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: LinkedDataTypeData*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[LinkedDataTypeData]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
