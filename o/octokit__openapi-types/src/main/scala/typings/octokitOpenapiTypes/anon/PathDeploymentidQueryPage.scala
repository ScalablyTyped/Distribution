package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeploymentidQueryPage extends StObject {
  
  var path: Deploymentid
  
  var query: Page
}
object PathDeploymentidQueryPage {
  
  inline def apply(path: Deploymentid, query: Page): PathDeploymentidQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeploymentidQueryPage]
  }
  
  extension [Self <: PathDeploymentidQueryPage](x: Self) {
    
    inline def setPath(value: Deploymentid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
