package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hasmultiplesinglefiles extends StObject {
  
  var account: Avatarurl
  
  /** @example true */
  var has_multiple_single_files: js.UndefOr[Boolean] = js.undefined
  
  var permissions: Administration
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat/repos
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
}
object Hasmultiplesinglefiles {
  
  inline def apply(
    account: Avatarurl,
    permissions: Administration,
    repositories_url: String,
    repository_selection: all | selected
  ): Hasmultiplesinglefiles = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], single_file_name = null)
    __obj.asInstanceOf[Hasmultiplesinglefiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hasmultiplesinglefiles] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Avatarurl): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setHas_multiple_single_files(value: Boolean): Self = StObject.set(x, "has_multiple_single_files", value.asInstanceOf[js.Any])
    
    inline def setHas_multiple_single_filesUndefined: Self = StObject.set(x, "has_multiple_single_files", js.undefined)
    
    inline def setPermissions(value: Administration): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    inline def setRepository_selection(value: all | selected): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setSingle_file_name(value: String): Self = StObject.set(x, "single_file_name", value.asInstanceOf[js.Any])
    
    inline def setSingle_file_nameNull: Self = StObject.set(x, "single_file_name", null)
    
    inline def setSingle_file_paths(value: js.Array[String]): Self = StObject.set(x, "single_file_paths", value.asInstanceOf[js.Any])
    
    inline def setSingle_file_pathsUndefined: Self = StObject.set(x, "single_file_paths", js.undefined)
    
    inline def setSingle_file_pathsVarargs(value: String*): Self = StObject.set(x, "single_file_paths", js.Array(value*))
  }
}
