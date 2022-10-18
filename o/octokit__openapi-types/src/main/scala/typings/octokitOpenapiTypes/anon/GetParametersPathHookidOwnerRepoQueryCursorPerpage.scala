package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathHookidOwnerRepoQueryCursorPerpage extends StObject {
  
  /** Returns a list of webhook deliveries for a webhook configured in a repository. */
  var get: ParametersPathHookidOwnerRepoQueryCursorPerpage
}
object GetParametersPathHookidOwnerRepoQueryCursorPerpage {
  
  inline def apply(get: ParametersPathHookidOwnerRepoQueryCursorPerpage): GetParametersPathHookidOwnerRepoQueryCursorPerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathHookidOwnerRepoQueryCursorPerpage]
  }
  
  extension [Self <: GetParametersPathHookidOwnerRepoQueryCursorPerpage](x: Self) {
    
    inline def setGet(value: ParametersPathHookidOwnerRepoQueryCursorPerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
