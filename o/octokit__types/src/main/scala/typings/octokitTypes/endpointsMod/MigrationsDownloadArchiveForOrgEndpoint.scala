package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  org :string,   migration_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'wyandotte'> */
@js.native
trait MigrationsDownloadArchiveForOrgEndpoint extends StObject {
  
  var mediaType: `6` = js.native
  
  var migration_id: Double = js.native
  
  @JSName("org")
  var org_ : String = js.native
}
object MigrationsDownloadArchiveForOrgEndpoint {
  
  @scala.inline
  def apply(mediaType: `6`, migration_id: Double, org_ : String): MigrationsDownloadArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsDownloadArchiveForOrgEndpoint]
  }
  
  @scala.inline
  implicit class MigrationsDownloadArchiveForOrgEndpointMutableBuilder[Self <: MigrationsDownloadArchiveForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `6`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigration_id(value: Double): Self = StObject.set(x, "migration_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
