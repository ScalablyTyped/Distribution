package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBrandsResponse extends StObject {
  
  /** Brands existing in the project. */
  var brands: js.UndefOr[js.Array[Brand]] = js.native
}
object ListBrandsResponse {
  
  @scala.inline
  def apply(): ListBrandsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBrandsResponse]
  }
  
  @scala.inline
  implicit class ListBrandsResponseMutableBuilder[Self <: ListBrandsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrands(value: js.Array[Brand]): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandsUndefined: Self = StObject.set(x, "brands", js.undefined)
    
    @scala.inline
    def setBrandsVarargs(value: Brand*): Self = StObject.set(x, "brands", js.Array(value :_*))
  }
}
