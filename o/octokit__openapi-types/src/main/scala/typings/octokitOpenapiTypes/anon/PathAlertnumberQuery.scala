package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberQuery extends StObject {
  
  var path: Alertnumber
  
  var query: js.UndefOr[PerpageRef] = js.undefined
}
object PathAlertnumberQuery {
  
  inline def apply(path: Alertnumber): PathAlertnumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAlertnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Alertnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
