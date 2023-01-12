package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryContentPagePerpage extends StObject {
  
  var path: Releaseid
  
  var query: ContentPagePerpage
}
object QueryContentPagePerpage {
  
  inline def apply(path: Releaseid, query: ContentPagePerpage): QueryContentPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContentPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryContentPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Releaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
