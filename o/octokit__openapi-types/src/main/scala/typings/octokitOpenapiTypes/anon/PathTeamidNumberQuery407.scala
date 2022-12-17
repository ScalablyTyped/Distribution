package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumberQuery407 extends StObject {
  
  var path: TeamidNumber
  
  var query: `407`
}
object PathTeamidNumberQuery407 {
  
  inline def apply(path: TeamidNumber, query: `407`): PathTeamidNumberQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumberQuery407]
  }
  
  extension [Self <: PathTeamidNumberQuery407](x: Self) {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
