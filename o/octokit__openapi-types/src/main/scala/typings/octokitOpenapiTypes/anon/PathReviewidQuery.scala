package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReviewidQuery extends StObject {
  
  var path: Reviewid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathReviewidQuery {
  
  inline def apply(path: Reviewid): PathReviewidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReviewidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathReviewidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Reviewid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
