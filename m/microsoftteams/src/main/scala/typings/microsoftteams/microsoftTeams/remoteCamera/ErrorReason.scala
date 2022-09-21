package typings.microsoftteams.microsoftTeams.remoteCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorReason extends StObject
/**
  * Hide from docs
  *
  * Enum used to indicate the reason for the error.
  */
@JSGlobal("microsoftTeams.remoteCamera.ErrorReason")
@js.native
object ErrorReason extends StObject {
  
  @js.native
  sealed trait CommandPanLeftError
    extends StObject
       with ErrorReason
  
  @js.native
  sealed trait CommandPanRightError
    extends StObject
       with ErrorReason
  
  @js.native
  sealed trait CommandResetError
    extends StObject
       with ErrorReason
  
  @js.native
  sealed trait CommandTiltDownError
    extends StObject
       with ErrorReason
  
  @js.native
  sealed trait CommandTiltUpError
    extends StObject
       with ErrorReason
  
  @js.native
  sealed trait CommandZoomInError
    extends StObject
       with ErrorReason
  
  @js.native
  sealed trait CommandZoomOutError
    extends StObject
       with ErrorReason
  
  @js.native
  sealed trait SendDataError
    extends StObject
       with ErrorReason
}
