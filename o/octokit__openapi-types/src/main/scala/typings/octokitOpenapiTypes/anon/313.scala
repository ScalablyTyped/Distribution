package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `313` extends StObject {
  
  var allowed_actions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
  ] = js.undefined
  
  var enabled_repositories: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['enabled-repositories'] */ js.Any
}
object `313` {
  
  inline def apply(
    enabled_repositories: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['enabled-repositories'] */ js.Any
  ): `313` = {
    val __obj = js.Dynamic.literal(enabled_repositories = enabled_repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[`313`]
  }
  
  extension [Self <: `313`](x: Self) {
    
    inline def setAllowed_actions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
    ): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled_repositories(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['enabled-repositories'] */ js.Any
    ): Self = StObject.set(x, "enabled_repositories", value.asInstanceOf[js.Any])
  }
}
