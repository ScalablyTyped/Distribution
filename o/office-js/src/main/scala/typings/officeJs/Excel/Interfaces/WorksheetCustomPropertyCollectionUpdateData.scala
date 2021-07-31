package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the WorksheetCustomPropertyCollection object, for use in `worksheetCustomPropertyCollection.set({ ... })`. */
trait WorksheetCustomPropertyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[WorksheetCustomPropertyData]] = js.undefined
}
object WorksheetCustomPropertyCollectionUpdateData {
  
  @scala.inline
  def apply(): WorksheetCustomPropertyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyCollectionUpdateData]
  }
  
  @scala.inline
  implicit class WorksheetCustomPropertyCollectionUpdateDataMutableBuilder[Self <: WorksheetCustomPropertyCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[WorksheetCustomPropertyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: WorksheetCustomPropertyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
