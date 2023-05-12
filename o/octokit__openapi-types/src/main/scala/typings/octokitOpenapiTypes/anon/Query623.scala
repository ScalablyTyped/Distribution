package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query623 extends StObject {
  
  var path: OwnerReleaseid
  
  var query: `623`
}
object Query623 {
  
  inline def apply(path: OwnerReleaseid, query: `623`): Query623 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query623]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query623] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `623`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
