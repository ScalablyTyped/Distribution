package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberDiscussionnumberOrgQuery extends StObject {
  
  var path: CommentnumberDiscussionnumberOrg
  
  var query: js.UndefOr[`627`] = js.undefined
}
object PathCommentnumberDiscussionnumberOrgQuery {
  
  inline def apply(path: CommentnumberDiscussionnumberOrg): PathCommentnumberDiscussionnumberOrgQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberDiscussionnumberOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentnumberDiscussionnumberOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentnumberDiscussionnumberOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `627`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
