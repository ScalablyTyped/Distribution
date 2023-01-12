package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryToken extends StObject {
  
  var path: Packagename
  
  var query: Token
}
object QueryToken {
  
  inline def apply(path: Packagename, query: Token): QueryToken = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryToken] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Packagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
