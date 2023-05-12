package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeploymentidOwnerQuery473 extends StObject {
  
  var path: DeploymentidOwner
  
  var query: `473`
}
object PathDeploymentidOwnerQuery473 {
  
  inline def apply(path: DeploymentidOwner, query: `473`): PathDeploymentidOwnerQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeploymentidOwnerQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDeploymentidOwnerQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DeploymentidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
