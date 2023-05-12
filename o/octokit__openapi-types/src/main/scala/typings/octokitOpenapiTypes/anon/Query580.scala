package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query580 extends StObject {
  
  var path: OwnerString
  
  var query: `580`
}
object Query580 {
  
  inline def apply(path: OwnerString, query: `580`): Query580 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query580]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query580] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `580`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
