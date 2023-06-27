package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTeamidNumberQuery extends StObject {
  
  var path: TeamidNumber
  
  var query: js.UndefOr[`625`] = js.undefined
}
object PathTeamidNumberQuery {
  
  inline def apply(path: TeamidNumber): PathTeamidNumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTeamidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTeamidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: TeamidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `625`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
