package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiDimensionFilterGroup extends StObject {
  
  var filters: js.UndefOr[js.Array[ApiDimensionFilter]] = js.undefined
  
  var groupType: js.UndefOr[String] = js.undefined
}
object ApiDimensionFilterGroup {
  
  inline def apply(): ApiDimensionFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiDimensionFilterGroup]
  }
  
  extension [Self <: ApiDimensionFilterGroup](x: Self) {
    
    inline def setFilters(value: js.Array[ApiDimensionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ApiDimensionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    inline def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
  }
}
