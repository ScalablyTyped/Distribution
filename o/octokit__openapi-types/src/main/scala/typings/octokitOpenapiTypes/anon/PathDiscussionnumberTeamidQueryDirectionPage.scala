package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberTeamidQueryDirectionPage extends StObject {
  
  var path: DiscussionnumberTeamid
  
  var query: DirectionPage
}
object PathDiscussionnumberTeamidQueryDirectionPage {
  
  inline def apply(path: DiscussionnumberTeamid, query: DirectionPage): PathDiscussionnumberTeamidQueryDirectionPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberTeamidQueryDirectionPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDiscussionnumberTeamidQueryDirectionPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
