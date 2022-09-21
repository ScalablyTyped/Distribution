package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query255 extends StObject {
  
  var path: Owner
  
  var query: `255`
}
object Query255 {
  
  inline def apply(path: Owner, query: `255`): Query255 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query255]
  }
  
  extension [Self <: Query255](x: Self) {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `255`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
