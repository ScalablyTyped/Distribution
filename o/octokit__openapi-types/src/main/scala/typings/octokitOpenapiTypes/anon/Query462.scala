package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query462 extends StObject {
  
  var path: DiscussionnumberOrgTeamslug
  
  var query: `462`
}
object Query462 {
  
  inline def apply(path: DiscussionnumberOrgTeamslug, query: `462`): Query462 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query462]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query462] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberOrgTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `462`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
