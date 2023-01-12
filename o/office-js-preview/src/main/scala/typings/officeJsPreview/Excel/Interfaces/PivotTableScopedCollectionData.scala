package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotTableScopedCollection.toJSON()`. */
trait PivotTableScopedCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableData]] = js.undefined
}
object PivotTableScopedCollectionData {
  
  inline def apply(): PivotTableScopedCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableScopedCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableScopedCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[PivotTableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotTableData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
