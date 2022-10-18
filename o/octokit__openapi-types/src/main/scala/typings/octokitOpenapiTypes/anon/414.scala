package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `414` extends StObject {
  
  var allowed_actions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
  ] = js.undefined
  
  var enabled: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-enabled'] */ js.Any
}
object `414` {
  
  inline def apply(
    enabled: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-enabled'] */ js.Any
  ): `414` = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[`414`]
  }
  
  extension [Self <: `414`](x: Self) {
    
    inline def setAllowed_actions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
    ): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-enabled'] */ js.Any
    ): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
