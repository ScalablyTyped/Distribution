package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedactionsEnabledrepositories extends StObject {
  
  var allowed_actions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
  ] = js.undefined
  
  var enabled_repositories: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['enabled-repositories'] */ js.Any
  
  var selected_actions_url: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['selected-actions-url'] */ js.Any
  ] = js.undefined
  
  /** @description The API URL to use to get or set the selected repositories that are allowed to run GitHub Actions, when `enabled_repositories` is set to `selected`. */
  var selected_repositories_url: js.UndefOr[String] = js.undefined
}
object AllowedactionsEnabledrepositories {
  
  inline def apply(
    enabled_repositories: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['enabled-repositories'] */ js.Any
  ): AllowedactionsEnabledrepositories = {
    val __obj = js.Dynamic.literal(enabled_repositories = enabled_repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedactionsEnabledrepositories]
  }
  
  extension [Self <: AllowedactionsEnabledrepositories](x: Self) {
    
    inline def setAllowed_actions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['allowed-actions'] */ js.Any
    ): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled_repositories(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['enabled-repositories'] */ js.Any
    ): Self = StObject.set(x, "enabled_repositories", value.asInstanceOf[js.Any])
    
    inline def setSelected_actions_url(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['selected-actions-url'] */ js.Any
    ): Self = StObject.set(x, "selected_actions_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_actions_urlUndefined: Self = StObject.set(x, "selected_actions_url", js.undefined)
    
    inline def setSelected_repositories_url(value: String): Self = StObject.set(x, "selected_repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_repositories_urlUndefined: Self = StObject.set(x, "selected_repositories_url", js.undefined)
  }
}
