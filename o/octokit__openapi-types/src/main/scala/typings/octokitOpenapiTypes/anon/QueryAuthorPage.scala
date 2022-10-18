package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAuthorPage extends StObject {
  
  var path: `292`
  
  var query: AuthorPage
}
object QueryAuthorPage {
  
  inline def apply(path: `292`, query: AuthorPage): QueryAuthorPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAuthorPage]
  }
  
  extension [Self <: QueryAuthorPage](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AuthorPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
