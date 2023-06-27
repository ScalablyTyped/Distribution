package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamslugQuery extends StObject {
  
  var path: Teamslug
  
  var query: js.UndefOr[Pinned] = js.undefined
}
object PathTeamslugQuery {
  
  inline def apply(path: Teamslug): PathTeamslugQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamslugQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamslugQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Teamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Pinned): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
