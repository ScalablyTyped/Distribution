package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberNumberQuery462 extends StObject {
  
  var path: DiscussionnumberNumber
  
  var query: `462`
}
object PathDiscussionnumberNumberQuery462 {
  
  inline def apply(path: DiscussionnumberNumber, query: `462`): PathDiscussionnumberNumberQuery462 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberNumberQuery462]
  }
  
  extension [Self <: PathDiscussionnumberNumberQuery462](x: Self) {
    
    inline def setPath(value: DiscussionnumberNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `462`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
