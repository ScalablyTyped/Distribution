package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDisplaynamePage extends StObject {
  
  var path: OrgString
  
  var query: DisplaynamePage
}
object QueryDisplaynamePage {
  
  inline def apply(path: OrgString, query: DisplaynamePage): QueryDisplaynamePage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDisplaynamePage]
  }
  
  extension [Self <: QueryDisplaynamePage](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DisplaynamePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
