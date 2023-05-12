package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerPath extends StObject {
  
  var path: OwnerPath
  
  var query: `205`
}
object PathOwnerPath {
  
  inline def apply(path: OwnerPath, query: `205`): PathOwnerPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerPath] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `205`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
