package typings.microsoftGraph.mod.CallRecords

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceUserAgent extends UserAgent {
  
  /**
    * Identifies the role of the service used by this endpoint. Possible values are: unknown, customBot,
    * skypeForBusinessMicrosoftTeamsGateway, skypeForBusinessAudioVideoMcu, skypeForBusinessApplicationSharingMcu,
    * skypeForBusinessCallQueues, skypeForBusinessAutoAttendant, mediationServer, mediationServerCloudConnectorEdition,
    * exchangeUnifiedMessagingService, mediaController, conferencingAnnouncementService, conferencingAttendant,
    * audioTeleconferencerController, skypeForBusinessUnifiedCommunicationApplicationPlatform,
    * responseGroupServiceAnnouncementService, gateway, skypeTranslator, skypeForBusinessAttendant, responseGroupService,
    * voicemail, unknownFutureValue.
    */
  var role: js.UndefOr[ServiceRole] = js.native
}
object ServiceUserAgent {
  
  @scala.inline
  def apply(): ServiceUserAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUserAgent]
  }
  
  @scala.inline
  implicit class ServiceUserAgentOps[Self <: ServiceUserAgent] (val x: Self) extends AnyVal {
    
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
    def setRole(value: ServiceRole): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
