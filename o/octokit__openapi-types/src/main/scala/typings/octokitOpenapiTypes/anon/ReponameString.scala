package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReponameString extends StObject {
  
  /** The unique identifier of the migration. */
  var migration_id: Double
  
  /** repo_name parameter */
  var repo_name: String
}
object ReponameString {
  
  inline def apply(migration_id: Double, repo_name: String): ReponameString = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReponameString]
  }
  
  extension [Self <: ReponameString](x: Self) {
    
    inline def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
    
    inline def setRepo_name(value: String): Self = StObject.set(x, "repo_name", value.asInstanceOf[js.Any])
  }
}
