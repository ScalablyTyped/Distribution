package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAppidCheckname extends StObject {
  
  var path: OwnerRef
  
  var query: AppidCheckname
}
object QueryAppidCheckname {
  
  inline def apply(path: OwnerRef, query: AppidCheckname): QueryAppidCheckname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAppidCheckname]
  }
  
  extension [Self <: QueryAppidCheckname](x: Self) {
    
    inline def setPath(value: OwnerRef): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AppidCheckname): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
