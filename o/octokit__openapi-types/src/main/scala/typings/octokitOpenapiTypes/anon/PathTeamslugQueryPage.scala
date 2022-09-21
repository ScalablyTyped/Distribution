package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamslugQueryPage extends StObject {
  
  var path: Teamslug
  
  var query: Page
}
object PathTeamslugQueryPage {
  
  inline def apply(path: Teamslug, query: Page): PathTeamslugQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamslugQueryPage]
  }
  
  extension [Self <: PathTeamslugQueryPage](x: Self) {
    
    inline def setPath(value: Teamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
