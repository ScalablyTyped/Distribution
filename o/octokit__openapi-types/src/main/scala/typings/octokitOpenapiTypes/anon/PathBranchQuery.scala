package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBranchQuery extends StObject {
  
  var path: Branch
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathBranchQuery {
  
  inline def apply(path: Branch): PathBranchQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBranchQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBranchQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Branch): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
