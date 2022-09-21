package typings.microsoftteams.microsoftTeams.remoteCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlCommand extends StObject
/**
  * Hide from docs
  *
  * Enum used to indicate possible camera control commands.
  */
@JSGlobal("microsoftTeams.remoteCamera.ControlCommand")
@js.native
object ControlCommand extends StObject {
  
  @js.native
  sealed trait PanLeft
    extends StObject
       with ControlCommand
  
  @js.native
  sealed trait PanRight
    extends StObject
       with ControlCommand
  
  @js.native
  sealed trait Reset
    extends StObject
       with ControlCommand
  
  @js.native
  sealed trait TiltDown
    extends StObject
       with ControlCommand
  
  @js.native
  sealed trait TiltUp
    extends StObject
       with ControlCommand
  
  @js.native
  sealed trait ZoomIn
    extends StObject
       with ControlCommand
  
  @js.native
  sealed trait ZoomOut
    extends StObject
       with ControlCommand
}
