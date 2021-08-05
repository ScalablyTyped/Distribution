package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `taskHistoryRecordCollection.toJSON()`. */
trait TaskHistoryRecordCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TaskHistoryRecordData]] = js.undefined
}
object TaskHistoryRecordCollectionData {
  
  inline def apply(): TaskHistoryRecordCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskHistoryRecordCollectionData]
  }
  
  extension [Self <: TaskHistoryRecordCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[TaskHistoryRecordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TaskHistoryRecordData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
