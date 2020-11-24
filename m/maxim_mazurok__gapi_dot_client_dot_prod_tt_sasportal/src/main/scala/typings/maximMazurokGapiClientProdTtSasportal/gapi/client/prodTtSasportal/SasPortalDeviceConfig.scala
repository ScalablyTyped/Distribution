package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDeviceConfig extends js.Object {
  
  /** Information about this device's air interface. */
  var airInterface: js.UndefOr[SasPortalDeviceAirInterface] = js.native
  
  /** The call sign of the device operator. */
  var callSign: js.UndefOr[String] = js.native
  
  /** FCC category of the device. */
  var category: js.UndefOr[String] = js.native
  
  /** Installation parameters for the device. */
  var installationParams: js.UndefOr[SasPortalInstallationParams] = js.native
  
  /** Output-only. Whether the configuration has been signed by a CPI. */
  var isSigned: js.UndefOr[Boolean] = js.native
  
  /** Measurement reporting capabilities of the device. */
  var measurementCapabilities: js.UndefOr[js.Array[String]] = js.native
  
  /** Information about this device model. */
  var model: js.UndefOr[SasPortalDeviceModel] = js.native
  
  /** State of the configuration. */
  var state: js.UndefOr[String] = js.native
  
  /** Output-only. The last time the device configuration was edited. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** The identifier of a device user. */
  var userId: js.UndefOr[String] = js.native
}
object SasPortalDeviceConfig {
  
  @scala.inline
  def apply(): SasPortalDeviceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceConfig]
  }
  
  @scala.inline
  implicit class SasPortalDeviceConfigOps[Self <: SasPortalDeviceConfig] (val x: Self) extends AnyVal {
    
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
    def setAirInterface(value: SasPortalDeviceAirInterface): Self = this.set("airInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAirInterface: Self = this.set("airInterface", js.undefined)
    
    @scala.inline
    def setCallSign(value: String): Self = this.set("callSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallSign: Self = this.set("callSign", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setInstallationParams(value: SasPortalInstallationParams): Self = this.set("installationParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallationParams: Self = this.set("installationParams", js.undefined)
    
    @scala.inline
    def setIsSigned(value: Boolean): Self = this.set("isSigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSigned: Self = this.set("isSigned", js.undefined)
    
    @scala.inline
    def setMeasurementCapabilitiesVarargs(value: String*): Self = this.set("measurementCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setMeasurementCapabilities(value: js.Array[String]): Self = this.set("measurementCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurementCapabilities: Self = this.set("measurementCapabilities", js.undefined)
    
    @scala.inline
    def setModel(value: SasPortalDeviceModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
