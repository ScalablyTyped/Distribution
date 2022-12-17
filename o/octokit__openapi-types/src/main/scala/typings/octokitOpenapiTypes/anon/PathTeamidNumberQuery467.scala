package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumberQuery467 extends StObject {
  
  var path: TeamidNumber
  
  var query: `467`
}
object PathTeamidNumberQuery467 {
  
  inline def apply(path: TeamidNumber, query: `467`): PathTeamidNumberQuery467 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumberQuery467]
  }
  
  extension [Self <: PathTeamidNumberQuery467](x: Self) {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `467`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
