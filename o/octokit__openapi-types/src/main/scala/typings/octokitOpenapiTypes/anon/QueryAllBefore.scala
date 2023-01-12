package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAllBefore extends StObject {
  
  var query: AllBefore
}
object QueryAllBefore {
  
  inline def apply(query: AllBefore): QueryAllBefore = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAllBefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryAllBefore] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: AllBefore): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
