package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePerpageSort extends StObject {
  
  /**
    * Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: ParametersQueryPagePerpageSort
}
object GetParametersQueryPagePerpageSort {
  
  inline def apply(get: ParametersQueryPagePerpageSort): GetParametersQueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePerpageSort]
  }
  
  extension [Self <: GetParametersQueryPagePerpageSort](x: Self) {
    
    inline def setGet(value: ParametersQueryPagePerpageSort): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
