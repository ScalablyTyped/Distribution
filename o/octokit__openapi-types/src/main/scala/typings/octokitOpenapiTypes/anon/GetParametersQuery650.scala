package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery650 extends StObject {
  
  /**
    * Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: ParametersQuery650
}
object GetParametersQuery650 {
  
  inline def apply(get: ParametersQuery650): GetParametersQuery650 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery650]
  }
  
  extension [Self <: GetParametersQuery650](x: Self) {
    
    inline def setGet(value: ParametersQuery650): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
