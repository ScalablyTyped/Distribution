package typings.microsoftteams.microsoftTeams.remoteCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionTerminatedReason extends StObject
/**
  * Hide from docs
  *
  * Enum used to indicate the reason the session was terminated.
  */
@JSGlobal("microsoftTeams.remoteCamera.SessionTerminatedReason")
@js.native
object SessionTerminatedReason extends StObject {
  
  @js.native
  sealed trait AckTimeout
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait ControlBusy
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait ControlDenied
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait ControlDisabled
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait ControlNoResponse
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait ControlTerminated
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait ControlTerminatedToAllowOtherController
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait ControllerCancelled
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait ControllerTerminated
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait DataChannelError
    extends StObject
       with SessionTerminatedReason
  
  @js.native
  sealed trait None
    extends StObject
       with SessionTerminatedReason
}
