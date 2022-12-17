package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathMigrationidReponame extends StObject {
  
  /** Unlocks a repository. You can lock repositories when you [start a user migration](https://docs.github.com/rest/reference/migrations#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://docs.github.com/rest/reference/repos#delete-a-repository) if you no longer need the source data. Returns a status of `404 Not Found` if the repository is not locked. */
  var delete: ParametersPathMigrationidReponame
}
object DeleteParametersPathMigrationidReponame {
  
  inline def apply(delete: ParametersPathMigrationidReponame): DeleteParametersPathMigrationidReponame = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathMigrationidReponame]
  }
  
  extension [Self <: DeleteParametersPathMigrationidReponame](x: Self) {
    
    inline def setDelete(value: ParametersPathMigrationidReponame): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
