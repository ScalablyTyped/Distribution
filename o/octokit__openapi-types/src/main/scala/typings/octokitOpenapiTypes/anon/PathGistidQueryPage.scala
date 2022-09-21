package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGistidQueryPage extends StObject {
  
  var path: Gistid
  
  var query: Page
}
object PathGistidQueryPage {
  
  inline def apply(path: Gistid, query: Page): PathGistidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGistidQueryPage]
  }
  
  extension [Self <: PathGistidQueryPage](x: Self) {
    
    inline def setPath(value: Gistid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
