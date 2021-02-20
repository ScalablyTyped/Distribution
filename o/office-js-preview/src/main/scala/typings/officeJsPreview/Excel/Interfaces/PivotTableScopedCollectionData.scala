package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotTableScopedCollection.toJSON()`. */
@js.native
trait PivotTableScopedCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableData]] = js.native
}
object PivotTableScopedCollectionData {
  
  @scala.inline
  def apply(): PivotTableScopedCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableScopedCollectionData]
  }
  
  @scala.inline
  implicit class PivotTableScopedCollectionDataMutableBuilder[Self <: PivotTableScopedCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotTableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotTableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
