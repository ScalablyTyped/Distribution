package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberTeamidQuery extends StObject {
  
  var path: DiscussionnumberTeamid
  
  var query: js.UndefOr[DirectionPage] = js.undefined
}
object PathDiscussionnumberTeamidQuery {
  
  inline def apply(path: DiscussionnumberTeamid): PathDiscussionnumberTeamidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberTeamidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDiscussionnumberTeamidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
