package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query136 extends StObject {
  
  var path: OwnerRepo
  
  var query: `136`
}
object Query136 {
  
  inline def apply(path: OwnerRepo, query: `136`): Query136 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query136]
  }
  
  extension [Self <: Query136](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `136`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
