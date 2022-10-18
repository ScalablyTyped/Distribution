package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryOutdatedPage extends StObject {
  
  /**
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * The permissions the installation has are included under the `permissions` key.
    */
  var get: ParametersQueryOutdatedPage
}
object GetParametersQueryOutdatedPage {
  
  inline def apply(get: ParametersQueryOutdatedPage): GetParametersQueryOutdatedPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryOutdatedPage]
  }
  
  extension [Self <: GetParametersQueryOutdatedPage](x: Self) {
    
    inline def setGet(value: ParametersQueryOutdatedPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
