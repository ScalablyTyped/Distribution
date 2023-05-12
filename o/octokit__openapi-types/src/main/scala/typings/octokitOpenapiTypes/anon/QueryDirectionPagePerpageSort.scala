package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDirectionPagePerpageSort extends StObject {
  
  var query: DirectionPagePerpageSort
}
object QueryDirectionPagePerpageSort {
  
  inline def apply(query: DirectionPagePerpageSort): QueryDirectionPagePerpageSort = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDirectionPagePerpageSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDirectionPagePerpageSort] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: DirectionPagePerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
