package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberQueryPagePerpage extends StObject {
  
  var path: Alertnumber
  
  var query: PagePerpage
}
object PathAlertnumberQueryPagePerpage {
  
  inline def apply(path: Alertnumber, query: PagePerpage): PathAlertnumberQueryPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberQueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAlertnumberQueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Alertnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
