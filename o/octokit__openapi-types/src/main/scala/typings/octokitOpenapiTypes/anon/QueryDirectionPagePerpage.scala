package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDirectionPagePerpage extends StObject {
  
  var query: DirectionPagePerpage
}
object QueryDirectionPagePerpage {
  
  inline def apply(query: DirectionPagePerpage): QueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDirectionPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDirectionPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: DirectionPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
