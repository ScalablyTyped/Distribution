package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgUsername extends StObject {
  
  var path: OrgUsername
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathOrgUsername {
  
  inline def apply(path: OrgUsername): PathOrgUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgUsername] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
