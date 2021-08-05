package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticRepliesSetting extends StObject {
  
  /**
    * The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status
    * is AlwaysEnabled or Scheduled. The possible values are: none, contactsOnly, all.
    */
  var externalAudience: js.UndefOr[NullableOption[ExternalAudienceScope]] = js.undefined
  
  // The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
  var externalReplyMessage: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled
    * or Scheduled.
    */
  var internalReplyMessage: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time that automatic replies are set to end, if Status is set to Scheduled.
  var scheduledEndDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // The date and time that automatic replies are set to begin, if Status is set to Scheduled.
  var scheduledStartDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // Configurations status for automatic replies. The possible values are: disabled, alwaysEnabled, scheduled.
  var status: js.UndefOr[NullableOption[AutomaticRepliesStatus]] = js.undefined
}
object AutomaticRepliesSetting {
  
  inline def apply(): AutomaticRepliesSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticRepliesSetting]
  }
  
  extension [Self <: AutomaticRepliesSetting](x: Self) {
    
    inline def setExternalAudience(value: NullableOption[ExternalAudienceScope]): Self = StObject.set(x, "externalAudience", value.asInstanceOf[js.Any])
    
    inline def setExternalAudienceNull: Self = StObject.set(x, "externalAudience", null)
    
    inline def setExternalAudienceUndefined: Self = StObject.set(x, "externalAudience", js.undefined)
    
    inline def setExternalReplyMessage(value: NullableOption[String]): Self = StObject.set(x, "externalReplyMessage", value.asInstanceOf[js.Any])
    
    inline def setExternalReplyMessageNull: Self = StObject.set(x, "externalReplyMessage", null)
    
    inline def setExternalReplyMessageUndefined: Self = StObject.set(x, "externalReplyMessage", js.undefined)
    
    inline def setInternalReplyMessage(value: NullableOption[String]): Self = StObject.set(x, "internalReplyMessage", value.asInstanceOf[js.Any])
    
    inline def setInternalReplyMessageNull: Self = StObject.set(x, "internalReplyMessage", null)
    
    inline def setInternalReplyMessageUndefined: Self = StObject.set(x, "internalReplyMessage", js.undefined)
    
    inline def setScheduledEndDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "scheduledEndDateTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledEndDateTimeNull: Self = StObject.set(x, "scheduledEndDateTime", null)
    
    inline def setScheduledEndDateTimeUndefined: Self = StObject.set(x, "scheduledEndDateTime", js.undefined)
    
    inline def setScheduledStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "scheduledStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledStartDateTimeNull: Self = StObject.set(x, "scheduledStartDateTime", null)
    
    inline def setScheduledStartDateTimeUndefined: Self = StObject.set(x, "scheduledStartDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[AutomaticRepliesStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
