package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRunnergroupidQueryPage extends StObject {
  
  var path: OrgRunnergroupid
  
  var query: Page
}
object PathOrgRunnergroupidQueryPage {
  
  inline def apply(path: OrgRunnergroupid, query: Page): PathOrgRunnergroupidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRunnergroupidQueryPage]
  }
  
  extension [Self <: PathOrgRunnergroupidQueryPage](x: Self) {
    
    inline def setPath(value: OrgRunnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
