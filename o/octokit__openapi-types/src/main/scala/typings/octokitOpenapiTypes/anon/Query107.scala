package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query107 extends StObject {
  
  var path: OwnerRepo
  
  var query: `107`
}
object Query107 {
  
  inline def apply(path: OwnerRepo, query: `107`): Query107 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query107]
  }
  
  extension [Self <: Query107](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `107`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
