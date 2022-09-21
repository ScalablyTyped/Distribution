package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageQString extends StObject {
  
  var query: PerpageQString
}
object QueryPerpageQString {
  
  inline def apply(query: PerpageQString): QueryPerpageQString = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageQString]
  }
  
  extension [Self <: QueryPerpageQString](x: Self) {
    
    inline def setQuery(value: PerpageQString): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
