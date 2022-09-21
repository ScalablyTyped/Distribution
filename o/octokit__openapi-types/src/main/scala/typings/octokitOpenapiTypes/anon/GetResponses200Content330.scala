package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content330 extends StObject {
  
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header:
    */
  var get: Responses200Content330
}
object GetResponses200Content330 {
  
  inline def apply(get: Responses200Content330): GetResponses200Content330 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content330]
  }
  
  extension [Self <: GetResponses200Content330](x: Self) {
    
    inline def setGet(value: Responses200Content330): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
