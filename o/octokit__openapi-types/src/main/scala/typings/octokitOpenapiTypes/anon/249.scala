package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `249` extends StObject {
  
  var allowed_actions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
  ] = js.undefined
  
  var enabled_organizations: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['enabled-organizations'] */ js.Any
}
object `249` {
  
  inline def apply(
    enabled_organizations: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['enabled-organizations'] */ js.Any
  ): `249` = {
    val __obj = js.Dynamic.literal(enabled_organizations = enabled_organizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[`249`]
  }
  
  extension [Self <: `249`](x: Self) {
    
    inline def setAllowed_actions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
    ): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled_organizations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['enabled-organizations'] */ js.Any
    ): Self = StObject.set(x, "enabled_organizations", value.asInstanceOf[js.Any])
  }
}
