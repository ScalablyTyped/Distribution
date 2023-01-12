package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidQueryDirectionPage extends StObject {
  
  var path: Teamid
  
  var query: DirectionPage
}
object PathTeamidQueryDirectionPage {
  
  inline def apply(path: Teamid, query: DirectionPage): PathTeamidQueryDirectionPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidQueryDirectionPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamidQueryDirectionPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Teamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
