package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgStringQueryToolname extends StObject {
  
  var path: OrgString
  
  var query: Toolname
}
object PathOrgStringQueryToolname {
  
  inline def apply(path: OrgString, query: Toolname): PathOrgStringQueryToolname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgStringQueryToolname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgStringQueryToolname] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Toolname): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
