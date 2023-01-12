package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageQSort extends StObject {
  
  var query: PagePerpageQSort
}
object QueryPagePerpageQSort {
  
  inline def apply(query: PagePerpageQSort): QueryPagePerpageQSort = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageQSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPagePerpageQSort] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PagePerpageQSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
