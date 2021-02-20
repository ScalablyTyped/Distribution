package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDimensionGroupRequest extends StObject {
  
  /** The range of the group to be deleted. */
  var range: js.UndefOr[DimensionRange] = js.native
}
object DeleteDimensionGroupRequest {
  
  @scala.inline
  def apply(): DeleteDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDimensionGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteDimensionGroupRequestMutableBuilder[Self <: DeleteDimensionGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
