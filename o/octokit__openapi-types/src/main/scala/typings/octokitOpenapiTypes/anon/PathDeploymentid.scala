package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeploymentid extends StObject {
  
  var path: Deploymentid
}
object PathDeploymentid {
  
  inline def apply(path: Deploymentid): PathDeploymentid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeploymentid]
  }
  
  extension [Self <: PathDeploymentid](x: Self) {
    
    inline def setPath(value: Deploymentid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
