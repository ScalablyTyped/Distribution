package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPatrequestidQuery extends StObject {
  
  var path: Patrequestid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathPatrequestidQuery {
  
  inline def apply(path: Patrequestid): PathPatrequestidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPatrequestidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPatrequestidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Patrequestid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
