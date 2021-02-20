package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotTableCollection.toJSON()`. */
@js.native
trait PivotTableCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableData]] = js.native
}
object PivotTableCollectionData {
  
  @scala.inline
  def apply(): PivotTableCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableCollectionData]
  }
  
  @scala.inline
  implicit class PivotTableCollectionDataMutableBuilder[Self <: PivotTableCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotTableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotTableData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
