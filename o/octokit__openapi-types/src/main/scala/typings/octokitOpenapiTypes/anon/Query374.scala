package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query374 extends StObject {
  
  var path: CommentnumberDiscussionnumberOrg
  
  var query: `374`
}
object Query374 {
  
  inline def apply(path: CommentnumberDiscussionnumberOrg, query: `374`): Query374 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query374]
  }
  
  extension [Self <: Query374](x: Self) {
    
    inline def setPath(value: CommentnumberDiscussionnumberOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `374`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
