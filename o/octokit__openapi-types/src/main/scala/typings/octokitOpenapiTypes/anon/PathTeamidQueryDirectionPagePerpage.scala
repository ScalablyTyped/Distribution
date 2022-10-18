package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidQueryDirectionPagePerpage extends StObject {
  
  var path: Teamid
  
  var query: DirectionPagePerpage
}
object PathTeamidQueryDirectionPagePerpage {
  
  inline def apply(path: Teamid, query: DirectionPagePerpage): PathTeamidQueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidQueryDirectionPagePerpage]
  }
  
  extension [Self <: PathTeamidQueryDirectionPagePerpage](x: Self) {
    
    inline def setPath(value: Teamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
