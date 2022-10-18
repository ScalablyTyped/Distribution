package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgReponame extends StObject {
  
  /** Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://docs.github.com/rest/reference/repos#delete-a-repository) when the migration is complete and you no longer need the source data. */
  var delete: ParametersPathOrgReponame
}
object DeleteParametersPathOrgReponame {
  
  inline def apply(delete: ParametersPathOrgReponame): DeleteParametersPathOrgReponame = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgReponame]
  }
  
  extension [Self <: DeleteParametersPathOrgReponame](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgReponame): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
