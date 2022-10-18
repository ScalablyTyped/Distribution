package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query378 extends StObject {
  
  var path: `364`
  
  var query: `378`
}
object Query378 {
  
  inline def apply(path: `364`, query: `378`): Query378 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query378]
  }
  
  extension [Self <: Query378](x: Self) {
    
    inline def setPath(value: `364`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `378`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
