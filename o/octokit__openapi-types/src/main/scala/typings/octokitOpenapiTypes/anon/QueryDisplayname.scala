package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDisplayname extends StObject {
  
  var path: Org
  
  var query: Displayname
}
object QueryDisplayname {
  
  inline def apply(path: Org, query: Displayname): QueryDisplayname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDisplayname]
  }
  
  extension [Self <: QueryDisplayname](x: Self) {
    
    inline def setPath(value: Org): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Displayname): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
