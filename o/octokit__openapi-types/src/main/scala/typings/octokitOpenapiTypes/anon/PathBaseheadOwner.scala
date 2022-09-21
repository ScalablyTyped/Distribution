package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBaseheadOwner extends StObject {
  
  var path: BaseheadOwner
  
  var query: `451`
}
object PathBaseheadOwner {
  
  inline def apply(path: BaseheadOwner, query: `451`): PathBaseheadOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBaseheadOwner]
  }
  
  extension [Self <: PathBaseheadOwner](x: Self) {
    
    inline def setPath(value: BaseheadOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `451`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
