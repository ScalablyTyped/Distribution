package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRedisV1LocationMetadata extends js.Object {
  
  /**
    * Output only. The set of available zones in the location. The map is keyed by the lowercase ID of each zone, as defined by GCE. These keys can be specified in `location_id` or
    * `alternative_location_id` fields when creating a Redis instance.
    */
  var availableZones: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRedis.maximMazurokGapiClientRedisStrings.GoogleCloudRedisV1LocationMetadata with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudRedisV1LocationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudRedisV1LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRedisV1LocationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudRedisV1LocationMetadataOps[Self <: GoogleCloudRedisV1LocationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailableZones(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRedis.maximMazurokGapiClientRedisStrings.GoogleCloudRedisV1LocationMetadata with TopLevel[js.Any]
    ): Self = this.set("availableZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableZones: Self = this.set("availableZones", js.undefined)
  }
}
