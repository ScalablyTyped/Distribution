package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQString extends StObject {
  
  var query: QString
}
object QueryQString {
  
  inline def apply(query: QString): QueryQString = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryQString] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: QString): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
