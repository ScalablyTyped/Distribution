package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberDiscussionnumberTeamidQuery532 extends StObject {
  
  var path: CommentnumberDiscussionnumberTeamid
  
  var query: `532`
}
object PathCommentnumberDiscussionnumberTeamidQuery532 {
  
  inline def apply(path: CommentnumberDiscussionnumberTeamid, query: `532`): PathCommentnumberDiscussionnumberTeamidQuery532 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberDiscussionnumberTeamidQuery532]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentnumberDiscussionnumberTeamidQuery532] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `532`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
