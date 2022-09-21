package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumberQueryPage extends StObject {
  
  var path: Pullnumber
  
  var query: Page
}
object PathPullnumberQueryPage {
  
  inline def apply(path: Pullnumber, query: Page): PathPullnumberQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumberQueryPage]
  }
  
  extension [Self <: PathPullnumberQueryPage](x: Self) {
    
    inline def setPath(value: Pullnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
