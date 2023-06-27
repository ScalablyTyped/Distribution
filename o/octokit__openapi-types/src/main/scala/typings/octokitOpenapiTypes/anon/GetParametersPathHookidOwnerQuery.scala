package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathHookidOwnerQuery extends StObject {
  
  /**
    * List deliveries for a repository webhook
    * @description Returns a list of webhook deliveries for a webhook configured in a repository.
    */
  var get: ParametersPathHookidOwnerQuery
}
object GetParametersPathHookidOwnerQuery {
  
  inline def apply(get: ParametersPathHookidOwnerQuery): GetParametersPathHookidOwnerQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathHookidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathHookidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathHookidOwnerQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
