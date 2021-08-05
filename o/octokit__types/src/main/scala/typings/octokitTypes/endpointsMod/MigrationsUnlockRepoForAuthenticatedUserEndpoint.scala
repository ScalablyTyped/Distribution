package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.wyandotte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsUnlockRepoForAuthenticatedUserEndpoint
  extends StObject
     with RequiredPreview[wyandotte] {
  
  var migration_id: Double
  
  var repo_name: String
}
object MigrationsUnlockRepoForAuthenticatedUserEndpoint {
  
  inline def apply(mediaType: `0`[wyandotte], migration_id: Double, repo_name: String): MigrationsUnlockRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUnlockRepoForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: MigrationsUnlockRepoForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
    
    inline def setRepo_name(value: String): Self = StObject.set(x, "repo_name", value.asInstanceOf[js.Any])
  }
}
