package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddNamedRangeResponse extends StObject {
  
  /** The named range to add. */
  var namedRange: js.UndefOr[NamedRange] = js.undefined
}
object AddNamedRangeResponse {
  
  inline def apply(): AddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddNamedRangeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddNamedRangeResponse] (val x: Self) extends AnyVal {
    
    inline def setNamedRange(value: NamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
  }
}
