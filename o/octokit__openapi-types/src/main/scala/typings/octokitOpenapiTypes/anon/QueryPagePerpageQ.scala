package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageQ extends StObject {
  
  var query: PagePerpageQ
}
object QueryPagePerpageQ {
  
  inline def apply(query: PagePerpageQ): QueryPagePerpageQ = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageQ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPagePerpageQ] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PagePerpageQ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
