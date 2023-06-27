package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOwnerQuery extends StObject {
  
  var path: HookidOwner
  
  var query: js.UndefOr[Cursor] = js.undefined
}
object PathHookidOwnerQuery {
  
  inline def apply(path: HookidOwner): PathHookidOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHookidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: HookidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Cursor): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
