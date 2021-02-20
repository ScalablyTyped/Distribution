package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeleconferenceDeviceQuality extends StObject {
  
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
  implicit class TeleconferenceDeviceQualityMutableBuilder[Self <: TeleconferenceDeviceQuality] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallChainId(value: String): Self = StObject.set(x, "callChainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallChainIdUndefined: Self = StObject.set(x, "callChainId", js.undefined)
    
    @scala.inline
    def setCloudServiceDeploymentEnvironment(value: NullableOption[String]): Self = StObject.set(x, "cloudServiceDeploymentEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudServiceDeploymentEnvironmentNull: Self = StObject.set(x, "cloudServiceDeploymentEnvironment", null)
    
    @scala.inline
    def setCloudServiceDeploymentEnvironmentUndefined: Self = StObject.set(x, "cloudServiceDeploymentEnvironment", js.undefined)
    
    @scala.inline
    def setCloudServiceDeploymentId(value: NullableOption[String]): Self = StObject.set(x, "cloudServiceDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudServiceDeploymentIdNull: Self = StObject.set(x, "cloudServiceDeploymentId", null)
    
    @scala.inline
    def setCloudServiceDeploymentIdUndefined: Self = StObject.set(x, "cloudServiceDeploymentId", js.undefined)
    
    @scala.inline
    def setCloudServiceInstanceName(value: NullableOption[String]): Self = StObject.set(x, "cloudServiceInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudServiceInstanceNameNull: Self = StObject.set(x, "cloudServiceInstanceName", null)
    
    @scala.inline
    def setCloudServiceInstanceNameUndefined: Self = StObject.set(x, "cloudServiceInstanceName", js.undefined)
    
    @scala.inline
    def setCloudServiceName(value: NullableOption[String]): Self = StObject.set(x, "cloudServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudServiceNameNull: Self = StObject.set(x, "cloudServiceName", null)
    
    @scala.inline
    def setCloudServiceNameUndefined: Self = StObject.set(x, "cloudServiceName", js.undefined)
    
    @scala.inline
    def setDeviceDescription(value: String): Self = StObject.set(x, "deviceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDescriptionUndefined: Self = StObject.set(x, "deviceDescription", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setMediaLegId(value: String): Self = StObject.set(x, "mediaLegId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaLegIdUndefined: Self = StObject.set(x, "mediaLegId", js.undefined)
    
    @scala.inline
    def setMediaQualityList(value: js.Array[TeleconferenceDeviceMediaQuality]): Self = StObject.set(x, "mediaQualityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaQualityListUndefined: Self = StObject.set(x, "mediaQualityList", js.undefined)
    
    @scala.inline
    def setMediaQualityListVarargs(value: TeleconferenceDeviceMediaQuality*): Self = StObject.set(x, "mediaQualityList", js.Array(value :_*))
    
    @scala.inline
    def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
  }
}
