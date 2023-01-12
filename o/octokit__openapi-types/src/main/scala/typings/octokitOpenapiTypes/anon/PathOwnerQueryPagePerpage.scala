package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerQueryPagePerpage extends StObject {
  
  var path: Owner
  
  var query: PagePerpage
}
object PathOwnerQueryPagePerpage {
  
  inline def apply(path: Owner, query: PagePerpage): PathOwnerQueryPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerQueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerQueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
