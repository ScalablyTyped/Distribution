package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query229 extends StObject {
  
  var path: Basehead
  
  var query: `229`
}
object Query229 {
  
  inline def apply(path: Basehead, query: `229`): Query229 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query229]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query229] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Basehead): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `229`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
