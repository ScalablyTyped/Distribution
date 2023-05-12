package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query637 extends StObject {
  
  var path: OwnerString
  
  var query: `637`
}
object Query637 {
  
  inline def apply(path: OwnerString, query: `637`): Query637 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query637]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query637] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `637`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
