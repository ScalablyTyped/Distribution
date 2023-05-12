package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query553 extends StObject {
  
  var path: OwnerString
  
  var query: `553`
}
object Query553 {
  
  inline def apply(path: OwnerString, query: `553`): Query553 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query553]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query553] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `553`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
