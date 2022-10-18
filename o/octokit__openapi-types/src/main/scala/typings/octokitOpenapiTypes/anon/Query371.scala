package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query371 extends StObject {
  
  var path: DiscussionnumberOrgTeamslug
  
  var query: `371`
}
object Query371 {
  
  inline def apply(path: DiscussionnumberOrgTeamslug, query: `371`): Query371 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query371]
  }
  
  extension [Self <: Query371](x: Self) {
    
    inline def setPath(value: DiscussionnumberOrgTeamslug): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `371`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
