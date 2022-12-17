package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeploymentidOwnerQuery407 extends StObject {
  
  var path: DeploymentidOwner
  
  var query: `407`
}
object PathDeploymentidOwnerQuery407 {
  
  inline def apply(path: DeploymentidOwner, query: `407`): PathDeploymentidOwnerQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeploymentidOwnerQuery407]
  }
  
  extension [Self <: PathDeploymentidOwnerQuery407](x: Self) {
    
    inline def setPath(value: DeploymentidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
