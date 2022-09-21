package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query223 extends StObject {
  
  var path: Basehead
  
  var query: `223`
}
object Query223 {
  
  inline def apply(path: Basehead, query: `223`): Query223 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query223]
  }
  
  extension [Self <: Query223](x: Self) {
    
    inline def setPath(value: Basehead): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `223`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
