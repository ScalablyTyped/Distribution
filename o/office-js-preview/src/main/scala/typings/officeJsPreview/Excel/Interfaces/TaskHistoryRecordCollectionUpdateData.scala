package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TaskHistoryRecordCollection object, for use in `taskHistoryRecordCollection.set({ ... })`. */
@js.native
trait TaskHistoryRecordCollectionUpdateData extends js.Object {
  
  var items: js.UndefOr[js.Array[TaskHistoryRecordData]] = js.native
}
object TaskHistoryRecordCollectionUpdateData {
  
  @scala.inline
  def apply(): TaskHistoryRecordCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskHistoryRecordCollectionUpdateData]
  }
  
  @scala.inline
  implicit class TaskHistoryRecordCollectionUpdateDataOps[Self <: TaskHistoryRecordCollectionUpdateData] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: TaskHistoryRecordData*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[TaskHistoryRecordData]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
