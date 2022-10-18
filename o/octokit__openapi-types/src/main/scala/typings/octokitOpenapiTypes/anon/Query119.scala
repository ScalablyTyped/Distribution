package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query119 extends StObject {
  
  var path: Basehead
  
  var query: `119`
}
object Query119 {
  
  inline def apply(path: Basehead, query: `119`): Query119 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query119]
  }
  
  extension [Self <: Query119](x: Self) {
    
    inline def setPath(value: Basehead): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `119`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
