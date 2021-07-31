package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiDimensionFilterGroup extends StObject {
  
  var filters: js.UndefOr[js.Array[ApiDimensionFilter]] = js.undefined
  
  var groupType: js.UndefOr[String] = js.undefined
}
object ApiDimensionFilterGroup {
  
  @scala.inline
  def apply(): ApiDimensionFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiDimensionFilterGroup]
  }
  
  @scala.inline
  implicit class ApiDimensionFilterGroupMutableBuilder[Self <: ApiDimensionFilterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[ApiDimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ApiDimensionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
  }
}
