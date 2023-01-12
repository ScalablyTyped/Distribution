package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceClientOptions extends StObject {
  
  var filters: js.UndefOr[js.Array[Any]] = js.undefined
  
  var noRetryPolicy: js.UndefOr[Boolean] = js.undefined
  
  var requestOptions: js.UndefOr[ClientRequestOptions] = js.undefined
}
object ServiceClientOptions {
  
  inline def apply(): ServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceClientOptions] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: js.Array[Any]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Any*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setNoRetryPolicy(value: Boolean): Self = StObject.set(x, "noRetryPolicy", value.asInstanceOf[js.Any])
    
    inline def setNoRetryPolicyUndefined: Self = StObject.set(x, "noRetryPolicy", js.undefined)
    
    inline def setRequestOptions(value: ClientRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
  }
}
