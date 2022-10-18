package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryVisibletoorganization extends StObject {
  
  var path: `246`
  
  var query: Visibletoorganization
}
object QueryVisibletoorganization {
  
  inline def apply(path: `246`, query: Visibletoorganization): QueryVisibletoorganization = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryVisibletoorganization]
  }
  
  extension [Self <: QueryVisibletoorganization](x: Self) {
    
    inline def setPath(value: `246`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Visibletoorganization): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
