package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCreator extends StObject {
  
  var path: Owner
  
  var query: Creator
}
object QueryCreator {
  
  inline def apply(path: Owner, query: Creator): QueryCreator = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCreator]
  }
  
  extension [Self <: QueryCreator](x: Self) {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Creator): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
