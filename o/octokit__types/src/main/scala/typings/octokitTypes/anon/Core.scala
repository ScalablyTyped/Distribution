package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Core extends StObject {
  
  var core: Limit
  
  var graphql: Limit
  
  var integration_manifest: Limit
  
  var search: Limit
}
object Core {
  
  inline def apply(core: Limit, graphql: Limit, integration_manifest: Limit, search: Limit): Core = {
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], graphql = graphql.asInstanceOf[js.Any], integration_manifest = integration_manifest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
  
  extension [Self <: Core](x: Self) {
    
    inline def setCore(value: Limit): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
    
    inline def setGraphql(value: Limit): Self = StObject.set(x, "graphql", value.asInstanceOf[js.Any])
    
    inline def setIntegration_manifest(value: Limit): Self = StObject.set(x, "integration_manifest", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Limit): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
