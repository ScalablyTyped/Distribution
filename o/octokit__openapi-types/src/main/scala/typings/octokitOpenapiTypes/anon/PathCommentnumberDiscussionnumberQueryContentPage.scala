package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberDiscussionnumberQueryContentPage extends StObject {
  
  var path: CommentnumberDiscussionnumber
  
  var query: ContentPage
}
object PathCommentnumberDiscussionnumberQueryContentPage {
  
  inline def apply(path: CommentnumberDiscussionnumber, query: ContentPage): PathCommentnumberDiscussionnumberQueryContentPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberDiscussionnumberQueryContentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentnumberDiscussionnumberQueryContentPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentnumberDiscussionnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
