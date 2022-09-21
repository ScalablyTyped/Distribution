package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAffiliation extends StObject {
  
  var path: `139`
  
  var query: Affiliation
}
object QueryAffiliation {
  
  inline def apply(path: `139`, query: Affiliation): QueryAffiliation = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAffiliation]
  }
  
  extension [Self <: QueryAffiliation](x: Self) {
    
    inline def setPath(value: `139`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Affiliation): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
