package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath615Query650 extends StObject {
  
  /**
    * Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: ParametersPath615Query650
}
object GetParametersPath615Query650 {
  
  inline def apply(get: ParametersPath615Query650): GetParametersPath615Query650 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath615Query650]
  }
  
  extension [Self <: GetParametersPath615Query650](x: Self) {
    
    inline def setGet(value: ParametersPath615Query650): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
