package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQuery205 extends StObject {
  
  var path: OwnerString
  
  var query: `205`
}
object PathOwnerStringQuery205 {
  
  inline def apply(path: OwnerString, query: `205`): PathOwnerStringQuery205 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQuery205]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerStringQuery205] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `205`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
