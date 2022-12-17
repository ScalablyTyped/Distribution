package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberNumberQuery464 extends StObject {
  
  var path: DiscussionnumberNumber
  
  var query: `464`
}
object PathDiscussionnumberNumberQuery464 {
  
  inline def apply(path: DiscussionnumberNumber, query: `464`): PathDiscussionnumberNumberQuery464 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberNumberQuery464]
  }
  
  extension [Self <: PathDiscussionnumberNumberQuery464](x: Self) {
    
    inline def setPath(value: DiscussionnumberNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `464`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
