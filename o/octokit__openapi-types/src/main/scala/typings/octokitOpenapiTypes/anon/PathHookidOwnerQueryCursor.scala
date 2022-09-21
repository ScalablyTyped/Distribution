package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOwnerQueryCursor extends StObject {
  
  var path: HookidOwner
  
  var query: Cursor
}
object PathHookidOwnerQueryCursor {
  
  inline def apply(path: HookidOwner, query: Cursor): PathHookidOwnerQueryCursor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOwnerQueryCursor]
  }
  
  extension [Self <: PathHookidOwnerQueryCursor](x: Self) {
    
    inline def setPath(value: HookidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Cursor): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
