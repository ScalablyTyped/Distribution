package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsernameQueryPage extends StObject {
  
  var path: Username
  
  var query: Page
}
object PathUsernameQueryPage {
  
  inline def apply(path: Username, query: Page): PathUsernameQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsernameQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathUsernameQueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Username): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
