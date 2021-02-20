package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceClientOptions extends StObject {
  
  var filters: js.UndefOr[js.Array[_]] = js.native
  
  var noRetryPolicy: js.UndefOr[Boolean] = js.native
  
  var requestOptions: js.UndefOr[ClientRequestOptions] = js.native
}
object ServiceClientOptions {
  
  @scala.inline
  def apply(): ServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceClientOptions]
  }
  
  @scala.inline
  implicit class ServiceClientOptionsMutableBuilder[Self <: ServiceClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[_]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: js.Any*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setNoRetryPolicy(value: Boolean): Self = StObject.set(x, "noRetryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRetryPolicyUndefined: Self = StObject.set(x, "noRetryPolicy", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: ClientRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
  }
}
