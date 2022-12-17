package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCheckrunidOwnerQuery407 extends StObject {
  
  var path: CheckrunidOwner
  
  var query: `407`
}
object PathCheckrunidOwnerQuery407 {
  
  inline def apply(path: CheckrunidOwner, query: `407`): PathCheckrunidOwnerQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCheckrunidOwnerQuery407]
  }
  
  extension [Self <: PathCheckrunidOwnerQuery407](x: Self) {
    
    inline def setPath(value: CheckrunidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
