package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePageElementsZOrderRequest extends StObject {
  
  /**
    * The Z-order operation to apply on the page elements. When applying the operation on multiple page elements, the relative Z-orders within these page elements before the operation is
    * maintained.
    */
  var operation: js.UndefOr[String] = js.undefined
  
  /** The object IDs of the page elements to update. All the page elements must be on the same page and must not be grouped. */
  var pageElementObjectIds: js.UndefOr[js.Array[String]] = js.undefined
}
object UpdatePageElementsZOrderRequest {
  
  inline def apply(): UpdatePageElementsZOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePageElementsZOrderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePageElementsZOrderRequest] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPageElementObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageElementObjectIds", value.asInstanceOf[js.Any])
    
    inline def setPageElementObjectIdsUndefined: Self = StObject.set(x, "pageElementObjectIds", js.undefined)
    
    inline def setPageElementObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageElementObjectIds", js.Array(value*))
  }
}
