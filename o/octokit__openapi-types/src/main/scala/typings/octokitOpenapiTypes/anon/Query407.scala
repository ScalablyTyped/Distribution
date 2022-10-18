package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query407 extends StObject {
  
  var path: `292`
  
  var query: `407`
}
object Query407 {
  
  inline def apply(path: `292`, query: `407`): Query407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query407]
  }
  
  extension [Self <: Query407](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
