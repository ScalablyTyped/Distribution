package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRepo extends StObject {
  
  var path: OrgRepo
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathOrgRepo {
  
  inline def apply(path: OrgRepo): PathOrgRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
