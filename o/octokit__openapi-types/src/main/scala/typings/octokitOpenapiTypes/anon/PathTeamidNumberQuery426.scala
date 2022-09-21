package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumberQuery426 extends StObject {
  
  var path: TeamidNumber
  
  var query: `426`
}
object PathTeamidNumberQuery426 {
  
  inline def apply(path: TeamidNumber, query: `426`): PathTeamidNumberQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumberQuery426]
  }
  
  extension [Self <: PathTeamidNumberQuery426](x: Self) {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
