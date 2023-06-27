package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `438` extends StObject {
  
  var path: DiscussionnumberTeamid
  
  var query: js.UndefOr[ContentPage] = js.undefined
}
object `438` {
  
  inline def apply(path: DiscussionnumberTeamid): `438` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`438`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `438`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
