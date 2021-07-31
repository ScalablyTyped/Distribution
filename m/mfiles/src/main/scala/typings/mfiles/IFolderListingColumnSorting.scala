package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderListingColumnSorting extends StObject {
  
  def Clone(): IFolderListingColumnSorting
  
  var ID: Double
  
  var Index: Double
  
  var SortAscending: Boolean
}
object IFolderListingColumnSorting {
  
  @scala.inline
  def apply(Clone: () => IFolderListingColumnSorting, ID: Double, Index: Double, SortAscending: Boolean): IFolderListingColumnSorting = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderListingColumnSorting]
  }
  
  @scala.inline
  implicit class IFolderListingColumnSortingMutableBuilder[Self <: IFolderListingColumnSorting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IFolderListingColumnSorting): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
  }
}
