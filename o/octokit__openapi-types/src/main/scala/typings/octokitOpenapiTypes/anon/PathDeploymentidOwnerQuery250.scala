package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeploymentidOwnerQuery250 extends StObject {
  
  var path: DeploymentidOwner
  
  var query: `250`
}
object PathDeploymentidOwnerQuery250 {
  
  inline def apply(path: DeploymentidOwner, query: `250`): PathDeploymentidOwnerQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeploymentidOwnerQuery250]
  }
  
  extension [Self <: PathDeploymentidOwnerQuery250](x: Self) {
    
    inline def setPath(value: DeploymentidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
