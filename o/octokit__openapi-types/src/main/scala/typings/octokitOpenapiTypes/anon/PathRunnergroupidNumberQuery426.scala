package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunnergroupidNumberQuery426 extends StObject {
  
  var path: RunnergroupidNumber
  
  var query: `426`
}
object PathRunnergroupidNumberQuery426 {
  
  inline def apply(path: RunnergroupidNumber, query: `426`): PathRunnergroupidNumberQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunnergroupidNumberQuery426]
  }
  
  extension [Self <: PathRunnergroupidNumberQuery426](x: Self) {
    
    inline def setPath(value: RunnergroupidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
