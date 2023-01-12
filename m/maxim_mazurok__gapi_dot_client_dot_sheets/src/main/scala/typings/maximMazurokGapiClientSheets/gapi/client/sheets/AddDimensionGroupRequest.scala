package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDimensionGroupRequest extends StObject {
  
  /** The range over which to create a group. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}
object AddDimensionGroupRequest {
  
  inline def apply(): AddDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDimensionGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddDimensionGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
