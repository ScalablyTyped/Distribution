package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotTableStyleCollection.toJSON()`. */
@js.native
trait PivotTableStyleCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableStyleData]] = js.native
}
object PivotTableStyleCollectionData {
  
  @scala.inline
  def apply(): PivotTableStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableStyleCollectionData]
  }
  
  @scala.inline
  implicit class PivotTableStyleCollectionDataMutableBuilder[Self <: PivotTableStyleCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotTableStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotTableStyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
