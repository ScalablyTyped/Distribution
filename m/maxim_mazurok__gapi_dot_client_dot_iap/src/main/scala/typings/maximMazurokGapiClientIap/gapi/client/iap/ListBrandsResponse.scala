package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBrandsResponse extends StObject {
  
  /** Brands existing in the project. */
  var brands: js.UndefOr[js.Array[Brand]] = js.undefined
}
object ListBrandsResponse {
  
  inline def apply(): ListBrandsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBrandsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBrandsResponse] (val x: Self) extends AnyVal {
    
    inline def setBrands(value: js.Array[Brand]): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    inline def setBrandsUndefined: Self = StObject.set(x, "brands", js.undefined)
    
    inline def setBrandsVarargs(value: Brand*): Self = StObject.set(x, "brands", js.Array(value*))
  }
}
