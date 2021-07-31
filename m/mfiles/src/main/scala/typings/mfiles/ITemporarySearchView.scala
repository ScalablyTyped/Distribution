package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITemporarySearchView extends StObject {
  
  val BaseSearchConditions: ISearchConditions
  
  var SearchCriteria: ISearchCriteria
  
  val View: IView
}
object ITemporarySearchView {
  
  @scala.inline
  def apply(BaseSearchConditions: ISearchConditions, SearchCriteria: ISearchCriteria, View: IView): ITemporarySearchView = {
    val __obj = js.Dynamic.literal(BaseSearchConditions = BaseSearchConditions.asInstanceOf[js.Any], SearchCriteria = SearchCriteria.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemporarySearchView]
  }
  
  @scala.inline
  implicit class ITemporarySearchViewMutableBuilder[Self <: ITemporarySearchView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseSearchConditions(value: ISearchConditions): Self = StObject.set(x, "BaseSearchConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchCriteria(value: ISearchCriteria): Self = StObject.set(x, "SearchCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: IView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
