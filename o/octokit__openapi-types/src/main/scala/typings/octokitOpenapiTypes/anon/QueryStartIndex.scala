package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStartIndex extends StObject {
  
  var path: Enterprise
  
  var query: StartIndex
}
object QueryStartIndex {
  
  inline def apply(path: Enterprise, query: StartIndex): QueryStartIndex = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStartIndex]
  }
  
  extension [Self <: QueryStartIndex](x: Self) {
    
    inline def setPath(value: Enterprise): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: StartIndex): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
