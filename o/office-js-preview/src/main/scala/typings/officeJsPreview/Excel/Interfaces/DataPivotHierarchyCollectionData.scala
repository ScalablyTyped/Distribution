package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `dataPivotHierarchyCollection.toJSON()`. */
trait DataPivotHierarchyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
}
object DataPivotHierarchyCollectionData {
  
  @scala.inline
  def apply(): DataPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyCollectionData]
  }
  
  @scala.inline
  implicit class DataPivotHierarchyCollectionDataMutableBuilder[Self <: DataPivotHierarchyCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[DataPivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DataPivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
