package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meetingRoom {
  
  @js.native
  sealed trait Capability extends StObject
  /**
    * Hide from docs
    *
    * Enum used to indicate meeting room capabilities.
    */
  @JSGlobal("microsoftTeams.meetingRoom.Capability")
  @js.native
  object Capability extends StObject {
    
    /**
      * Meeting control capability: leave meeting.
      */
    @js.native
    sealed trait leaveMeeting
      extends StObject
         with Capability
    
    /**
      * Stage layout control capability: show content mode.
      */
    @js.native
    sealed trait showContent
      extends StObject
         with Capability
    
    /**
      * Stage layout control capability: show laryge gallery mode.
      */
    @js.native
    sealed trait showLargeGallery
      extends StObject
         with Capability
    
    /**
      * Stage layout control capability: show together mode.
      */
    @js.native
    sealed trait showTogether
      extends StObject
         with Capability
    
    /**
      * Stage layout control capability: show gallery mode.
      */
    @js.native
    sealed trait showVideoGallery
      extends StObject
         with Capability
    
    /**
      * Stage layout control capability: show content + gallery mode.
      */
    @js.native
    sealed trait showVideoGalleryAndContent
      extends StObject
         with Capability
    
    /**
      * Media control capability: toggle camera.
      */
    @js.native
    sealed trait toggleCamera
      extends StObject
         with Capability
    
    /**
      * Media control capability: toggle captions.
      */
    @js.native
    sealed trait toggleCaptions
      extends StObject
         with Capability
    
    /**
      * Media control capability: toggle mute.
      */
    @js.native
    sealed trait toggleMute
      extends StObject
         with Capability
    
    /**
      * Media control capability: volume ajustion.
      */
    @js.native
    sealed trait volume
      extends StObject
         with Capability
  }
  
  /**
    * Hide from docs
    *
    * Data structure to represent capabilities of a meeting room.
    */
  trait MeetingRoomCapability extends StObject {
    
    /**
      * Media control capabilities, value can be "toggleMute", "toggleCamera", "toggleCaptions", "volume".
      */
    var mediaControls: js.Array[String]
    
    /**
      * Meeting control capabilities, value can be "leaveMeeting".
      */
    var meetingControls: js.Array[String]
    
    /**
      * Main stage layout control capabilities, value can be "showVideoGallery", "showContent", "showVideoGalleryAndContent", "showLargeGallery", "showTogether".
      */
    var stageLayoutControls: js.Array[String]
  }
  object MeetingRoomCapability {
    
    inline def apply(
      mediaControls: js.Array[String],
      meetingControls: js.Array[String],
      stageLayoutControls: js.Array[String]
    ): MeetingRoomCapability = {
      val __obj = js.Dynamic.literal(mediaControls = mediaControls.asInstanceOf[js.Any], meetingControls = meetingControls.asInstanceOf[js.Any], stageLayoutControls = stageLayoutControls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeetingRoomCapability]
    }
    
    extension [Self <: MeetingRoomCapability](x: Self) {
      
      inline def setMediaControls(value: js.Array[String]): Self = StObject.set(x, "mediaControls", value.asInstanceOf[js.Any])
      
      inline def setMediaControlsVarargs(value: String*): Self = StObject.set(x, "mediaControls", js.Array(value*))
      
      inline def setMeetingControls(value: js.Array[String]): Self = StObject.set(x, "meetingControls", value.asInstanceOf[js.Any])
      
      inline def setMeetingControlsVarargs(value: String*): Self = StObject.set(x, "meetingControls", js.Array(value*))
      
      inline def setStageLayoutControls(value: js.Array[String]): Self = StObject.set(x, "stageLayoutControls", value.asInstanceOf[js.Any])
      
      inline def setStageLayoutControlsVarargs(value: String*): Self = StObject.set(x, "stageLayoutControls", js.Array(value*))
    }
  }
  
  /**
    * Hide from docs
    *
    * Data structure to represent a meeting room.
    */
  trait MeetingRoomInfo extends StObject {
    
    /**
      * Client type of the meeting room.
      */
    var clientType: String
    
    /**
      * Client version of the meeting room.
      */
    var clientVersion: String
    
    /**
      * Device name of the meeting room.
      */
    var deviceName: String
    
    /**
      * Endpoint id of the meeting room.
      */
    var endpointId: String
  }
  object MeetingRoomInfo {
    
    inline def apply(clientType: String, clientVersion: String, deviceName: String, endpointId: String): MeetingRoomInfo = {
      val __obj = js.Dynamic.literal(clientType = clientType.asInstanceOf[js.Any], clientVersion = clientVersion.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeetingRoomInfo]
    }
    
    extension [Self <: MeetingRoomInfo](x: Self) {
      
      inline def setClientType(value: String): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
      
      inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
      
      inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Hide from docs
    *
    * Data structure to represent states of a meeting room.
    */
  trait MeetingRoomState extends StObject {
    
    /**
      * Current leaveMeeting state, true: leave, false: no-op.
      */
    var leaveMeeting: Boolean
    
    /**
      * Current main stage layout state, value can be one of "Gallery", "Content + gallery", "Content", "Large gallery" and "Together mode".
      */
    var stageLayout: String
    
    /**
      * Current camera state, true: camera on, false: camera off.
      */
    var toggleCamera: Boolean
    
    /**
      * Current captions state, true: captions on, false: captions off.
      */
    var toggleCaptions: Boolean
    
    /**
      * Current mute state, true: mute, false: unmute.
      */
    var toggleMute: Boolean
  }
  object MeetingRoomState {
    
    inline def apply(
      leaveMeeting: Boolean,
      stageLayout: String,
      toggleCamera: Boolean,
      toggleCaptions: Boolean,
      toggleMute: Boolean
    ): MeetingRoomState = {
      val __obj = js.Dynamic.literal(leaveMeeting = leaveMeeting.asInstanceOf[js.Any], stageLayout = stageLayout.asInstanceOf[js.Any], toggleCamera = toggleCamera.asInstanceOf[js.Any], toggleCaptions = toggleCaptions.asInstanceOf[js.Any], toggleMute = toggleMute.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeetingRoomState]
    }
    
    extension [Self <: MeetingRoomState](x: Self) {
      
      inline def setLeaveMeeting(value: Boolean): Self = StObject.set(x, "leaveMeeting", value.asInstanceOf[js.Any])
      
      inline def setStageLayout(value: String): Self = StObject.set(x, "stageLayout", value.asInstanceOf[js.Any])
      
      inline def setToggleCamera(value: Boolean): Self = StObject.set(x, "toggleCamera", value.asInstanceOf[js.Any])
      
      inline def setToggleCaptions(value: Boolean): Self = StObject.set(x, "toggleCaptions", value.asInstanceOf[js.Any])
      
      inline def setToggleMute(value: Boolean): Self = StObject.set(x, "toggleMute", value.asInstanceOf[js.Any])
    }
  }
}
