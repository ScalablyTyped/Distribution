package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses335 extends StObject {
  
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: Responses335
}
object GetResponses335 {
  
  inline def apply(get: Responses335): GetResponses335 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses335]
  }
  
  extension [Self <: GetResponses335](x: Self) {
    
    inline def setGet(value: Responses335): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
