package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath348QueryPagePerpageSort extends StObject {
  
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: ParametersPath348QueryPagePerpageSort
}
object GetParametersPath348QueryPagePerpageSort {
  
  inline def apply(get: ParametersPath348QueryPagePerpageSort): GetParametersPath348QueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath348QueryPagePerpageSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath348QueryPagePerpageSort] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath348QueryPagePerpageSort): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
