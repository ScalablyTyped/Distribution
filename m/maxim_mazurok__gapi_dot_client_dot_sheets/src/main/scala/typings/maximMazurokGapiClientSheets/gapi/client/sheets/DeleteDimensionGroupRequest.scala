package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDimensionGroupRequest extends StObject {
  
  /** The range of the group to be deleted. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}
object DeleteDimensionGroupRequest {
  
  inline def apply(): DeleteDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDimensionGroupRequest]
  }
  
  extension [Self <: DeleteDimensionGroupRequest](x: Self) {
    
    inline def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
