package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttemptnumberOwnerQuery250 extends StObject {
  
  var path: AttemptnumberOwner
  
  var query: `250`
}
object PathAttemptnumberOwnerQuery250 {
  
  inline def apply(path: AttemptnumberOwner, query: `250`): PathAttemptnumberOwnerQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttemptnumberOwnerQuery250]
  }
  
  extension [Self <: PathAttemptnumberOwnerQuery250](x: Self) {
    
    inline def setPath(value: AttemptnumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
