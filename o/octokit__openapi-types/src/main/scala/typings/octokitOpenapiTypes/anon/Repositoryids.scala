package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repositoryids extends StObject {
  
  var permissions: js.UndefOr[Administration] = js.undefined
  
  /** @description List of repository names that the token should have access to */
  var repositories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @description List of repository IDs that the token should have access to
    * @example [
    *   1
    * ]
    */
  var repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
}
object Repositoryids {
  
  inline def apply(): Repositoryids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Repositoryids] (val x: Self) extends AnyVal {
    
    inline def setPermissions(value: Administration): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setRepositories(value: js.Array[String]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: String*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository_ids(value: js.Array[Double]): Self = StObject.set(x, "repository_ids", value.asInstanceOf[js.Any])
    
    inline def setRepository_idsUndefined: Self = StObject.set(x, "repository_ids", js.undefined)
    
    inline def setRepository_idsVarargs(value: Double*): Self = StObject.set(x, "repository_ids", js.Array(value*))
  }
}
