package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDevice extends js.Object {
  
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
  implicit class SasPortalDeviceOps[Self <: SasPortalDevice] (val x: Self) extends AnyVal {
    
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
    def setActiveConfig(value: SasPortalDeviceConfig): Self = this.set("activeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveConfig: Self = this.set("activeConfig", js.undefined)
    
    @scala.inline
    def setDeviceMetadata(value: js.Any): Self = this.set("deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMetadata: Self = this.set("deviceMetadata", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFccId(value: String): Self = this.set("fccId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFccId: Self = this.set("fccId", js.undefined)
    
    @scala.inline
    def setGrantsVarargs(value: SasPortalDeviceGrant*): Self = this.set("grants", js.Array(value :_*))
    
    @scala.inline
    def setGrants(value: js.Array[SasPortalDeviceGrant]): Self = this.set("grants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrants: Self = this.set("grants", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPreloadedConfig(value: SasPortalDeviceConfig): Self = this.set("preloadedConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadedConfig: Self = this.set("preloadedConfig", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
