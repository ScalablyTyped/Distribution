package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.wyandotte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsDeleteArchiveForOrgEndpoint
  extends StObject
     with RequiredPreview[wyandotte] {
  
  var migration_id: Double
  
  @JSName("org")
  var org_ : String
}
object MigrationsDeleteArchiveForOrgEndpoint {
  
  inline def apply(mediaType: `0`[wyandotte], migration_id: Double, org_ : String): MigrationsDeleteArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsDeleteArchiveForOrgEndpoint]
  }
  
  extension [Self <: MigrationsDeleteArchiveForOrgEndpoint](x: Self) {
    
    inline def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
