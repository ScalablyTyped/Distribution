package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBasehead extends StObject {
  
  var path: Basehead
  
  var query: PagePerpage
}
object PathBasehead {
  
  inline def apply(path: Basehead, query: PagePerpage): PathBasehead = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBasehead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBasehead] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Basehead): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
