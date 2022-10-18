package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitshaOwnerQueryPage extends StObject {
  
  var path: CommitshaOwner
  
  var query: Page
}
object PathCommitshaOwnerQueryPage {
  
  inline def apply(path: CommitshaOwner, query: Page): PathCommitshaOwnerQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitshaOwnerQueryPage]
  }
  
  extension [Self <: PathCommitshaOwnerQueryPage](x: Self) {
    
    inline def setPath(value: CommitshaOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
