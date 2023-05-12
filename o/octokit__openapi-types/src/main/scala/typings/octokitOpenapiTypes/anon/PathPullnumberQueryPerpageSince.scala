package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberQueryPerpageSince extends StObject {
  
  var path: Pullnumber
  
  var query: PerpageSince
}
object PathPullnumberQueryPerpageSince {
  
  inline def apply(path: Pullnumber, query: PerpageSince): PathPullnumberQueryPerpageSince = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberQueryPerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPullnumberQueryPerpageSince] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Pullnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
