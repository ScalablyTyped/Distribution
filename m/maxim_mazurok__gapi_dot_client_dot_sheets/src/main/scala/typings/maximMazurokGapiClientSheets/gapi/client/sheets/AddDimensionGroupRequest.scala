package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDimensionGroupRequest extends StObject {
  
  /** The range over which to create a group. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}
object AddDimensionGroupRequest {
  
  @scala.inline
  def apply(): AddDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDimensionGroupRequest]
  }
  
  @scala.inline
  implicit class AddDimensionGroupRequestMutableBuilder[Self <: AddDimensionGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
