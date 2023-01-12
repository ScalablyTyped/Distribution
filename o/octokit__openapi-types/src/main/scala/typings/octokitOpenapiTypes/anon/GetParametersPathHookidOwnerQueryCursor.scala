package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathHookidOwnerQueryCursor extends StObject {
  
  /** Returns a list of webhook deliveries for a webhook configured in a repository. */
  var get: ParametersPathHookidOwnerQueryCursor
}
object GetParametersPathHookidOwnerQueryCursor {
  
  inline def apply(get: ParametersPathHookidOwnerQueryCursor): GetParametersPathHookidOwnerQueryCursor = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathHookidOwnerQueryCursor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathHookidOwnerQueryCursor] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathHookidOwnerQueryCursor): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
