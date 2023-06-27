package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMilestonenumberOwnerQuery extends StObject {
  
  var path: MilestonenumberOwner
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathMilestonenumberOwnerQuery {
  
  inline def apply(path: MilestonenumberOwner): PathMilestonenumberOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMilestonenumberOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMilestonenumberOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: MilestonenumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
