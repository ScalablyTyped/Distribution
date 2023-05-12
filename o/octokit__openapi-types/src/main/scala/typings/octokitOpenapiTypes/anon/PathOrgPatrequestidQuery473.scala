package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgPatrequestidQuery473 extends StObject {
  
  var path: OrgPatrequestid
  
  var query: `473`
}
object PathOrgPatrequestidQuery473 {
  
  inline def apply(path: OrgPatrequestid, query: `473`): PathOrgPatrequestidQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgPatrequestidQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgPatrequestidQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPatrequestid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
