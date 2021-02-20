package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDimensionGroupResponse extends StObject {
  
  /** All groups of a dimension after deleting a group from that dimension. */
  var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
}
object DeleteDimensionGroupResponse {
  
  @scala.inline
  def apply(): DeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDimensionGroupResponse]
  }
  
  @scala.inline
  implicit class DeleteDimensionGroupResponseMutableBuilder[Self <: DeleteDimensionGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "dimensionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionGroupsUndefined: Self = StObject.set(x, "dimensionGroups", js.undefined)
    
    @scala.inline
    def setDimensionGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "dimensionGroups", js.Array(value :_*))
  }
}
