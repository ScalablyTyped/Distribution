package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPatrequestidQueryPage extends StObject {
  
  var path: Patrequestid
  
  var query: Page
}
object PathPatrequestidQueryPage {
  
  inline def apply(path: Patrequestid, query: Page): PathPatrequestidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPatrequestidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPatrequestidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Patrequestid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
