package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query157 extends StObject {
  
  var path: Owner
  
  var query: `157`
}
object Query157 {
  
  inline def apply(path: Owner, query: `157`): Query157 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query157]
  }
  
  extension [Self <: Query157](x: Self) {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `157`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
