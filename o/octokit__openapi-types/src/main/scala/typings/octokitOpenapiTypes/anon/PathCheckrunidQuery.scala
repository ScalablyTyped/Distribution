package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCheckrunidQuery extends StObject {
  
  var path: Checkrunid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathCheckrunidQuery {
  
  inline def apply(path: Checkrunid): PathCheckrunidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCheckrunidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCheckrunidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Checkrunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
