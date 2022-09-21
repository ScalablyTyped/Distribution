package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidQueryPage extends StObject {
  
  var path: Teamid
  
  var query: Page
}
object PathTeamidQueryPage {
  
  inline def apply(path: Teamid, query: Page): PathTeamidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidQueryPage]
  }
  
  extension [Self <: PathTeamidQueryPage](x: Self) {
    
    inline def setPath(value: Teamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
