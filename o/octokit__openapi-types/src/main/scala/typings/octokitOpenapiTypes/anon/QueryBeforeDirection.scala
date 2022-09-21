package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBeforeDirection extends StObject {
  
  var path: OrgString
  
  var query: BeforeDirection
}
object QueryBeforeDirection {
  
  inline def apply(path: OrgString, query: BeforeDirection): QueryBeforeDirection = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBeforeDirection]
  }
  
  extension [Self <: QueryBeforeDirection](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: BeforeDirection): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
