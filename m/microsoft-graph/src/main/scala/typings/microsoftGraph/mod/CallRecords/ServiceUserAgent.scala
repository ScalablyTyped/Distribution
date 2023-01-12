package typings.microsoftGraph.mod.CallRecords

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceUserAgent
  extends StObject
     with UserAgent {
  
  /**
    * Identifies the role of the service used by this endpoint. Possible values are: unknown, customBot,
    * skypeForBusinessMicrosoftTeamsGateway, skypeForBusinessAudioVideoMcu, skypeForBusinessApplicationSharingMcu,
    * skypeForBusinessCallQueues, skypeForBusinessAutoAttendant, mediationServer, mediationServerCloudConnectorEdition,
    * exchangeUnifiedMessagingService, mediaController, conferencingAnnouncementService, conferencingAttendant,
    * audioTeleconferencerController, skypeForBusinessUnifiedCommunicationApplicationPlatform,
    * responseGroupServiceAnnouncementService, gateway, skypeTranslator, skypeForBusinessAttendant, responseGroupService,
    * voicemail, unknownFutureValue.
    */
  var role: js.UndefOr[ServiceRole] = js.undefined
}
object ServiceUserAgent {
  
  inline def apply(): ServiceUserAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUserAgent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceUserAgent] (val x: Self) extends AnyVal {
    
    inline def setRole(value: ServiceRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
