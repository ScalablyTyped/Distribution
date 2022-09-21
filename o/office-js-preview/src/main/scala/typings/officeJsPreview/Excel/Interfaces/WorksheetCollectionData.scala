package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheetCollection.toJSON()`. */
trait WorksheetCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[WorksheetData]] = js.undefined
}
object WorksheetCollectionData {
  
  inline def apply(): WorksheetCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCollectionData]
  }
  
  extension [Self <: WorksheetCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[WorksheetData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: WorksheetData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
