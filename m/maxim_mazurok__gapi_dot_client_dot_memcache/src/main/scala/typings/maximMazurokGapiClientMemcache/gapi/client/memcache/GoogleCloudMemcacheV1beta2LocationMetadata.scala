package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMemcacheV1beta2LocationMetadata extends StObject {
  
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
  implicit class GoogleCloudMemcacheV1beta2LocationMetadataMutableBuilder[Self <: GoogleCloudMemcacheV1beta2LocationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableZones(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.GoogleCloudMemcacheV1beta2LocationMetadata with TopLevel[js.Any]
    ): Self = StObject.set(x, "availableZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableZonesUndefined: Self = StObject.set(x, "availableZones", js.undefined)
  }
}
