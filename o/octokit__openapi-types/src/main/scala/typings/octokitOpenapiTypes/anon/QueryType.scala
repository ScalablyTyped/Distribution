package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryType extends StObject {
  
  var query: Type
}
object QueryType {
  
  inline def apply(query: Type): QueryType = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryType] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Type): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
