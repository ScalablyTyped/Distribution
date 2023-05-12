package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path394 extends StObject {
  
  var path: `394`
  
  var query: `393`
}
object Path394 {
  
  inline def apply(path: `394`, query: `393`): Path394 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path394]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path394] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `394`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `393`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
