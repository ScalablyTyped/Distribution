package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath231 extends StObject {
  
  /**
    * Returns a delivery for the webhook configured for a GitHub App.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersPath231
}
object GetParametersPath231 {
  
  inline def apply(get: ParametersPath231): GetParametersPath231 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath231]
  }
  
  extension [Self <: GetParametersPath231](x: Self) {
    
    inline def setGet(value: ParametersPath231): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
