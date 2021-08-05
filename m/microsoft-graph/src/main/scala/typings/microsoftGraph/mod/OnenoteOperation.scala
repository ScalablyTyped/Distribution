package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenoteOperation
  extends StObject
     with Operation {
  
  // The error returned by the operation.
  var error: js.UndefOr[NullableOption[OnenoteOperationError]] = js.undefined
  
  // The operation percent complete if the operation is still in running status
  var percentComplete: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The resource id.
  var resourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The resource URI for the object. For example, the resource URI for a copied page or section.
  var resourceLocation: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnenoteOperation {
  
  inline def apply(): OnenoteOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteOperation]
  }
  
  extension [Self <: OnenoteOperation](x: Self) {
    
    inline def setError(value: NullableOption[OnenoteOperationError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPercentComplete(value: NullableOption[String]): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteNull: Self = StObject.set(x, "percentComplete", null)
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceLocation(value: NullableOption[String]): Self = StObject.set(x, "resourceLocation", value.asInstanceOf[js.Any])
    
    inline def setResourceLocationNull: Self = StObject.set(x, "resourceLocation", null)
    
    inline def setResourceLocationUndefined: Self = StObject.set(x, "resourceLocation", js.undefined)
  }
}
