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
  
  inline def apply(BaseSearchConditions: ISearchConditions, SearchCriteria: ISearchCriteria, View: IView): ITemporarySearchView = {
    val __obj = js.Dynamic.literal(BaseSearchConditions = BaseSearchConditions.asInstanceOf[js.Any], SearchCriteria = SearchCriteria.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemporarySearchView]
  }
  
  extension [Self <: ITemporarySearchView](x: Self) {
    
    inline def setBaseSearchConditions(value: ISearchConditions): Self = StObject.set(x, "BaseSearchConditions", value.asInstanceOf[js.Any])
    
    inline def setSearchCriteria(value: ISearchCriteria): Self = StObject.set(x, "SearchCriteria", value.asInstanceOf[js.Any])
    
    inline def setView(value: IView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
