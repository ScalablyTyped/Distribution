package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseRunnergroupidQuery407 extends StObject {
  
  var path: EnterpriseRunnergroupid
  
  var query: `407`
}
object PathEnterpriseRunnergroupidQuery407 {
  
  inline def apply(path: EnterpriseRunnergroupid, query: `407`): PathEnterpriseRunnergroupidQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseRunnergroupidQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnterpriseRunnergroupidQuery407] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnterpriseRunnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
