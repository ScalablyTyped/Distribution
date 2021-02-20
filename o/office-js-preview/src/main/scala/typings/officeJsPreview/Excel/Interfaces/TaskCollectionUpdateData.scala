package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TaskCollection object, for use in `taskCollection.set({ ... })`. */
@js.native
trait TaskCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TaskData]] = js.native
}
object TaskCollectionUpdateData {
  
  @scala.inline
  def apply(): TaskCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskCollectionUpdateData]
  }
  
  @scala.inline
  implicit class TaskCollectionUpdateDataMutableBuilder[Self <: TaskCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TaskData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TaskData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
