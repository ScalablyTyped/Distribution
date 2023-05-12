package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contactemail extends StObject {
  
  /**
    * Format: uri
    * @example https://api.github.com/installations/1/access_tokens
    */
  var access_tokens_url: String
  
  var account: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any) | Null
  
  /** @example 1 */
  var app_id: Double
  
  /** @example github-actions */
  var app_slug: String
  
  /** @example "test_13f1e99741e3e004@d7e1eb0bc0a1ba12.com" */
  var contact_email: js.UndefOr[String | Null] = js.undefined
  
  /** Format: date-time */
  var created_at: String
  
  var events: js.Array[String]
  
  /** @example true */
  var has_multiple_single_files: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format: uri
    * @example https://github.com/organizations/github/settings/installations/1
    */
  var html_url: String
  
  /**
    * @description The ID of the installation.
    * @example 1
    */
  var id: Double
  
  var permissions: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['app-permissions'] */ js.Any
  
  /**
    * Format: uri
    * @example https://api.github.com/installation/repositories
    */
  var repositories_url: String
  
  /**
    * @description Describe whether all repositories have been selected or there's a selection involved
    * @enum {string}
    */
  var repository_selection: all | selected
  
  /** @example config.yaml */
  var single_file_name: String | Null
  
  /**
    * @example [
    *   "config.yml",
    *   ".github/issue_TEMPLATE.md"
    * ]
    */
  var single_file_paths: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Format: date-time */
  var suspended_at: String | Null
  
  var suspended_by: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /** @description The ID of the user or organization this token is being scoped to. */
  var target_id: Double
  
  /** @example Organization */
  var target_type: String
  
  /** Format: date-time */
  var updated_at: String
}
object Contactemail {
  
  inline def apply(
    access_tokens_url: String,
    app_id: Double,
    app_slug: String,
    created_at: String,
    events: js.Array[String],
    html_url: String,
    id: Double,
    permissions: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['app-permissions'] */ js.Any,
    repositories_url: String,
    repository_selection: all | selected,
    suspended_by: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    target_id: Double,
    target_type: String,
    updated_at: String
  ): Contactemail = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url.asInstanceOf[js.Any], app_id = app_id.asInstanceOf[js.Any], app_slug = app_slug.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], suspended_by = suspended_by.asInstanceOf[js.Any], target_id = target_id.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], account = null, single_file_name = null, suspended_at = null)
    __obj.asInstanceOf[Contactemail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contactemail] (val x: Self) extends AnyVal {
    
    inline def setAccess_tokens_url(value: String): Self = StObject.set(x, "access_tokens_url", value.asInstanceOf[js.Any])
    
    inline def setAccount(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_slug(value: String): Self = StObject.set(x, "app_slug", value.asInstanceOf[js.Any])
    
    inline def setContact_email(value: String): Self = StObject.set(x, "contact_email", value.asInstanceOf[js.Any])
    
    inline def setContact_emailNull: Self = StObject.set(x, "contact_email", null)
    
    inline def setContact_emailUndefined: Self = StObject.set(x, "contact_email", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setHas_multiple_single_files(value: Boolean): Self = StObject.set(x, "has_multiple_single_files", value.asInstanceOf[js.Any])
    
    inline def setHas_multiple_single_filesUndefined: Self = StObject.set(x, "has_multiple_single_files", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPermissions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['app-permissions'] */ js.Any
    ): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    inline def setRepository_selection(value: all | selected): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setSingle_file_name(value: String): Self = StObject.set(x, "single_file_name", value.asInstanceOf[js.Any])
    
    inline def setSingle_file_nameNull: Self = StObject.set(x, "single_file_name", null)
    
    inline def setSingle_file_paths(value: js.Array[String]): Self = StObject.set(x, "single_file_paths", value.asInstanceOf[js.Any])
    
    inline def setSingle_file_pathsUndefined: Self = StObject.set(x, "single_file_paths", js.undefined)
    
    inline def setSingle_file_pathsVarargs(value: String*): Self = StObject.set(x, "single_file_paths", js.Array(value*))
    
    inline def setSuspended_at(value: String): Self = StObject.set(x, "suspended_at", value.asInstanceOf[js.Any])
    
    inline def setSuspended_atNull: Self = StObject.set(x, "suspended_at", null)
    
    inline def setSuspended_by(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "suspended_by", value.asInstanceOf[js.Any])
    
    inline def setTarget_id(value: Double): Self = StObject.set(x, "target_id", value.asInstanceOf[js.Any])
    
    inline def setTarget_type(value: String): Self = StObject.set(x, "target_type", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
