package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberQuery extends StObject {
  
  var path: Commentnumber
  
  var query: js.UndefOr[ContentPage] = js.undefined
}
object PathCommentnumberQuery {
  
  inline def apply(path: Commentnumber): PathCommentnumberQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Commentnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
