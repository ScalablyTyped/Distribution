package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchListParameters[D] extends StObject {
  
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.undefined
  
  var filterCriterion: js.UndefOr[FilterOperator[D]] = js.undefined
  
  var size: Double
  
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
}
object FetchListParameters {
  
  inline def apply[D](size: Double): FetchListParameters[D] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchListParameters[D]]
  }
  
  extension [Self <: FetchListParameters[?], D](x: Self & FetchListParameters[D]) {
    
    inline def setAttributes(value: js.Array[String | FetchAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: (String | FetchAttribute)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setFilterCriterion(value: FilterOperator[D]): Self = StObject.set(x, "filterCriterion", value.asInstanceOf[js.Any])
    
    inline def setFilterCriterionUndefined: Self = StObject.set(x, "filterCriterion", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSortCriteria(value: js.Array[SortCriterion[D]]): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
    
    inline def setSortCriteriaVarargs(value: SortCriterion[D]*): Self = StObject.set(x, "sortCriteria", js.Array(value :_*))
  }
}
