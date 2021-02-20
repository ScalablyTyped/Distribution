package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends StObject {
  
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
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.Device with TopLevel[js.Any]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setCustomData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.Device with TopLevel[js.Any]
    ): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    @scala.inline
    def setDeviceInfo(value: DeviceInfo): Self = StObject.set(x, "deviceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceInfoUndefined: Self = StObject.set(x, "deviceInfo", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: DeviceNames): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotificationSupportedByAgent(value: Boolean): Self = StObject.set(x, "notificationSupportedByAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSupportedByAgentUndefined: Self = StObject.set(x, "notificationSupportedByAgent", js.undefined)
    
    @scala.inline
    def setOtherDeviceIds(value: js.Array[AgentOtherDeviceId]): Self = StObject.set(x, "otherDeviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherDeviceIdsUndefined: Self = StObject.set(x, "otherDeviceIds", js.undefined)
    
    @scala.inline
    def setOtherDeviceIdsVarargs(value: AgentOtherDeviceId*): Self = StObject.set(x, "otherDeviceIds", js.Array(value :_*))
    
    @scala.inline
    def setRoomHint(value: String): Self = StObject.set(x, "roomHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomHintUndefined: Self = StObject.set(x, "roomHint", js.undefined)
    
    @scala.inline
    def setStructureHint(value: String): Self = StObject.set(x, "structureHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureHintUndefined: Self = StObject.set(x, "structureHint", js.undefined)
    
    @scala.inline
    def setTraits(value: js.Array[String]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: String*): Self = StObject.set(x, "traits", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWillReportState(value: Boolean): Self = StObject.set(x, "willReportState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillReportStateUndefined: Self = StObject.set(x, "willReportState", js.undefined)
  }
}
