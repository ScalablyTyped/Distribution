package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalDevice extends StObject {
  
  /** Output only. Current configuration of the device as registered to the SAS. */
  var activeConfig: js.UndefOr[SasPortalDeviceConfig] = js.undefined
  
  /** Device parameters that can be overridden by both SAS Portal and SAS registration requests. */
  var deviceMetadata: js.UndefOr[js.Any] = js.undefined
  
  /** Device display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The FCC identifier of the device. */
  var fccId: js.UndefOr[String] = js.undefined
  
  /** Output only. Grants held by the device. */
  var grants: js.UndefOr[js.Array[SasPortalDeviceGrant]] = js.undefined
  
  /** Output only. The resource path name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Configuration of the device, as specified via SAS Portal API. */
  var preloadedConfig: js.UndefOr[SasPortalDeviceConfig] = js.undefined
  
  /** A serial number assigned to the device by the device manufacturer. */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /** Output only. Device state. */
  var state: js.UndefOr[String] = js.undefined
}
object SasPortalDevice {
  
  inline def apply(): SasPortalDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDevice]
  }
  
  extension [Self <: SasPortalDevice](x: Self) {
    
    inline def setActiveConfig(value: SasPortalDeviceConfig): Self = StObject.set(x, "activeConfig", value.asInstanceOf[js.Any])
    
    inline def setActiveConfigUndefined: Self = StObject.set(x, "activeConfig", js.undefined)
    
    inline def setDeviceMetadata(value: js.Any): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFccId(value: String): Self = StObject.set(x, "fccId", value.asInstanceOf[js.Any])
    
    inline def setFccIdUndefined: Self = StObject.set(x, "fccId", js.undefined)
    
    inline def setGrants(value: js.Array[SasPortalDeviceGrant]): Self = StObject.set(x, "grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "grants", js.undefined)
    
    inline def setGrantsVarargs(value: SasPortalDeviceGrant*): Self = StObject.set(x, "grants", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreloadedConfig(value: SasPortalDeviceConfig): Self = StObject.set(x, "preloadedConfig", value.asInstanceOf[js.Any])
    
    inline def setPreloadedConfigUndefined: Self = StObject.set(x, "preloadedConfig", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
