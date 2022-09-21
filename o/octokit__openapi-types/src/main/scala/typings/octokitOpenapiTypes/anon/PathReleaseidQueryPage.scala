package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReleaseidQueryPage extends StObject {
  
  var path: Releaseid
  
  var query: Page
}
object PathReleaseidQueryPage {
  
  inline def apply(path: Releaseid, query: Page): PathReleaseidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReleaseidQueryPage]
  }
  
  extension [Self <: PathReleaseidQueryPage](x: Self) {
    
    inline def setPath(value: Releaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
