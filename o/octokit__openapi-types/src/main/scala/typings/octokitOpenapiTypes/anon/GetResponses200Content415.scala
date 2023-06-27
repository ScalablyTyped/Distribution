package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content415 extends StObject {
  
  /**
    * List stargazers
    * @description Lists the people that have starred the repository.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: Responses200Content415
}
object GetResponses200Content415 {
  
  inline def apply(get: Responses200Content415): GetResponses200Content415 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content415]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content415] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content415): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
