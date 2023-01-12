package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReviewidQueryPage extends StObject {
  
  var path: Reviewid
  
  var query: Page
}
object PathReviewidQueryPage {
  
  inline def apply(path: Reviewid, query: Page): PathReviewidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReviewidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathReviewidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Reviewid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
