package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends js.Object {
  
  /** Attributes for the traits supported by the device. */
  var attributes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.Device with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Custom device attributes stored in Home Graph and provided to your smart home Action in each [QUERY](https://developers.google.com/assistant/smarthome/reference/intent/query) and
    * [EXECUTE](https://developers.google.com/assistant/smarthome/reference/intent/execute) intent.
    */
  var customData: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.Device with TopLevel[js.Any]
  ] = js.native
  
  /** Device manufacturer, model, hardware version, and software version. */
  var deviceInfo: js.UndefOr[DeviceInfo] = js.native
  
  /** Third-party device ID. */
  var id: js.UndefOr[String] = js.native
  
  /** Names given to this device by your smart home Action. */
  var name: js.UndefOr[DeviceNames] = js.native
  
  /**
    * Indicates whether your smart home Action will report notifications to Google for this device via ReportStateAndNotification. If your smart home Action enables users to control
    * device notifications, you should update this field and call RequestSyncDevices.
    */
  var notificationSupportedByAgent: js.UndefOr[Boolean] = js.native
  
  /**
    * Alternate IDs associated with this device. This is used to identify cloud synced devices enabled for [local
    * fulfillment](https://developers.google.com/assistant/smarthome/concepts/local).
    */
  var otherDeviceIds: js.UndefOr[js.Array[AgentOtherDeviceId]] = js.native
  
  /** Suggested name for the room where this device is installed. Google attempts to use this value during user setup. */
  var roomHint: js.UndefOr[String] = js.native
  
  /** Suggested name for the structure where this device is installed. Google attempts to use this value during user setup. */
  var structureHint: js.UndefOr[String] = js.native
  
  /** Traits supported by the device. See [device traits](https://developers.google.com/assistant/smarthome/traits). */
  var traits: js.UndefOr[js.Array[String]] = js.native
  
  /** Hardware type of the device. See [device types](https://developers.google.com/assistant/smarthome/guides). */
  var `type`: js.UndefOr[String] = js.native
  
  /** Indicates whether your smart home Action will report state of this device to Google via ReportStateAndNotification. */
  var willReportState: js.UndefOr[Boolean] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.Device with TopLevel[js.Any]
    ): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setCustomData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.Device with TopLevel[js.Any]
    ): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    
    @scala.inline
    def setDeviceInfo(value: DeviceInfo): Self = this.set("deviceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceInfo: Self = this.set("deviceInfo", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: DeviceNames): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationSupportedByAgent(value: Boolean): Self = this.set("notificationSupportedByAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationSupportedByAgent: Self = this.set("notificationSupportedByAgent", js.undefined)
    
    @scala.inline
    def setOtherDeviceIdsVarargs(value: AgentOtherDeviceId*): Self = this.set("otherDeviceIds", js.Array(value :_*))
    
    @scala.inline
    def setOtherDeviceIds(value: js.Array[AgentOtherDeviceId]): Self = this.set("otherDeviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherDeviceIds: Self = this.set("otherDeviceIds", js.undefined)
    
    @scala.inline
    def setRoomHint(value: String): Self = this.set("roomHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomHint: Self = this.set("roomHint", js.undefined)
    
    @scala.inline
    def setStructureHint(value: String): Self = this.set("structureHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructureHint: Self = this.set("structureHint", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: String*): Self = this.set("traits", js.Array(value :_*))
    
    @scala.inline
    def setTraits(value: js.Array[String]): Self = this.set("traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraits: Self = this.set("traits", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWillReportState(value: Boolean): Self = this.set("willReportState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWillReportState: Self = this.set("willReportState", js.undefined)
  }
}
