package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderView extends StObject {
  
  // The method by which the folder should be sorted.
  var sortBy: js.UndefOr[NullableOption[String]] = js.undefined
  
  // If true, indicates that items should be sorted in descending order. Otherwise, items should be sorted ascending.
  var sortOrder: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of view that should be used to represent the folder.
  var viewType: js.UndefOr[NullableOption[String]] = js.undefined
}
object FolderView {
  
  inline def apply(): FolderView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderView]
  }
  
  extension [Self <: FolderView](x: Self) {
    
    inline def setSortBy(value: NullableOption[String]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByNull: Self = StObject.set(x, "sortBy", null)
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: NullableOption[String]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setViewType(value: NullableOption[String]): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    
    inline def setViewTypeNull: Self = StObject.set(x, "viewType", null)
    
    inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
  }
}
