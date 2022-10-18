package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query519 extends StObject {
  
  var path: `292`
  
  var query: `519`
}
object Query519 {
  
  inline def apply(path: `292`, query: `519`): Query519 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query519]
  }
  
  extension [Self <: Query519](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `519`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
