package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationidOrg extends StObject {
  
  var migration_id: Double
  
  @JSName("org")
  var org_ : String
}
object MigrationidOrg {
  
  inline def apply(migration_id: Double, org_ : String): MigrationidOrg = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationidOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MigrationidOrg] (val x: Self) extends AnyVal {
    
    inline def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
