package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameOwnerQueryPagePerpage extends StObject {
  
  var path: EnvironmentnameOwner
  
  var query: PagePerpage
}
object PathEnvironmentnameOwnerQueryPagePerpage {
  
  inline def apply(path: EnvironmentnameOwner, query: PagePerpage): PathEnvironmentnameOwnerQueryPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameOwnerQueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameOwnerQueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
