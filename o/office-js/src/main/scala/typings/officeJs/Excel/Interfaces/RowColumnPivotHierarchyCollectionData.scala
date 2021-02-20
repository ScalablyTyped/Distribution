package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rowColumnPivotHierarchyCollection.toJSON()`. */
@js.native
trait RowColumnPivotHierarchyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.native
}
object RowColumnPivotHierarchyCollectionData {
  
  @scala.inline
  def apply(): RowColumnPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowColumnPivotHierarchyCollectionData]
  }
  
  @scala.inline
  implicit class RowColumnPivotHierarchyCollectionDataMutableBuilder[Self <: RowColumnPivotHierarchyCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RowColumnPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RowColumnPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
