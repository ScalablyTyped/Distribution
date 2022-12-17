package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path577QueryPackagetypeVisibility extends StObject {
  
  var path: `577`
  
  var query: PackagetypeVisibility
}
object Path577QueryPackagetypeVisibility {
  
  inline def apply(path: `577`, query: PackagetypeVisibility): Path577QueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path577QueryPackagetypeVisibility]
  }
  
  extension [Self <: Path577QueryPackagetypeVisibility](x: Self) {
    
    inline def setPath(value: `577`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PackagetypeVisibility): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
