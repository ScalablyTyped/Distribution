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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPerpageQString] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PerpageQString): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
