package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchListParameters[D] extends StObject {
  
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.native
  
  var filterCriterion: js.UndefOr[FilterOperator[D]] = js.native
  
  var size: Double = js.native
  
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.native
}
object FetchListParameters {
  
  @scala.inline
  def apply[D](size: Double): FetchListParameters[D] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchListParameters[D]]
  }
  
  @scala.inline
  implicit class FetchListParametersMutableBuilder[Self <: FetchListParameters[_], D] (val x: Self with FetchListParameters[D]) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String | FetchAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (String | FetchAttribute)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setFilterCriterion(value: FilterOperator[D]): Self = StObject.set(x, "filterCriterion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCriterionUndefined: Self = StObject.set(x, "filterCriterion", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteria(value: js.Array[SortCriterion[D]]): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
    
    @scala.inline
    def setSortCriteriaVarargs(value: SortCriterion[D]*): Self = StObject.set(x, "sortCriteria", js.Array(value :_*))
  }
}
