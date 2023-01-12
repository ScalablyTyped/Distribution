package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryToolguid extends StObject {
  
  var path: Owner
  
  var query: Toolguid
}
object QueryToolguid {
  
  inline def apply(path: Owner, query: Toolguid): QueryToolguid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryToolguid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryToolguid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Toolguid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
