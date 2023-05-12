package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMilestonenumberOwnerQuery473 extends StObject {
  
  var path: MilestonenumberOwner
  
  var query: `473`
}
object PathMilestonenumberOwnerQuery473 {
  
  inline def apply(path: MilestonenumberOwner, query: `473`): PathMilestonenumberOwnerQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMilestonenumberOwnerQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMilestonenumberOwnerQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MilestonenumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
