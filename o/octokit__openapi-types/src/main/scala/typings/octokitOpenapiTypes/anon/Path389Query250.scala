package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path389Query250 extends StObject {
  
  var path: `389`
  
  var query: `250`
}
object Path389Query250 {
  
  inline def apply(path: `389`, query: `250`): Path389Query250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path389Query250]
  }
  
  extension [Self <: Path389Query250](x: Self) {
    
    inline def setPath(value: `389`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
