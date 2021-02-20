package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheetCustomPropertyCollection.toJSON()`. */
@js.native
trait WorksheetCustomPropertyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[WorksheetCustomPropertyData]] = js.native
}
object WorksheetCustomPropertyCollectionData {
  
  @scala.inline
  def apply(): WorksheetCustomPropertyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyCollectionData]
  }
  
  @scala.inline
  implicit class WorksheetCustomPropertyCollectionDataMutableBuilder[Self <: WorksheetCustomPropertyCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[WorksheetCustomPropertyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: WorksheetCustomPropertyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
