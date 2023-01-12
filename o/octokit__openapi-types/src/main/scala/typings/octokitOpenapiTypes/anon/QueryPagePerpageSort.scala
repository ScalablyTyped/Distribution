package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageSort extends StObject {
  
  var query: PagePerpageSort
}
object QueryPagePerpageSort {
  
  inline def apply(query: PagePerpageSort): QueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPagePerpageSort] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PagePerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
