package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath444Responses200Content8 extends StObject {
  
  /**
    * Get a user installation for the authenticated app
    * @description Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersPath444Responses200Content8
}
object GetParametersPath444Responses200Content8 {
  
  inline def apply(get: ParametersPath444Responses200Content8): GetParametersPath444Responses200Content8 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath444Responses200Content8]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath444Responses200Content8] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath444Responses200Content8): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
