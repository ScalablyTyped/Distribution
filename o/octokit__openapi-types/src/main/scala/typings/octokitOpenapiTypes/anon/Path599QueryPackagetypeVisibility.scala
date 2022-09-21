package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path599QueryPackagetypeVisibility extends StObject {
  
  var path: `599`
  
  var query: PackagetypeVisibility
}
object Path599QueryPackagetypeVisibility {
  
  inline def apply(path: `599`, query: PackagetypeVisibility): Path599QueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path599QueryPackagetypeVisibility]
  }
  
  extension [Self <: Path599QueryPackagetypeVisibility](x: Self) {
    
    inline def setPath(value: `599`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PackagetypeVisibility): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
