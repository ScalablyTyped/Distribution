package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberOrgTeamslugQuery532 extends StObject {
  
  var path: DiscussionnumberOrgTeamslug
  
  var query: `532`
}
object PathDiscussionnumberOrgTeamslugQuery532 {
  
  inline def apply(path: DiscussionnumberOrgTeamslug, query: `532`): PathDiscussionnumberOrgTeamslugQuery532 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberOrgTeamslugQuery532]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDiscussionnumberOrgTeamslugQuery532] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberOrgTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `532`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
