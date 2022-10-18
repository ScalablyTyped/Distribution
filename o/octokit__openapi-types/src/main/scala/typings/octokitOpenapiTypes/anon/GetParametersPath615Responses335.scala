package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath615Responses335 extends StObject {
  
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersPath615Responses335
}
object GetParametersPath615Responses335 {
  
  inline def apply(get: ParametersPath615Responses335): GetParametersPath615Responses335 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath615Responses335]
  }
  
  extension [Self <: GetParametersPath615Responses335](x: Self) {
    
    inline def setGet(value: ParametersPath615Responses335): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
