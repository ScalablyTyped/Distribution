package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRepo extends StObject {
  
  var path: OrgRepo
  
  var query: Page
}
object PathOrgRepo {
  
  inline def apply(path: OrgRepo, query: Page): PathOrgRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
