package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.wyandotte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsGetStatusForAuthenticatedUserEndpoint
  extends StObject
     with RequiredPreview[wyandotte] {
  
  var migration_id: Double
}
object MigrationsGetStatusForAuthenticatedUserEndpoint {
  
  inline def apply(mediaType: `0`[wyandotte], migration_id: Double): MigrationsGetStatusForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetStatusForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: MigrationsGetStatusForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
  }
}
