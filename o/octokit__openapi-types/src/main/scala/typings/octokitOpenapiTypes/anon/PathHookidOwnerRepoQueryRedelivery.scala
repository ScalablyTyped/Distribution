package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOwnerRepoQueryRedelivery extends StObject {
  
  var path: HookidOwnerRepo
  
  var query: Redelivery
}
object PathHookidOwnerRepoQueryRedelivery {
  
  inline def apply(path: HookidOwnerRepo, query: Redelivery): PathHookidOwnerRepoQueryRedelivery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOwnerRepoQueryRedelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHookidOwnerRepoQueryRedelivery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: HookidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Redelivery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
