package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query514 extends StObject {
  
  var path: OwnerString
  
  var query: `514`
}
object Query514 {
  
  inline def apply(path: OwnerString, query: `514`): Query514 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query514]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query514] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `514`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
