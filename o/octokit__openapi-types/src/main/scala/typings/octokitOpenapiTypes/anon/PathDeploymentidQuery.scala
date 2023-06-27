package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDeploymentidQuery extends StObject {
  
  var path: Deploymentid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathDeploymentidQuery {
  
  inline def apply(path: Deploymentid): PathDeploymentidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDeploymentidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDeploymentidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Deploymentid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
