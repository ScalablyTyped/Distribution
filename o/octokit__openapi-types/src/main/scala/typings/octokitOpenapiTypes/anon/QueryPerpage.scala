package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpage extends StObject {
  
  var query: Perpage
}
object QueryPerpage {
  
  inline def apply(query: Perpage): QueryPerpage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPerpage] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Perpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
