package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMemcacheV1beta2LocationMetadata extends js.Object {
  
  /**
    * Output only. The set of available zones in the location. The map is keyed by the lowercase ID of each zone, as defined by GCE. These keys can be specified in the `zones` field when
    * creating a Memcached instance.
    */
  var availableZones: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudMemcacheV1beta2LocationMetadata with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudMemcacheV1beta2LocationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudMemcacheV1beta2LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMemcacheV1beta2LocationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudMemcacheV1beta2LocationMetadataOps[Self <: GoogleCloudMemcacheV1beta2LocationMetadata] (val x: Self) extends AnyVal {
    
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
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudMemcacheV1beta2LocationMetadata with TopLevel[js.Any]
    ): Self = this.set("availableZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableZones: Self = this.set("availableZones", js.undefined)
  }
}
