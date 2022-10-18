package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path615QueryPackagetypeVisibility extends StObject {
  
  var path: `615`
  
  var query: PackagetypeVisibility
}
object Path615QueryPackagetypeVisibility {
  
  inline def apply(path: `615`, query: PackagetypeVisibility): Path615QueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path615QueryPackagetypeVisibility]
  }
  
  extension [Self <: Path615QueryPackagetypeVisibility](x: Self) {
    
    inline def setPath(value: `615`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PackagetypeVisibility): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
