package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Singlefilepaths extends StObject {
  
  var expires_at: String
  
  /** @example true */
  var has_multiple_single_files: js.UndefOr[Boolean] = js.undefined
  
  var permissions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['app-permissions'] */ js.Any
  ] = js.undefined
  
  var repositories: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any
    ]
  ] = js.undefined
  
  /** @enum {string} */
  var repository_selection: js.UndefOr[all | selected] = js.undefined
  
  /** @example README.md */
  var single_file: js.UndefOr[String] = js.undefined
  
  /**
    * @example [
    *   "config.yml",
    *   ".github/issue_TEMPLATE.md"
    * ]
    */
  var single_file_paths: js.UndefOr[js.Array[String]] = js.undefined
  
  var token: String
}
object Singlefilepaths {
  
  inline def apply(expires_at: String, token: String): Singlefilepaths = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Singlefilepaths]
  }
  
  extension [Self <: Singlefilepaths](x: Self) {
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setHas_multiple_single_files(value: Boolean): Self = StObject.set(x, "has_multiple_single_files", value.asInstanceOf[js.Any])
    
    inline def setHas_multiple_single_filesUndefined: Self = StObject.set(x, "has_multiple_single_files", js.undefined)
    
    inline def setPermissions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['app-permissions'] */ js.Any
    ): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setRepositories(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any
        ]
    ): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any)*
    ): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository_selection(value: all | selected): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setRepository_selectionUndefined: Self = StObject.set(x, "repository_selection", js.undefined)
    
    inline def setSingle_file(value: String): Self = StObject.set(x, "single_file", value.asInstanceOf[js.Any])
    
    inline def setSingle_fileUndefined: Self = StObject.set(x, "single_file", js.undefined)
    
    inline def setSingle_file_paths(value: js.Array[String]): Self = StObject.set(x, "single_file_paths", value.asInstanceOf[js.Any])
    
    inline def setSingle_file_pathsUndefined: Self = StObject.set(x, "single_file_paths", js.undefined)
    
    inline def setSingle_file_pathsVarargs(value: String*): Self = StObject.set(x, "single_file_paths", js.Array(value*))
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
