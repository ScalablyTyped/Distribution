package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberTeamidQueryContentPage extends StObject {
  
  var path: DiscussionnumberTeamid
  
  var query: ContentPage
}
object PathDiscussionnumberTeamidQueryContentPage {
  
  inline def apply(path: DiscussionnumberTeamid, query: ContentPage): PathDiscussionnumberTeamidQueryContentPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberTeamidQueryContentPage]
  }
  
  extension [Self <: PathDiscussionnumberTeamidQueryContentPage](x: Self) {
    
    inline def setPath(value: DiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
