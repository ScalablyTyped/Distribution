package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path786QueryPackagetypePagePerpage extends StObject {
  
  var path: `786`
  
  var query: PackagetypePagePerpage
}
object Path786QueryPackagetypePagePerpage {
  
  inline def apply(path: `786`, query: PackagetypePagePerpage): Path786QueryPackagetypePagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path786QueryPackagetypePagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path786QueryPackagetypePagePerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `786`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PackagetypePagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
