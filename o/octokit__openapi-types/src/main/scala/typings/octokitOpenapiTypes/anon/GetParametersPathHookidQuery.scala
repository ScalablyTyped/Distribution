package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathHookidQuery extends StObject {
  
  /**
    * List deliveries for an organization webhook
    * @description Returns a list of webhook deliveries for a webhook configured in an organization.
    */
  var get: ParametersPathHookidQuery
}
object GetParametersPathHookidQuery {
  
  inline def apply(get: ParametersPathHookidQuery): GetParametersPathHookidQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathHookidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathHookidQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathHookidQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
