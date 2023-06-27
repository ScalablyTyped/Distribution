package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPlanid extends StObject {
  
  var path: Planid
  
  var query: js.UndefOr[Direction] = js.undefined
}
object PathPlanid {
  
  inline def apply(path: Planid): PathPlanid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPlanid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPlanid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Planid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Direction): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
