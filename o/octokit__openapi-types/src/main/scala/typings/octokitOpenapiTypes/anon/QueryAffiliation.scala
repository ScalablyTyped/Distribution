package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAffiliation extends StObject {
  
  var path: `134`
  
  var query: Affiliation
}
object QueryAffiliation {
  
  inline def apply(path: `134`, query: Affiliation): QueryAffiliation = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAffiliation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryAffiliation] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `134`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Affiliation): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
