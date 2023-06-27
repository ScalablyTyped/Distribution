package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeploymentidOwnerQuery extends StObject {
  
  var path: DeploymentidOwner
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathDeploymentidOwnerQuery {
  
  inline def apply(path: DeploymentidOwner): PathDeploymentidOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeploymentidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDeploymentidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DeploymentidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
