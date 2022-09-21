package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidQueryPerpageRole extends StObject {
  
  var path: Teamid
  
  var query: PerpageRole
}
object PathTeamidQueryPerpageRole {
  
  inline def apply(path: Teamid, query: PerpageRole): PathTeamidQueryPerpageRole = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidQueryPerpageRole]
  }
  
  extension [Self <: PathTeamidQueryPerpageRole](x: Self) {
    
    inline def setPath(value: Teamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageRole): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
