package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOrgQuery extends StObject {
  
  var path: HookidOrg
  
  var query: js.UndefOr[Redelivery] = js.undefined
}
object PathHookidOrgQuery {
  
  inline def apply(path: HookidOrg): PathHookidOrgQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHookidOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: HookidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Redelivery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
