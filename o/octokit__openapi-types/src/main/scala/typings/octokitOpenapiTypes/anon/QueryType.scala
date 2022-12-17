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
  
  extension [Self <: QueryType](x: Self) {
    
    inline def setQuery(value: Type): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
