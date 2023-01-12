package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumberQuery462 extends StObject {
  
  var path: TeamidNumber
  
  var query: `462`
}
object PathTeamidNumberQuery462 {
  
  inline def apply(path: TeamidNumber, query: `462`): PathTeamidNumberQuery462 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumberQuery462]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamidNumberQuery462] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `462`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
