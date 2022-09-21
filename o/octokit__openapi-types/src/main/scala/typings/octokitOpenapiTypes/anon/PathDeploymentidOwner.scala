package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeploymentidOwner extends StObject {
  
  var path: DeploymentidOwner
}
object PathDeploymentidOwner {
  
  inline def apply(path: DeploymentidOwner): PathDeploymentidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeploymentidOwner]
  }
  
  extension [Self <: PathDeploymentidOwner](x: Self) {
    
    inline def setPath(value: DeploymentidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
