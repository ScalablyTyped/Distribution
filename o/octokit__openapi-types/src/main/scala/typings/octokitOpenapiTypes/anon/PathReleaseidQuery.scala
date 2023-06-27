package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReleaseidQuery extends StObject {
  
  var path: Releaseid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathReleaseidQuery {
  
  inline def apply(path: Releaseid): PathReleaseidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReleaseidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathReleaseidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Releaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
