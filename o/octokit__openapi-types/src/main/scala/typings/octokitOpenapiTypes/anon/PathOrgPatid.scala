package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgPatid extends StObject {
  
  var path: OrgPatid
  
  var query: Page
}
object PathOrgPatid {
  
  inline def apply(path: OrgPatid, query: Page): PathOrgPatid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgPatid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgPatid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPatid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
