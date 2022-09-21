package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationMetadata extends StObject {
  
  /**
    * Output only. The set of available zones in the location. The map is keyed by the lowercase ID of each zone, as defined by GCE. These keys can be specified in the `zones` field when
    * creating a Memcached instance.
    */
  var availableZones: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.LocationMetadata & TopLevel[Any]
  ] = js.undefined
}
object LocationMetadata {
  
  inline def apply(): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationMetadata]
  }
  
  extension [Self <: LocationMetadata](x: Self) {
    
    inline def setAvailableZones(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.LocationMetadata & TopLevel[Any]
    ): Self = StObject.set(x, "availableZones", value.asInstanceOf[js.Any])
    
    inline def setAvailableZonesUndefined: Self = StObject.set(x, "availableZones", js.undefined)
  }
}
