package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath348Responses200Content5 extends StObject {
  
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersPath348Responses200Content5
}
object GetParametersPath348Responses200Content5 {
  
  inline def apply(get: ParametersPath348Responses200Content5): GetParametersPath348Responses200Content5 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath348Responses200Content5]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath348Responses200Content5] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath348Responses200Content5): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
