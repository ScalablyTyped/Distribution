package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledSelectedactionsurl extends StObject {
  
  var allowed_actions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
  ] = js.undefined
  
  var enabled: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-enabled'] */ js.Any
  
  var selected_actions_url: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['selected-actions-url'] */ js.Any
  ] = js.undefined
}
object EnabledSelectedactionsurl {
  
  inline def apply(
    enabled: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-enabled'] */ js.Any
  ): EnabledSelectedactionsurl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledSelectedactionsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnabledSelectedactionsurl] (val x: Self) extends AnyVal {
    
    inline def setAllowed_actions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
    ): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-enabled'] */ js.Any
    ): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setSelected_actions_url(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['selected-actions-url'] */ js.Any
    ): Self = StObject.set(x, "selected_actions_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_actions_urlUndefined: Self = StObject.set(x, "selected_actions_url", js.undefined)
  }
}
