package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the WorksheetCollection object, for use in `worksheetCollection.set({ ... })`. */
@js.native
trait WorksheetCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[WorksheetData]] = js.native
}
object WorksheetCollectionUpdateData {
  
  @scala.inline
  def apply(): WorksheetCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCollectionUpdateData]
  }
  
  @scala.inline
  implicit class WorksheetCollectionUpdateDataMutableBuilder[Self <: WorksheetCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[WorksheetData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: WorksheetData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
