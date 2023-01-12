package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintService
  extends StObject
     with Entity {
  
  // Endpoints that can be used to access the service. Read-only. Nullable.
  var endpoints: js.UndefOr[NullableOption[js.Array[PrintServiceEndpoint]]] = js.undefined
}
object PrintService {
  
  inline def apply(): PrintService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintService] (val x: Self) extends AnyVal {
    
    inline def setEndpoints(value: NullableOption[js.Array[PrintServiceEndpoint]]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsNull: Self = StObject.set(x, "endpoints", null)
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: PrintServiceEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
  }
}
