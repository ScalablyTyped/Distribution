package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttemptnumberOwner extends StObject {
  
  var path: AttemptnumberOwner
  
  var query: `494`
}
object PathAttemptnumberOwner {
  
  inline def apply(path: AttemptnumberOwner, query: `494`): PathAttemptnumberOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttemptnumberOwner]
  }
  
  extension [Self <: PathAttemptnumberOwner](x: Self) {
    
    inline def setPath(value: AttemptnumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `494`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
