package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberTeamidQueryDirectionPagePerpage extends StObject {
  
  var path: DiscussionnumberTeamid
  
  var query: DirectionPagePerpage
}
object PathDiscussionnumberTeamidQueryDirectionPagePerpage {
  
  inline def apply(path: DiscussionnumberTeamid, query: DirectionPagePerpage): PathDiscussionnumberTeamidQueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberTeamidQueryDirectionPagePerpage]
  }
  
  extension [Self <: PathDiscussionnumberTeamidQueryDirectionPagePerpage](x: Self) {
    
    inline def setPath(value: DiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
