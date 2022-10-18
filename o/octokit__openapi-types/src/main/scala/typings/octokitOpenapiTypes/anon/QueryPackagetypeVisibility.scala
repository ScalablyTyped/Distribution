package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPackagetypeVisibility extends StObject {
  
  var path: `300`
  
  var query: PackagetypeVisibility
}
object QueryPackagetypeVisibility {
  
  inline def apply(path: `300`, query: PackagetypeVisibility): QueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPackagetypeVisibility]
  }
  
  extension [Self <: QueryPackagetypeVisibility](x: Self) {
    
    inline def setPath(value: `300`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PackagetypeVisibility): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
