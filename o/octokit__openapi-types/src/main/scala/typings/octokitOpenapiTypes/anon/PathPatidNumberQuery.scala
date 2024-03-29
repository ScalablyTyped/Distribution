package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPatidNumberQuery extends StObject {
  
  var path: PatidNumber
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathPatidNumberQuery {
  
  inline def apply(path: PatidNumber): PathPatidNumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPatidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPatidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PatidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
