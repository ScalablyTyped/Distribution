package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDirectionPage extends StObject {
  
  var path: Discussionnumber
  
  var query: DirectionPage
}
object QueryDirectionPage {
  
  inline def apply(path: Discussionnumber, query: DirectionPage): QueryDirectionPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDirectionPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDirectionPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Discussionnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
