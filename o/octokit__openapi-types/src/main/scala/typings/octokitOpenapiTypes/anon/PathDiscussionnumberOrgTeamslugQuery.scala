package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberOrgTeamslugQuery extends StObject {
  
  var path: DiscussionnumberOrgTeamslug
  
  var query: js.UndefOr[`625`] = js.undefined
}
object PathDiscussionnumberOrgTeamslugQuery {
  
  inline def apply(path: DiscussionnumberOrgTeamslug): PathDiscussionnumberOrgTeamslugQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberOrgTeamslugQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDiscussionnumberOrgTeamslugQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberOrgTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `625`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
