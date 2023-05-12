package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Singlefile extends StObject {
  
  /**
    * Format: date-time
    * @description The time this token expires
    * @example 2016-07-11T22:14:10Z
    */
  var expires_at: String
  
  /**
    * @example {
    *   "issues": "read",
    *   "deployments": "write"
    * }
    */
  var permissions: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
  
  /** @description The repositories this token has access to */
  var repositories: js.UndefOr[js.Array[Allowupdatebranch]] = js.undefined
  
  /**
    * @description Describe whether all repositories have been selected or there's a selection involved
    * @enum {string}
    */
  var repository_selection: js.UndefOr[all | selected] = js.undefined
  
  /** @example config.yaml */
  var single_file: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description The token used for authentication
    * @example v1.1f699f1069f60xxx
    */
  var token: String
}
object Singlefile {
  
  inline def apply(expires_at: String, token: String): Singlefile = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Singlefile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Singlefile] (val x: Self) extends AnyVal {
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Record[String, scala.Nothing]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setRepositories(value: js.Array[Allowupdatebranch]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: Allowupdatebranch*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository_selection(value: all | selected): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setRepository_selectionUndefined: Self = StObject.set(x, "repository_selection", js.undefined)
    
    inline def setSingle_file(value: String): Self = StObject.set(x, "single_file", value.asInstanceOf[js.Any])
    
    inline def setSingle_fileNull: Self = StObject.set(x, "single_file", null)
    
    inline def setSingle_fileUndefined: Self = StObject.set(x, "single_file", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
