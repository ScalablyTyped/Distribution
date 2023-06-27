package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidQuery extends StObject {
  
  var path: Teamid
  
  var query: js.UndefOr[DirectionPage] = js.undefined
}
object PathTeamidQuery {
  
  inline def apply(path: Teamid): PathTeamidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Teamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
