package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeleconferenceDeviceQuality extends js.Object {
  
  /**
    * A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in
    * P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
    */
  var callChainId: js.UndefOr[String] = js.native
  
  // A geo-region where the service is deployed, such as ProdNoam.
  var cloudServiceDeploymentEnvironment: js.UndefOr[NullableOption[String]] = js.native
  
  // A unique deployment identifier assigned by Azure.
  var cloudServiceDeploymentId: js.UndefOr[NullableOption[String]] = js.native
  
  // The Azure deployed cloud service instance name, such as FrontEnd_IN_3.
  var cloudServiceInstanceName: js.UndefOr[NullableOption[String]] = js.native
  
  // The Azure deployed cloud service name, such as contoso.cloudapp.net.
  var cloudServiceName: js.UndefOr[NullableOption[String]] = js.native
  
  // Any additional description, such as VTC Bldg 30/21.
  var deviceDescription: js.UndefOr[String] = js.native
  
  // The user media agent name, such as Cisco SX80.
  var deviceName: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for a specific media leg of a participant in a conference. One participant can have multiple media
    * leg identifiers if retargeting happens. CVI partner assigns this value.
    */
  var mediaLegId: js.UndefOr[String] = js.native
  
  /**
    * The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing
    * quality.
    */
  var mediaQualityList: js.UndefOr[js.Array[TeleconferenceDeviceMediaQuality]] = js.native
  
  /**
    * A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId
    * to this property.
    */
  var participantId: js.UndefOr[String] = js.native
}
object TeleconferenceDeviceQuality {
  
  @scala.inline
  def apply(): TeleconferenceDeviceQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeleconferenceDeviceQuality]
  }
  
  @scala.inline
  implicit class TeleconferenceDeviceQualityOps[Self <: TeleconferenceDeviceQuality] (val x: Self) extends AnyVal {
    
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
    def setCallChainId(value: String): Self = this.set("callChainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallChainId: Self = this.set("callChainId", js.undefined)
    
    @scala.inline
    def setCloudServiceDeploymentEnvironment(value: NullableOption[String]): Self = this.set("cloudServiceDeploymentEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudServiceDeploymentEnvironment: Self = this.set("cloudServiceDeploymentEnvironment", js.undefined)
    
    @scala.inline
    def setCloudServiceDeploymentEnvironmentNull: Self = this.set("cloudServiceDeploymentEnvironment", null)
    
    @scala.inline
    def setCloudServiceDeploymentId(value: NullableOption[String]): Self = this.set("cloudServiceDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudServiceDeploymentId: Self = this.set("cloudServiceDeploymentId", js.undefined)
    
    @scala.inline
    def setCloudServiceDeploymentIdNull: Self = this.set("cloudServiceDeploymentId", null)
    
    @scala.inline
    def setCloudServiceInstanceName(value: NullableOption[String]): Self = this.set("cloudServiceInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudServiceInstanceName: Self = this.set("cloudServiceInstanceName", js.undefined)
    
    @scala.inline
    def setCloudServiceInstanceNameNull: Self = this.set("cloudServiceInstanceName", null)
    
    @scala.inline
    def setCloudServiceName(value: NullableOption[String]): Self = this.set("cloudServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudServiceName: Self = this.set("cloudServiceName", js.undefined)
    
    @scala.inline
    def setCloudServiceNameNull: Self = this.set("cloudServiceName", null)
    
    @scala.inline
    def setDeviceDescription(value: String): Self = this.set("deviceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceDescription: Self = this.set("deviceDescription", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setMediaLegId(value: String): Self = this.set("mediaLegId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaLegId: Self = this.set("mediaLegId", js.undefined)
    
    @scala.inline
    def setMediaQualityListVarargs(value: TeleconferenceDeviceMediaQuality*): Self = this.set("mediaQualityList", js.Array(value :_*))
    
    @scala.inline
    def setMediaQualityList(value: js.Array[TeleconferenceDeviceMediaQuality]): Self = this.set("mediaQualityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaQualityList: Self = this.set("mediaQualityList", js.undefined)
    
    @scala.inline
    def setParticipantId(value: String): Self = this.set("participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipantId: Self = this.set("participantId", js.undefined)
  }
}
