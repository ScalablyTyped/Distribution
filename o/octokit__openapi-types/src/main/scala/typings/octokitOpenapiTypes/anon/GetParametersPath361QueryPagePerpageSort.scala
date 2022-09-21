package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath361QueryPagePerpageSort extends StObject {
  
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header:
    */
  var get: ParametersPath361QueryPagePerpageSort
}
object GetParametersPath361QueryPagePerpageSort {
  
  inline def apply(get: ParametersPath361QueryPagePerpageSort): GetParametersPath361QueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath361QueryPagePerpageSort]
  }
  
  extension [Self <: GetParametersPath361QueryPagePerpageSort](x: Self) {
    
    inline def setGet(value: ParametersPath361QueryPagePerpageSort): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
