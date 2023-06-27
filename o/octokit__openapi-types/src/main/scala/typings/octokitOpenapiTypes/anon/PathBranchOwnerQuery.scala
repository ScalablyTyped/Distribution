package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBranchOwnerQuery extends StObject {
  
  var path: BranchOwner
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathBranchOwnerQuery {
  
  inline def apply(path: BranchOwner): PathBranchOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBranchOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBranchOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: BranchOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
