package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content581 extends StObject {
  
  /**
    * Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: Responses200Content581
}
object GetResponses200Content581 {
  
  inline def apply(get: Responses200Content581): GetResponses200Content581 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content581]
  }
  
  extension [Self <: GetResponses200Content581](x: Self) {
    
    inline def setGet(value: Responses200Content581): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
