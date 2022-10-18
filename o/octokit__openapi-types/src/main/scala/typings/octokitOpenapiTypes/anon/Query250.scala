package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query250 extends StObject {
  
  var path: `246`
  
  var query: `250`
}
object Query250 {
  
  inline def apply(path: `246`, query: `250`): Query250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query250]
  }
  
  extension [Self <: Query250](x: Self) {
    
    inline def setPath(value: `246`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
