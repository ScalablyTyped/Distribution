package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHeadOwner extends StObject {
  
  var path: HeadOwner
  
  var query: `426`
}
object PathHeadOwner {
  
  inline def apply(path: HeadOwner, query: `426`): PathHeadOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHeadOwner]
  }
  
  extension [Self <: PathHeadOwner](x: Self) {
    
    inline def setPath(value: HeadOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
