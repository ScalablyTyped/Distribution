package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageState extends StObject {
  
  var query: PagePerpageState
}
object QueryPagePerpageState {
  
  inline def apply(query: PagePerpageState): QueryPagePerpageState = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPagePerpageState] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PagePerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
