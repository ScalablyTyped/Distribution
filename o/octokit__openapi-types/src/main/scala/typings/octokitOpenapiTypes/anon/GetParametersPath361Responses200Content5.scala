package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath361Responses200Content5 extends StObject {
  
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersPath361Responses200Content5
}
object GetParametersPath361Responses200Content5 {
  
  inline def apply(get: ParametersPath361Responses200Content5): GetParametersPath361Responses200Content5 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath361Responses200Content5]
  }
  
  extension [Self <: GetParametersPath361Responses200Content5](x: Self) {
    
    inline def setGet(value: ParametersPath361Responses200Content5): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
