package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDimensionGroupRequest extends StObject {
  
  /** The group whose state should be updated. The range and depth of the group should specify a valid group on the sheet, and all other fields updated. */
  var dimensionGroup: js.UndefOr[DimensionGroup] = js.native
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `dimensionGroup` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}
object UpdateDimensionGroupRequest {
  
  @scala.inline
  def apply(): UpdateDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDimensionGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateDimensionGroupRequestMutableBuilder[Self <: UpdateDimensionGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionGroup(value: DimensionGroup): Self = StObject.set(x, "dimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionGroupUndefined: Self = StObject.set(x, "dimensionGroup", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
