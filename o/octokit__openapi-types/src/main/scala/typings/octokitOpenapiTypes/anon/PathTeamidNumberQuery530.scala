package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumberQuery530 extends StObject {
  
  var path: TeamidNumber
  
  var query: `530`
}
object PathTeamidNumberQuery530 {
  
  inline def apply(path: TeamidNumber, query: `530`): PathTeamidNumberQuery530 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumberQuery530]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamidNumberQuery530] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `530`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
