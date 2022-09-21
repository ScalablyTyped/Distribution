package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumberQuery479 extends StObject {
  
  var path: TeamidNumber
  
  var query: `479`
}
object PathTeamidNumberQuery479 {
  
  inline def apply(path: TeamidNumber, query: `479`): PathTeamidNumberQuery479 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumberQuery479]
  }
  
  extension [Self <: PathTeamidNumberQuery479](x: Self) {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `479`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
