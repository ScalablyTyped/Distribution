package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQueryBeforeDirection extends StObject {
  
  var path: OwnerString
  
  var query: BeforeDirection
}
object PathOwnerStringQueryBeforeDirection {
  
  inline def apply(path: OwnerString, query: BeforeDirection): PathOwnerStringQueryBeforeDirection = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQueryBeforeDirection]
  }
  
  extension [Self <: PathOwnerStringQueryBeforeDirection](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: BeforeDirection): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
