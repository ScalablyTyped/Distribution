package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryS extends StObject {
  
  var query: S
}
object QueryS {
  
  inline def apply(query: S): QueryS = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryS]
  }
  
  extension [Self <: QueryS](x: Self) {
    
    inline def setQuery(value: S): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
