package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path370QueryPerpage extends StObject {
  
  var path: `370`
  
  var query: Perpage
}
object Path370QueryPerpage {
  
  inline def apply(path: `370`, query: Perpage): Path370QueryPerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path370QueryPerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path370QueryPerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `370`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Perpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
