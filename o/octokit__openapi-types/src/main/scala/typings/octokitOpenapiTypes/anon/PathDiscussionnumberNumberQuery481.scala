package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberNumberQuery481 extends StObject {
  
  var path: DiscussionnumberNumber
  
  var query: `481`
}
object PathDiscussionnumberNumberQuery481 {
  
  inline def apply(path: DiscussionnumberNumber, query: `481`): PathDiscussionnumberNumberQuery481 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberNumberQuery481]
  }
  
  extension [Self <: PathDiscussionnumberNumberQuery481](x: Self) {
    
    inline def setPath(value: DiscussionnumberNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `481`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
