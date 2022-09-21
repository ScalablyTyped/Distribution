package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryType extends StObject {
  
  var path: Org
  
  var query: Type
}
object QueryType {
  
  inline def apply(path: Org, query: Type): QueryType = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
  
  extension [Self <: QueryType](x: Self) {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Type): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
