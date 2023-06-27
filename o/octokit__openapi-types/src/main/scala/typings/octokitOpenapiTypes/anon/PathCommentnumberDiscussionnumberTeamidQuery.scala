package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberDiscussionnumberTeamidQuery extends StObject {
  
  var path: CommentnumberDiscussionnumberTeamid
  
  var query: js.UndefOr[`627`] = js.undefined
}
object PathCommentnumberDiscussionnumberTeamidQuery {
  
  inline def apply(path: CommentnumberDiscussionnumberTeamid): PathCommentnumberDiscussionnumberTeamidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberDiscussionnumberTeamidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentnumberDiscussionnumberTeamidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `627`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
