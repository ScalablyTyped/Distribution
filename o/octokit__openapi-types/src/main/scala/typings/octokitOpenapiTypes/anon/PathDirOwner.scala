package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDirOwner extends StObject {
  
  var path: DirOwner
  
  var query: `197`
}
object PathDirOwner {
  
  inline def apply(path: DirOwner, query: `197`): PathDirOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDirOwner]
  }
  
  extension [Self <: PathDirOwner](x: Self) {
    
    inline def setPath(value: DirOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `197`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
