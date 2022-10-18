package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsernameStringQueryPage extends StObject {
  
  var path: UsernameString
  
  var query: Page
}
object PathUsernameStringQueryPage {
  
  inline def apply(path: UsernameString, query: Page): PathUsernameStringQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsernameStringQueryPage]
  }
  
  extension [Self <: PathUsernameStringQueryPage](x: Self) {
    
    inline def setPath(value: UsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
