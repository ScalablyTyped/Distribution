package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgStringQuery extends StObject {
  
  var path: OrgString
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathOrgStringQuery {
  
  inline def apply(path: OrgString): PathOrgStringQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgStringQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
