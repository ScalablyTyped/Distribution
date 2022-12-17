package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAnon extends StObject {
  
  var path: Owner
  
  var query: Anon
}
object QueryAnon {
  
  inline def apply(path: Owner, query: Anon): QueryAnon = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAnon]
  }
  
  extension [Self <: QueryAnon](x: Self) {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Anon): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
