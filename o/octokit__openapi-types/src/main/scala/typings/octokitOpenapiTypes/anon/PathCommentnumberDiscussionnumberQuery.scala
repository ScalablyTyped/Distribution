package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberDiscussionnumberQuery extends StObject {
  
  var path: CommentnumberDiscussionnumber
  
  var query: js.UndefOr[ContentPage] = js.undefined
}
object PathCommentnumberDiscussionnumberQuery {
  
  inline def apply(path: CommentnumberDiscussionnumber): PathCommentnumberDiscussionnumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberDiscussionnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentnumberDiscussionnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentnumberDiscussionnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
