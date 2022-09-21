package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.SdkError
import typings.microsoftteams.microsoftTeams.meeting.IMeetingDetails
import typings.microsoftteams.microsoftTeams.meeting.LiveStreamState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meeting {
  
  @JSGlobal("microsoftTeams.meeting")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("microsoftTeams.meeting.MeetingType")
  @js.native
  object MeetingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.microsoftteams.microsoftTeams.meeting.MeetingType & String] = js.native
    
    /* "Adhoc" */ val Adhoc: typings.microsoftteams.microsoftTeams.meeting.MeetingType.Adhoc & String = js.native
    
    /* "Broadcast" */ val Broadcast: typings.microsoftteams.microsoftTeams.meeting.MeetingType.Broadcast & String = js.native
    
    /* "MeetNow" */ val MeetNow: typings.microsoftteams.microsoftTeams.meeting.MeetingType.MeetNow & String = js.native
    
    /* "Recurring" */ val Recurring: typings.microsoftteams.microsoftTeams.meeting.MeetingType.Recurring & String = js.native
    
    /* "Scheduled" */ val Scheduled: typings.microsoftteams.microsoftTeams.meeting.MeetingType.Scheduled & String = js.native
    
    /* "Unknown" */ val Unknown: typings.microsoftteams.microsoftTeams.meeting.MeetingType.Unknown & String = js.native
  }
  
  /**
    * Allows an app to get the authentication token for the anonymous or guest user in the meeting
    * @param callback Callback contains 2 parameters, error and authenticationTokenOfAnonymousUser.
    * error can either contain an error of type SdkError, incase of an error, or null when get is successful
    * authenticationTokenOfAnonymousUser can either contain a string value, incase of a successful get or null when the get fails
    */
  inline def getAuthenticationTokenForAnonymousUser(
    callback: js.Function2[
      /* error */ SdkError | Null, 
      /* authenticationTokenOfAnonymousUser */ String | Null, 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthenticationTokenForAnonymousUser")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Allows an app to get the incoming audio speaker setting for the meeting user
    * @param callback Callback contains 2 parameters, error and result.
    * error can either contain an error of type SdkError, incase of an error, or null when fetch is successful
    * result can either contain the true/false value, incase of a successful fetch or null when the fetching fails
    * result: True means incoming audio is muted and false means incoming audio is unmuted
    */
  inline def getIncomingClientAudioState(callback: js.Function2[/* error */ SdkError | Null, /* result */ Boolean | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getIncomingClientAudioState")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Allows an app to get the state of the live stream in the current meeting
    * @param callback Callback contains 2 parameters: error and liveStreamState.
    * error can either contain an error of type SdkError, in case of an error, or null when get is successful
    * liveStreamState can either contain a LiveStreamState value, or null when operation fails
    */
  inline def getLiveStreamState(
    callback: js.Function2[/* error */ SdkError | Null, /* liveStreamState */ LiveStreamState | Null, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLiveStreamState")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    * Allows an app to get the meeting details for the meeting
    * @param callback Callback contains 2 parameters, error and meetingDetails.
    * error can either contain an error of type SdkError, incase of an error, or null when get is successful
    * result can either contain a IMeetingDetails value, incase of a successful get or null when the get fails
    */
  inline def getMeetingDetails(
    callback: js.Function2[/* error */ SdkError | Null, /* meetingDetails */ IMeetingDetails | Null, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeetingDetails")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Registers a handler for changes to the live stream.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the live stream state changes
    */
  inline def registerLiveStreamChangedHandler(handler: js.Function1[/* liveStreamState */ LiveStreamState, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLiveStreamChangedHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Allows an app to request the live streaming be started at the given streaming url
    * @param streamUrl the url to the stream resource
    * @param streamKey the key to the stream resource
    * @param callback Callback contains error parameter which can be of type SdkError in case of an error, or null when operation is successful
    * Use getLiveStreamState or registerLiveStreamChangedHandler to get updates on the live stream state
    */
  inline def requestStartLiveStreaming(callback: js.Function1[/* error */ SdkError | Null, Unit], streamUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestStartLiveStreaming")(callback.asInstanceOf[js.Any], streamUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def requestStartLiveStreaming(callback: js.Function1[/* error */ SdkError | Null, Unit], streamUrl: String, streamKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestStartLiveStreaming")(callback.asInstanceOf[js.Any], streamUrl.asInstanceOf[js.Any], streamKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Allows an app to request the live streaming be stopped at the given streaming url
    * @param callback Callback contains error parameter which can be of type SdkError in case of an error, or null when operation is successful
    * Use getLiveStreamState or registerLiveStreamChangedHandler to get updates on the live stream state
    */
  inline def requestStopLiveStreaming(callback: js.Function1[/* error */ SdkError | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStopLiveStreaming")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Allows an app to toggle the incoming audio speaker setting for the meeting user from mute to unmute or vice-versa
    * @param callback Callback contains 2 parameters, error and result.
    * error can either contain an error of type SdkError, incase of an error, or null when toggle is successful
    * result can either contain the true/false value, incase of a successful toggle or null when the toggling fails
    * result: True means incoming audio is muted and false means incoming audio is unmuted
    */
  inline def toggleIncomingClientAudio(callback: js.Function2[/* error */ SdkError | Null, /* result */ Boolean | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleIncomingClientAudio")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
