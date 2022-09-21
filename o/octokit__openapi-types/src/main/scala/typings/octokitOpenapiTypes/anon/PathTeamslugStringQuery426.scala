package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamslugStringQuery426 extends StObject {
  
  var path: TeamslugString
  
  var query: `426`
}
object PathTeamslugStringQuery426 {
  
  inline def apply(path: TeamslugString, query: `426`): PathTeamslugStringQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamslugStringQuery426]
  }
  
  extension [Self <: PathTeamslugStringQuery426](x: Self) {
    
    inline def setPath(value: TeamslugString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
