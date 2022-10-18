package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMilestonenumberOwnerQuery250 extends StObject {
  
  var path: MilestonenumberOwner
  
  var query: `250`
}
object PathMilestonenumberOwnerQuery250 {
  
  inline def apply(path: MilestonenumberOwner, query: `250`): PathMilestonenumberOwnerQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMilestonenumberOwnerQuery250]
  }
  
  extension [Self <: PathMilestonenumberOwnerQuery250](x: Self) {
    
    inline def setPath(value: MilestonenumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
