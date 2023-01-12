package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCheckrunidQueryPage extends StObject {
  
  var path: Checkrunid
  
  var query: Page
}
object PathCheckrunidQueryPage {
  
  inline def apply(path: Checkrunid, query: Page): PathCheckrunidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCheckrunidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCheckrunidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Checkrunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
