package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryContentPage extends StObject {
  
  var path: Commentnumber
  
  var query: ContentPage
}
object QueryContentPage {
  
  inline def apply(path: Commentnumber, query: ContentPage): QueryContentPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryContentPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Commentnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
