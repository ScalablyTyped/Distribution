package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotHierarchyCollection.toJSON()`. */
@js.native
trait PivotHierarchyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotHierarchyData]] = js.native
}
object PivotHierarchyCollectionData {
  
  @scala.inline
  def apply(): PivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHierarchyCollectionData]
  }
  
  @scala.inline
  implicit class PivotHierarchyCollectionDataMutableBuilder[Self <: PivotHierarchyCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
