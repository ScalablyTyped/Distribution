package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path577Query593 extends StObject {
  
  var path: `577`
  
  var query: `593`
}
object Path577Query593 {
  
  inline def apply(path: `577`, query: `593`): Path577Query593 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path577Query593]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path577Query593] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `577`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `593`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
