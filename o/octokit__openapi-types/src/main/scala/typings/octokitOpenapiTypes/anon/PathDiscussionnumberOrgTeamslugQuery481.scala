package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberOrgTeamslugQuery481 extends StObject {
  
  var path: DiscussionnumberOrgTeamslug
  
  var query: `481`
}
object PathDiscussionnumberOrgTeamslugQuery481 {
  
  inline def apply(path: DiscussionnumberOrgTeamslug, query: `481`): PathDiscussionnumberOrgTeamslugQuery481 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberOrgTeamslugQuery481]
  }
  
  extension [Self <: PathDiscussionnumberOrgTeamslugQuery481](x: Self) {
    
    inline def setPath(value: DiscussionnumberOrgTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `481`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
