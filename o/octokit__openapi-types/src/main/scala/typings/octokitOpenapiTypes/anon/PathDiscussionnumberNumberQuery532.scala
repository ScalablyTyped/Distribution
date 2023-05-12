package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberNumberQuery532 extends StObject {
  
  var path: DiscussionnumberNumber
  
  var query: `532`
}
object PathDiscussionnumberNumberQuery532 {
  
  inline def apply(path: DiscussionnumberNumber, query: `532`): PathDiscussionnumberNumberQuery532 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberNumberQuery532]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDiscussionnumberNumberQuery532] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `532`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
