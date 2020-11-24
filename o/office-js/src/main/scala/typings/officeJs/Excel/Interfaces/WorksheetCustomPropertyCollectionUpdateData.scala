package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the WorksheetCustomPropertyCollection object, for use in `worksheetCustomPropertyCollection.set({ ... })`. */
@js.native
trait WorksheetCustomPropertyCollectionUpdateData extends js.Object {
  
  var items: js.UndefOr[js.Array[WorksheetCustomPropertyData]] = js.native
}
object WorksheetCustomPropertyCollectionUpdateData {
  
  @scala.inline
  def apply(): WorksheetCustomPropertyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyCollectionUpdateData]
  }
  
  @scala.inline
  implicit class WorksheetCustomPropertyCollectionUpdateDataOps[Self <: WorksheetCustomPropertyCollectionUpdateData] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: WorksheetCustomPropertyData*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[WorksheetCustomPropertyData]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
