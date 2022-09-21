package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAuthor extends StObject {
  
  var path: Owner
  
  var query: Author
}
object QueryAuthor {
  
  inline def apply(path: Owner, query: Author): QueryAuthor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAuthor]
  }
  
  extension [Self <: QueryAuthor](x: Self) {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Author): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
