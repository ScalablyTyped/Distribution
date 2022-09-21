package typings.microsoftteams.microsoftTeams

import typings.microsoftteams.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meeting {
  
  @js.native
  sealed trait MeetingType extends StObject
  @JSGlobal("microsoftTeams.meeting.MeetingType")
  @js.native
  object MeetingType extends StObject {
    
    @js.native
    sealed trait Adhoc
      extends StObject
         with MeetingType
    
    @js.native
    sealed trait Broadcast
      extends StObject
         with MeetingType
    
    @js.native
    sealed trait MeetNow
      extends StObject
         with MeetingType
    
    @js.native
    sealed trait Recurring
      extends StObject
         with MeetingType
    
    @js.native
    sealed trait Scheduled
      extends StObject
         with MeetingType
    
    @js.native
    sealed trait Unknown
      extends StObject
         with MeetingType
  }
  
  /**
    * Hide from docs
    * Data structure to represent a conversation object.
    */
  // tslint:disable-next-line:interface-name
  trait IConversation extends StObject {
    
    /**
      * conversation id of the meeting
      */
    var id: String
  }
  object IConversation {
    
    inline def apply(id: String): IConversation = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConversation]
    }
    
    extension [Self <: IConversation](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Hide from docs
    * Data structure to represent details.
    */
  // tslint:disable-next-line:interface-name
  trait IDetails extends StObject {
    
    /**
      * url to join the current meeting
      */
    var joinUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Scheduled end time of the meeting
      */
    var scheduledEndTime: String
    
    /**
      * Scheduled start time of the meeting
      */
    var scheduledStartTime: String
    
    /**
      * meeting title name of the meeting
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * type of the meeting
      */
    var `type`: js.UndefOr[MeetingType] = js.undefined
  }
  object IDetails {
    
    inline def apply(scheduledEndTime: String, scheduledStartTime: String): IDetails = {
      val __obj = js.Dynamic.literal(scheduledEndTime = scheduledEndTime.asInstanceOf[js.Any], scheduledStartTime = scheduledStartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetails]
    }
    
    extension [Self <: IDetails](x: Self) {
      
      inline def setJoinUrl(value: String): Self = StObject.set(x, "joinUrl", value.asInstanceOf[js.Any])
      
      inline def setJoinUrlUndefined: Self = StObject.set(x, "joinUrl", js.undefined)
      
      inline def setScheduledEndTime(value: String): Self = StObject.set(x, "scheduledEndTime", value.asInstanceOf[js.Any])
      
      inline def setScheduledStartTime(value: String): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: MeetingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * Hide from docs
    * Data structure to represent a meeting details.
    */
  // tslint:disable-next-line:interface-name
  trait IMeetingDetails extends StObject {
    
    /**
      * conversation object
      */
    var conversation: IConversation
    
    /**
      * details object
      */
    var details: IDetails
    
    /**
      * organizer object
      */
    var organizer: IOrganizer
  }
  object IMeetingDetails {
    
    inline def apply(conversation: IConversation, details: IDetails, organizer: IOrganizer): IMeetingDetails = {
      val __obj = js.Dynamic.literal(conversation = conversation.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMeetingDetails]
    }
    
    extension [Self <: IMeetingDetails](x: Self) {
      
      inline def setConversation(value: IConversation): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: IDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setOrganizer(value: IOrganizer): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Hide from docs
    * Data structure to represent an organizer object.
    */
  // tslint:disable-next-line:interface-name
  trait IOrganizer extends StObject {
    
    /**
      * organizer id of the meeting
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * tenant id of the meeting
      */
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object IOrganizer {
    
    inline def apply(): IOrganizer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOrganizer]
    }
    
    extension [Self <: IOrganizer](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait LiveStreamState extends StObject {
    
    /**
      * error object in case there is a failure
      */
    var error: js.UndefOr[Code] = js.undefined
    
    /**
      * indicates whether meeting is streaming
      */
    var isStreaming: Boolean
  }
  object LiveStreamState {
    
    inline def apply(isStreaming: Boolean): LiveStreamState = {
      val __obj = js.Dynamic.literal(isStreaming = isStreaming.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveStreamState]
    }
    
    extension [Self <: LiveStreamState](x: Self) {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIsStreaming(value: Boolean): Self = StObject.set(x, "isStreaming", value.asInstanceOf[js.Any])
    }
  }
}
