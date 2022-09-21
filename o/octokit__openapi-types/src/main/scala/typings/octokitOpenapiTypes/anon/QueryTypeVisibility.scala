package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTypeVisibility extends StObject {
  
  var query: TypeVisibility
}
object QueryTypeVisibility {
  
  inline def apply(query: TypeVisibility): QueryTypeVisibility = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTypeVisibility]
  }
  
  extension [Self <: QueryTypeVisibility](x: Self) {
    
    inline def setQuery(value: TypeVisibility): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
