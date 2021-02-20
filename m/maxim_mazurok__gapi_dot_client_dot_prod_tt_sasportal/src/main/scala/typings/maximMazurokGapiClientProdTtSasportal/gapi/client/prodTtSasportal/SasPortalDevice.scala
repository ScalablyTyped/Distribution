package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDevice extends StObject {
  
  /** Output only. Current configuration of the device as registered to the SAS. */
  var activeConfig: js.UndefOr[SasPortalDeviceConfig] = js.native
  
  /** Device parameters that can be overridden by both SAS Portal and SAS registration requests. */
  var deviceMetadata: js.UndefOr[js.Any] = js.native
  
  /** Device display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The FCC identifier of the device. */
  var fccId: js.UndefOr[String] = js.native
  
  /** Output only. Grants held by the device. */
  var grants: js.UndefOr[js.Array[SasPortalDeviceGrant]] = js.native
  
  /** Output only. The resource path name. */
  var name: js.UndefOr[String] = js.native
  
  /** Configuration of the device, as specified via SAS Portal API. */
  var preloadedConfig: js.UndefOr[SasPortalDeviceConfig] = js.native
  
  /** A serial number assigned to the device by the device manufacturer. */
  var serialNumber: js.UndefOr[String] = js.native
  
  /** Output only. Device state. */
  var state: js.UndefOr[String] = js.native
}
object SasPortalDevice {
  
  @scala.inline
  def apply(): SasPortalDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDevice]
  }
  
  @scala.inline
  implicit class SasPortalDeviceMutableBuilder[Self <: SasPortalDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveConfig(value: SasPortalDeviceConfig): Self = StObject.set(x, "activeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveConfigUndefined: Self = StObject.set(x, "activeConfig", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: js.Any): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFccId(value: String): Self = StObject.set(x, "fccId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFccIdUndefined: Self = StObject.set(x, "fccId", js.undefined)
    
    @scala.inline
    def setGrants(value: js.Array[SasPortalDeviceGrant]): Self = StObject.set(x, "grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantsUndefined: Self = StObject.set(x, "grants", js.undefined)
    
    @scala.inline
    def setGrantsVarargs(value: SasPortalDeviceGrant*): Self = StObject.set(x, "grants", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPreloadedConfig(value: SasPortalDeviceConfig): Self = StObject.set(x, "preloadedConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadedConfigUndefined: Self = StObject.set(x, "preloadedConfig", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
