package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.wyandotte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsDownloadArchiveForOrgEndpoint
  extends StObject
     with RequiredPreview[wyandotte] {
  
  var migration_id: Double
  
  @JSName("org")
  var org_ : String
}
object MigrationsDownloadArchiveForOrgEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[wyandotte], migration_id: Double, org_ : String): MigrationsDownloadArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsDownloadArchiveForOrgEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsDownloadArchiveForOrgEndpointMutableBuilder[Self <: MigrationsDownloadArchiveForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
