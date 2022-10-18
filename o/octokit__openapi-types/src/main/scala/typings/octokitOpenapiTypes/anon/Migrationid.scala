package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Migrationid extends StObject {
  
  /** The unique identifier of the migration. */
  var migration_id: Double
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
}
object Migrationid {
  
  inline def apply(migration_id: Double, org_ : String): Migrationid = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Migrationid]
  }
  
  extension [Self <: Migrationid](x: Self) {
    
    inline def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
