package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumberQuery485 extends StObject {
  
  var path: TeamidNumber
  
  var query: `485`
}
object PathTeamidNumberQuery485 {
  
  inline def apply(path: TeamidNumber, query: `485`): PathTeamidNumberQuery485 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumberQuery485]
  }
  
  extension [Self <: PathTeamidNumberQuery485](x: Self) {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `485`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
