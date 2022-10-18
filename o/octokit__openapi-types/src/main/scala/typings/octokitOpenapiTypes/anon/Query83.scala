package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query83 extends StObject {
  
  var path: Runid
  
  var query: `83`
}
object Query83 {
  
  inline def apply(path: Runid, query: `83`): Query83 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query83]
  }
  
  extension [Self <: Query83](x: Self) {
    
    inline def setPath(value: Runid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `83`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
