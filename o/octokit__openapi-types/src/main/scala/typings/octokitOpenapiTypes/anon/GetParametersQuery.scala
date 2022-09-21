package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery extends StObject {
  
  /**
    * Returns a list of webhook deliveries for the webhook configured for a GitHub App.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersQuery
}
object GetParametersQuery {
  
  inline def apply(get: ParametersQuery): GetParametersQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery]
  }
  
  extension [Self <: GetParametersQuery](x: Self) {
    
    inline def setGet(value: ParametersQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
