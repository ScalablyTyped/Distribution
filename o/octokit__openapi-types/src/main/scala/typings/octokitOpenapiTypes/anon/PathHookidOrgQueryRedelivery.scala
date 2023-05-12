package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHookidOrgQueryRedelivery extends StObject {
  
  var path: HookidOrg
  
  var query: Redelivery
}
object PathHookidOrgQueryRedelivery {
  
  inline def apply(path: HookidOrg, query: Redelivery): PathHookidOrgQueryRedelivery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHookidOrgQueryRedelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHookidOrgQueryRedelivery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: HookidOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Redelivery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
