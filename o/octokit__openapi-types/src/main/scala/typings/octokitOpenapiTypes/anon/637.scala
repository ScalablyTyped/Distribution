package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `637` extends StObject {
  
  /** The unique identifier of the migration. */
  var migration_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['migration-id'] */ js.Any
}
object `637` {
  
  inline def apply(
    migration_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['migration-id'] */ js.Any
  ): `637` = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`637`]
  }
  
  extension [Self <: `637`](x: Self) {
    
    inline def setMigration_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['migration-id'] */ js.Any
    ): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
  }
}
