package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `taskCollection.toJSON()`. */
trait TaskCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TaskData]] = js.undefined
}
object TaskCollectionData {
  
  inline def apply(): TaskCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskCollectionData]
  }
  
  extension [Self <: TaskCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[TaskData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TaskData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
