package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMilestonenumberOwnerQuery426 extends StObject {
  
  var path: MilestonenumberOwner
  
  var query: `426`
}
object PathMilestonenumberOwnerQuery426 {
  
  inline def apply(path: MilestonenumberOwner, query: `426`): PathMilestonenumberOwnerQuery426 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMilestonenumberOwnerQuery426]
  }
  
  extension [Self <: PathMilestonenumberOwnerQuery426](x: Self) {
    
    inline def setPath(value: MilestonenumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `426`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
