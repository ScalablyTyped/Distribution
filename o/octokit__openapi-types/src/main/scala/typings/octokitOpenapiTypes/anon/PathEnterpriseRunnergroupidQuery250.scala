package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseRunnergroupidQuery250 extends StObject {
  
  var path: EnterpriseRunnergroupid
  
  var query: `250`
}
object PathEnterpriseRunnergroupidQuery250 {
  
  inline def apply(path: EnterpriseRunnergroupid, query: `250`): PathEnterpriseRunnergroupidQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseRunnergroupidQuery250]
  }
  
  extension [Self <: PathEnterpriseRunnergroupidQuery250](x: Self) {
    
    inline def setPath(value: EnterpriseRunnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
