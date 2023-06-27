package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberQuery extends StObject {
  
  var path: Pullnumber
  
  var query: js.UndefOr[PerpageSince] = js.undefined
}
object PathPullnumberQuery {
  
  inline def apply(path: Pullnumber): PathPullnumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPullnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Pullnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
