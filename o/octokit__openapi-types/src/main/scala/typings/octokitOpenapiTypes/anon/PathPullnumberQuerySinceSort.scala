package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberQuerySinceSort extends StObject {
  
  var path: Pullnumber
  
  var query: SinceSort
}
object PathPullnumberQuerySinceSort {
  
  inline def apply(path: Pullnumber, query: SinceSort): PathPullnumberQuerySinceSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberQuerySinceSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPullnumberQuerySinceSort] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Pullnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: SinceSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
