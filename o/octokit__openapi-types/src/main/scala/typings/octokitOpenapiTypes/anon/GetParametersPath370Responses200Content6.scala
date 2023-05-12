package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath370Responses200Content6 extends StObject {
  
  /**
    * Get a user installation for the authenticated app
    * @description Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersPath370Responses200Content6
}
object GetParametersPath370Responses200Content6 {
  
  inline def apply(get: ParametersPath370Responses200Content6): GetParametersPath370Responses200Content6 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath370Responses200Content6]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath370Responses200Content6] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath370Responses200Content6): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
