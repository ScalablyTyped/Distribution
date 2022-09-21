package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberDiscussionnumberTeamidQuery481 extends StObject {
  
  var path: CommentnumberDiscussionnumberTeamid
  
  var query: `481`
}
object PathCommentnumberDiscussionnumberTeamidQuery481 {
  
  inline def apply(path: CommentnumberDiscussionnumberTeamid, query: `481`): PathCommentnumberDiscussionnumberTeamidQuery481 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberDiscussionnumberTeamidQuery481]
  }
  
  extension [Self <: PathCommentnumberDiscussionnumberTeamidQuery481](x: Self) {
    
    inline def setPath(value: CommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `481`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
