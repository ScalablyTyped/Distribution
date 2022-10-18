package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryCursorPerpage extends StObject {
  
  /**
    * Returns a list of webhook deliveries for the webhook configured for a GitHub App.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersQueryCursorPerpage
}
object GetParametersQueryCursorPerpage {
  
  inline def apply(get: ParametersQueryCursorPerpage): GetParametersQueryCursorPerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryCursorPerpage]
  }
  
  extension [Self <: GetParametersQueryCursorPerpage](x: Self) {
    
    inline def setGet(value: ParametersQueryCursorPerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
