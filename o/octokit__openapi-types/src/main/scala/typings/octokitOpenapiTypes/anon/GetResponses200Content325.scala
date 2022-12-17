package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content325 extends StObject {
  
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: Responses200Content325
}
object GetResponses200Content325 {
  
  inline def apply(get: Responses200Content325): GetResponses200Content325 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content325]
  }
  
  extension [Self <: GetResponses200Content325](x: Self) {
    
    inline def setGet(value: Responses200Content325): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
