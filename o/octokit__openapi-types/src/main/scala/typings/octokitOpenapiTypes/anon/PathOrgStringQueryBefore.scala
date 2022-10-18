package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgStringQueryBefore extends StObject {
  
  var path: OrgString
  
  var query: Before
}
object PathOrgStringQueryBefore {
  
  inline def apply(path: OrgString, query: Before): PathOrgStringQueryBefore = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgStringQueryBefore]
  }
  
  extension [Self <: PathOrgStringQueryBefore](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Before): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
