package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberQueryContentPage extends StObject {
  
  var path: Issuenumber
  
  var query: ContentPage
}
object PathIssuenumberQueryContentPage {
  
  inline def apply(path: Issuenumber, query: ContentPage): PathIssuenumberQueryContentPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberQueryContentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathIssuenumberQueryContentPage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Issuenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
