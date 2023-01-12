package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDimensionGroupResponse extends StObject {
  
  /** All groups of a dimension after deleting a group from that dimension. */
  var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
}
object DeleteDimensionGroupResponse {
  
  inline def apply(): DeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDimensionGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDimensionGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setDimensionGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "dimensionGroups", value.asInstanceOf[js.Any])
    
    inline def setDimensionGroupsUndefined: Self = StObject.set(x, "dimensionGroups", js.undefined)
    
    inline def setDimensionGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "dimensionGroups", js.Array(value*))
  }
}
