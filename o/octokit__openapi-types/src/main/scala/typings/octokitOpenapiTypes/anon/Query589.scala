package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query589 extends StObject {
  
  var path: OwnerString
  
  var query: `589`
}
object Query589 {
  
  inline def apply(path: OwnerString, query: `589`): Query589 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query589]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query589] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `589`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
