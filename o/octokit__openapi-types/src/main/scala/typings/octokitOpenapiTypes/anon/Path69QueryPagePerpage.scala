package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path69QueryPagePerpage extends StObject {
  
  var path: `69`
  
  var query: PagePerpage
}
object Path69QueryPagePerpage {
  
  inline def apply(path: `69`, query: PagePerpage): Path69QueryPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path69QueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path69QueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `69`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
