package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query167 extends StObject {
  
  var path: Owner
  
  var query: `167`
}
object Query167 {
  
  inline def apply(path: Owner, query: `167`): Query167 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query167]
  }
  
  extension [Self <: Query167](x: Self) {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `167`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
