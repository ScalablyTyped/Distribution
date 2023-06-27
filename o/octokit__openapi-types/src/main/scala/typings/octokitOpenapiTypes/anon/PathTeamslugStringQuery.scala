package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamslugStringQuery extends StObject {
  
  var path: TeamslugString
  
  var query: js.UndefOr[PerpagePinned] = js.undefined
}
object PathTeamslugStringQuery {
  
  inline def apply(path: TeamslugString): PathTeamslugStringQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamslugStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamslugStringQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamslugString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpagePinned): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
