package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryKeyPage extends StObject {
  
  var path: `292`
  
  var query: KeyPage
}
object QueryKeyPage {
  
  inline def apply(path: `292`, query: KeyPage): QueryKeyPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryKeyPage]
  }
  
  extension [Self <: QueryKeyPage](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: KeyPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
