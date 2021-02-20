package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotItemCollection.toJSON()`. */
@js.native
trait PivotItemCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotItemData]] = js.native
}
object PivotItemCollectionData {
  
  @scala.inline
  def apply(): PivotItemCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotItemCollectionData]
  }
  
  @scala.inline
  implicit class PivotItemCollectionDataMutableBuilder[Self <: PivotItemCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotItemData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
