package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOwnerRepoQueryCursorPerpage extends StObject {
  
  var path: HookidOwnerRepo
  
  var query: CursorPerpage
}
object PathHookidOwnerRepoQueryCursorPerpage {
  
  inline def apply(path: HookidOwnerRepo, query: CursorPerpage): PathHookidOwnerRepoQueryCursorPerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOwnerRepoQueryCursorPerpage]
  }
  
  extension [Self <: PathHookidOwnerRepoQueryCursorPerpage](x: Self) {
    
    inline def setPath(value: HookidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: CursorPerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
