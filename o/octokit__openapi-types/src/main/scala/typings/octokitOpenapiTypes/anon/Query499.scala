package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query499 extends StObject {
  
  var path: `292`
  
  var query: `499`
}
object Query499 {
  
  inline def apply(path: `292`, query: `499`): Query499 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query499]
  }
  
  extension [Self <: Query499](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `499`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
