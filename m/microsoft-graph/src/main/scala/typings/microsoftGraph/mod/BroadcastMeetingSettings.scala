package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastMeetingSettings extends StObject {
  
  // Defines who can join the Teams live event. Possible values are listed in the following table.
  var allowedAudience: js.UndefOr[NullableOption[BroadcastMeetingAudience]] = js.undefined
  
  // Caption settings of a Teams live event.
  var captions: js.UndefOr[NullableOption[BroadcastMeetingCaptionSettings]] = js.undefined
  
  // Indicates whether attendee report is enabled for this Teams live event. Default value is false.
  var isAttendeeReportEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether Q&amp;A is enabled for this Teams live event. Default value is false.
  var isQuestionAndAnswerEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether recording is enabled for this Teams live event. Default value is false.
  var isRecordingEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether video on demand is enabled for this Teams live event. Default value is false.
  var isVideoOnDemandEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object BroadcastMeetingSettings {
  
  inline def apply(): BroadcastMeetingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastMeetingSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadcastMeetingSettings] (val x: Self) extends AnyVal {
    
    inline def setAllowedAudience(value: NullableOption[BroadcastMeetingAudience]): Self = StObject.set(x, "allowedAudience", value.asInstanceOf[js.Any])
    
    inline def setAllowedAudienceNull: Self = StObject.set(x, "allowedAudience", null)
    
    inline def setAllowedAudienceUndefined: Self = StObject.set(x, "allowedAudience", js.undefined)
    
    inline def setCaptions(value: NullableOption[BroadcastMeetingCaptionSettings]): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
    
    inline def setCaptionsNull: Self = StObject.set(x, "captions", null)
    
    inline def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
    
    inline def setIsAttendeeReportEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isAttendeeReportEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsAttendeeReportEnabledNull: Self = StObject.set(x, "isAttendeeReportEnabled", null)
    
    inline def setIsAttendeeReportEnabledUndefined: Self = StObject.set(x, "isAttendeeReportEnabled", js.undefined)
    
    inline def setIsQuestionAndAnswerEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isQuestionAndAnswerEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsQuestionAndAnswerEnabledNull: Self = StObject.set(x, "isQuestionAndAnswerEnabled", null)
    
    inline def setIsQuestionAndAnswerEnabledUndefined: Self = StObject.set(x, "isQuestionAndAnswerEnabled", js.undefined)
    
    inline def setIsRecordingEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isRecordingEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsRecordingEnabledNull: Self = StObject.set(x, "isRecordingEnabled", null)
    
    inline def setIsRecordingEnabledUndefined: Self = StObject.set(x, "isRecordingEnabled", js.undefined)
    
    inline def setIsVideoOnDemandEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isVideoOnDemandEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsVideoOnDemandEnabledNull: Self = StObject.set(x, "isVideoOnDemandEnabled", null)
    
    inline def setIsVideoOnDemandEnabledUndefined: Self = StObject.set(x, "isVideoOnDemandEnabled", js.undefined)
  }
}
