package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `taskCollection.toJSON()`. */
trait TaskCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TaskData]] = js.undefined
}
object TaskCollectionData {
  
  @scala.inline
  def apply(): TaskCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskCollectionData]
  }
  
  @scala.inline
  implicit class TaskCollectionDataMutableBuilder[Self <: TaskCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TaskData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TaskData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
