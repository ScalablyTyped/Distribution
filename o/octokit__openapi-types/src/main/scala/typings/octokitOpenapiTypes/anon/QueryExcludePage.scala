package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExcludePage extends StObject {
  
  var path: OrgString
  
  var query: ExcludePage
}
object QueryExcludePage {
  
  inline def apply(path: OrgString, query: ExcludePage): QueryExcludePage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExcludePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryExcludePage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ExcludePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
