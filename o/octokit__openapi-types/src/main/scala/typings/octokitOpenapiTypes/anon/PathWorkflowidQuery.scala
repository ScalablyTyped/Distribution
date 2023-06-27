package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathWorkflowidQuery extends StObject {
  
  var path: Workflowid
  
  var query: js.UndefOr[Actor] = js.undefined
}
object PathWorkflowidQuery {
  
  inline def apply(path: Workflowid): PathWorkflowidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathWorkflowidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathWorkflowidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Workflowid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Actor): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
