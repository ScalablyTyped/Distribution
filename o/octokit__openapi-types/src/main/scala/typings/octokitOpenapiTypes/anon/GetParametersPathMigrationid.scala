package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathMigrationid extends StObject {
  
  /**
    * Get an organization migration status
    * @description Fetches the status of a migration.
    *
    * The `state` of a migration can be one of the following values:
    *
    * *   `pending`, which means the migration hasn't started yet.
    * *   `exporting`, which means the migration is in progress.
    * *   `exported`, which means the migration finished successfully.
    * *   `failed`, which means the migration failed.
    */
  var get: ParametersPathMigrationid
}
object GetParametersPathMigrationid {
  
  inline def apply(get: ParametersPathMigrationid): GetParametersPathMigrationid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathMigrationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathMigrationid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathMigrationid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
