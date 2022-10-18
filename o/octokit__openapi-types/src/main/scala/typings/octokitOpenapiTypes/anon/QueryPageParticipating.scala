package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPageParticipating extends StObject {
  
  var path: `292`
  
  var query: PageParticipating
}
object QueryPageParticipating {
  
  inline def apply(path: `292`, query: PageParticipating): QueryPageParticipating = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPageParticipating]
  }
  
  extension [Self <: QueryPageParticipating](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PageParticipating): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
