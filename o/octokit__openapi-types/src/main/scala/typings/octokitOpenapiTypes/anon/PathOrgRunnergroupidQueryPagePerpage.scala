package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRunnergroupidQueryPagePerpage extends StObject {
  
  var path: OrgRunnergroupid
  
  var query: PagePerpage
}
object PathOrgRunnergroupidQueryPagePerpage {
  
  inline def apply(path: OrgRunnergroupid, query: PagePerpage): PathOrgRunnergroupidQueryPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRunnergroupidQueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgRunnergroupidQueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgRunnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
