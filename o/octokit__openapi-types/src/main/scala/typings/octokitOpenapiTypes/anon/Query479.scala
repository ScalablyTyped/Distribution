package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query479 extends StObject {
  
  var path: DiscussionnumberOrgTeamslug
  
  var query: `479`
}
object Query479 {
  
  inline def apply(path: DiscussionnumberOrgTeamslug, query: `479`): Query479 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query479]
  }
  
  extension [Self <: Query479](x: Self) {
    
    inline def setPath(value: DiscussionnumberOrgTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `479`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
