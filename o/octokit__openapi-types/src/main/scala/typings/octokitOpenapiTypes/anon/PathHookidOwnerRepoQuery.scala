package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOwnerRepoQuery extends StObject {
  
  var path: HookidOwnerRepo
  
  var query: js.UndefOr[Redelivery] = js.undefined
}
object PathHookidOwnerRepoQuery {
  
  inline def apply(path: HookidOwnerRepo): PathHookidOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHookidOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: HookidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Redelivery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
