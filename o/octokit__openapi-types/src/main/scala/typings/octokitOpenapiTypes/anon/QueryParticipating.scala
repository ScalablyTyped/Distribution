package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParticipating extends StObject {
  
  var query: Participating
}
object QueryParticipating {
  
  inline def apply(query: Participating): QueryParticipating = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParticipating]
  }
  
  extension [Self <: QueryParticipating](x: Self) {
    
    inline def setQuery(value: Participating): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
