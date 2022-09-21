package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query481 extends StObject {
  
  var path: CommentnumberDiscussionnumberOrg
  
  var query: `481`
}
object Query481 {
  
  inline def apply(path: CommentnumberDiscussionnumberOrg, query: `481`): Query481 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query481]
  }
  
  extension [Self <: Query481](x: Self) {
    
    inline def setPath(value: CommentnumberDiscussionnumberOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `481`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
