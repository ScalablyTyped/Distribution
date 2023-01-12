package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content5 extends StObject {
  
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: Responses200Content5
}
object GetResponses200Content5 {
  
  inline def apply(get: Responses200Content5): GetResponses200Content5 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content5]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content5] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content5): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
