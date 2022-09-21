package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberQueryPage extends StObject {
  
  var path: Issuenumber
  
  var query: Page
}
object PathIssuenumberQueryPage {
  
  inline def apply(path: Issuenumber, query: Page): PathIssuenumberQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberQueryPage]
  }
  
  extension [Self <: PathIssuenumberQueryPage](x: Self) {
    
    inline def setPath(value: Issuenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
