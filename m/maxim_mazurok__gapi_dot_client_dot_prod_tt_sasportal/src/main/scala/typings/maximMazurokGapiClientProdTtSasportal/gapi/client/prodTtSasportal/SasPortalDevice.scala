package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalDevice extends StObject {
  
  /** Output only. Current configuration of the device as registered to the SAS. */
  var activeConfig: js.UndefOr[SasPortalDeviceConfig] = js.undefined
  
  /** Output only. Current channels with scores. */
  var currentChannels: js.UndefOr[js.Array[SasPortalChannelWithScore]] = js.undefined
  
  /** Device parameters that can be overridden by both SAS Portal and SAS registration requests. */
  var deviceMetadata: js.UndefOr[SasPortalDeviceMetadata] = js.undefined
  
  /** Device display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The FCC identifier of the device. */
  var fccId: js.UndefOr[String] = js.undefined
  
  /** Only ranges within the allowlists are available for new grants. */
  var grantRangeAllowlists: js.UndefOr[js.Array[SasPortalFrequencyRange]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SasPortalDevice] (val x: Self) extends AnyVal {
    
    inline def setActiveConfig(value: SasPortalDeviceConfig): Self = StObject.set(x, "activeConfig", value.asInstanceOf[js.Any])
    
    inline def setActiveConfigUndefined: Self = StObject.set(x, "activeConfig", js.undefined)
    
    inline def setCurrentChannels(value: js.Array[SasPortalChannelWithScore]): Self = StObject.set(x, "currentChannels", value.asInstanceOf[js.Any])
    
    inline def setCurrentChannelsUndefined: Self = StObject.set(x, "currentChannels", js.undefined)
    
    inline def setCurrentChannelsVarargs(value: SasPortalChannelWithScore*): Self = StObject.set(x, "currentChannels", js.Array(value*))
    
    inline def setDeviceMetadata(value: SasPortalDeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFccId(value: String): Self = StObject.set(x, "fccId", value.asInstanceOf[js.Any])
    
    inline def setFccIdUndefined: Self = StObject.set(x, "fccId", js.undefined)
    
    inline def setGrantRangeAllowlists(value: js.Array[SasPortalFrequencyRange]): Self = StObject.set(x, "grantRangeAllowlists", value.asInstanceOf[js.Any])
    
    inline def setGrantRangeAllowlistsUndefined: Self = StObject.set(x, "grantRangeAllowlists", js.undefined)
    
    inline def setGrantRangeAllowlistsVarargs(value: SasPortalFrequencyRange*): Self = StObject.set(x, "grantRangeAllowlists", js.Array(value*))
    
    inline def setGrants(value: js.Array[SasPortalDeviceGrant]): Self = StObject.set(x, "grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "grants", js.undefined)
    
    inline def setGrantsVarargs(value: SasPortalDeviceGrant*): Self = StObject.set(x, "grants", js.Array(value*))
    
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
