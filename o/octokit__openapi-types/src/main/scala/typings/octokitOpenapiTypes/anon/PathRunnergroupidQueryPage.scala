package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunnergroupidQueryPage extends StObject {
  
  var path: Runnergroupid
  
  var query: Page
}
object PathRunnergroupidQueryPage {
  
  inline def apply(path: Runnergroupid, query: Page): PathRunnergroupidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunnergroupidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRunnergroupidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Runnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
