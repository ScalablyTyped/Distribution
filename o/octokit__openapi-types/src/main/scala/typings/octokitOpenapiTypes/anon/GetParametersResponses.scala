package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersResponses extends StObject {
  
  /**
    * List deliveries for an app webhook
    * @description Returns a list of webhook deliveries for the webhook configured for a GitHub App.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersResponses
}
object GetParametersResponses {
  
  inline def apply(get: ParametersResponses): GetParametersResponses = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersResponses] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersResponses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
