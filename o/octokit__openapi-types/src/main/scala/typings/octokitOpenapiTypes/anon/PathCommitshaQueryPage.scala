package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitshaQueryPage extends StObject {
  
  var path: Commitsha
  
  var query: Page
}
object PathCommitshaQueryPage {
  
  inline def apply(path: Commitsha, query: Page): PathCommitshaQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitshaQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommitshaQueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Commitsha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
