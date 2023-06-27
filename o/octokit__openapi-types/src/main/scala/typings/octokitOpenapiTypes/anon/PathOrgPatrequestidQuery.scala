package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgPatrequestidQuery extends StObject {
  
  var path: OrgPatrequestid
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathOrgPatrequestidQuery {
  
  inline def apply(path: OrgPatrequestid): PathOrgPatrequestidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgPatrequestidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgPatrequestidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPatrequestid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
