package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnenoteOperation extends Operation {
  
  // The error returned by the operation.
  var error: js.UndefOr[NullableOption[OnenoteOperationError]] = js.native
  
  // The operation percent complete if the operation is still in running status
  var percentComplete: js.UndefOr[NullableOption[String]] = js.native
  
  // The resource id.
  var resourceId: js.UndefOr[NullableOption[String]] = js.native
  
  // The resource URI for the object. For example, the resource URI for a copied page or section.
  var resourceLocation: js.UndefOr[NullableOption[String]] = js.native
}
object OnenoteOperation {
  
  @scala.inline
  def apply(): OnenoteOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteOperation]
  }
  
  @scala.inline
  implicit class OnenoteOperationMutableBuilder[Self <: OnenoteOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: NullableOption[OnenoteOperationError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setPercentComplete(value: NullableOption[String]): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentCompleteNull: Self = StObject.set(x, "percentComplete", null)
    
    @scala.inline
    def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    @scala.inline
    def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setResourceLocation(value: NullableOption[String]): Self = StObject.set(x, "resourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLocationNull: Self = StObject.set(x, "resourceLocation", null)
    
    @scala.inline
    def setResourceLocationUndefined: Self = StObject.set(x, "resourceLocation", js.undefined)
  }
}
