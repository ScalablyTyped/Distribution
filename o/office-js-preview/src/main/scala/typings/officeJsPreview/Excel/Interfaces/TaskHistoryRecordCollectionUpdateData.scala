package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TaskHistoryRecordCollection object, for use in `taskHistoryRecordCollection.set({ ... })`. */
trait TaskHistoryRecordCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TaskHistoryRecordData]] = js.undefined
}
object TaskHistoryRecordCollectionUpdateData {
  
  @scala.inline
  def apply(): TaskHistoryRecordCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskHistoryRecordCollectionUpdateData]
  }
  
  @scala.inline
  implicit class TaskHistoryRecordCollectionUpdateDataMutableBuilder[Self <: TaskHistoryRecordCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TaskHistoryRecordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TaskHistoryRecordData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
