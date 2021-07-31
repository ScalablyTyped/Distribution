package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheetCollection.toJSON()`. */
trait WorksheetCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[WorksheetData]] = js.undefined
}
object WorksheetCollectionData {
  
  @scala.inline
  def apply(): WorksheetCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCollectionData]
  }
  
  @scala.inline
  implicit class WorksheetCollectionDataMutableBuilder[Self <: WorksheetCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[WorksheetData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: WorksheetData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
