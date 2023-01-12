package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryOutdated extends StObject {
  
  /**
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * The permissions the installation has are included under the `permissions` key.
    */
  var get: ParametersQueryOutdated
}
object GetParametersQueryOutdated {
  
  inline def apply(get: ParametersQueryOutdated): GetParametersQueryOutdated = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryOutdated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryOutdated] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryOutdated): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
