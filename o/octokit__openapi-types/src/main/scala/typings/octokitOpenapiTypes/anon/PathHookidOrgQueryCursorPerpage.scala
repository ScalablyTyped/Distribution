package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOrgQueryCursorPerpage extends StObject {
  
  var path: HookidOrg
  
  var query: CursorPerpage
}
object PathHookidOrgQueryCursorPerpage {
  
  inline def apply(path: HookidOrg, query: CursorPerpage): PathHookidOrgQueryCursorPerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOrgQueryCursorPerpage]
  }
  
  extension [Self <: PathHookidOrgQueryCursorPerpage](x: Self) {
    
    inline def setPath(value: HookidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: CursorPerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
