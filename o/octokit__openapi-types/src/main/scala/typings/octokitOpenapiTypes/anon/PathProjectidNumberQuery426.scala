package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidNumberQuery426 extends StObject {
  
  var path: ProjectidNumber
  
  var query: `426`
}
object PathProjectidNumberQuery426 {
  
  inline def apply(path: ProjectidNumber, query: `426`): PathProjectidNumberQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidNumberQuery426]
  }
  
  extension [Self <: PathProjectidNumberQuery426](x: Self) {
    
    inline def setPath(value: ProjectidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
