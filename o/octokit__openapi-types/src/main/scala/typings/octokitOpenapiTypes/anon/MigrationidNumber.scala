package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationidNumber extends StObject {
  
  /** The unique identifier of the migration. */
  var migration_id: Double
}
object MigrationidNumber {
  
  inline def apply(migration_id: Double): MigrationidNumber = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MigrationidNumber] (val x: Self) extends AnyVal {
    
    inline def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
  }
}
