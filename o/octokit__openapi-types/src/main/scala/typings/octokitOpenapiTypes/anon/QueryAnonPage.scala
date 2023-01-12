package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAnonPage extends StObject {
  
  var path: OwnerString
  
  var query: AnonPage
}
object QueryAnonPage {
  
  inline def apply(path: OwnerString, query: AnonPage): QueryAnonPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAnonPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryAnonPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AnonPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
