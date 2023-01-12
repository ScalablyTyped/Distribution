package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageSince extends StObject {
  
  var query: PerpageSince
}
object QueryPerpageSince {
  
  inline def apply(query: PerpageSince): QueryPerpageSince = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPerpageSince] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
