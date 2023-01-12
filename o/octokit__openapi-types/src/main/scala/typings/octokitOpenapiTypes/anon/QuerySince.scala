package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySince extends StObject {
  
  var query: Since
}
object QuerySince {
  
  inline def apply(query: Since): QuerySince = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuerySince] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Since): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
