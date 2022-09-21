package typings.microsoftteams.microsoftTeams.remoteCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  *
  * Data structure to indicate the status of the current session.
  */
trait SessionStatus extends StObject {
  
  /**
    * Whether the far-end user is controlling a  device.
    */
  var inControl: Boolean
  
  /**
    * Reason the  control session was terminated.
    */
  var terminatedReason: js.UndefOr[SessionTerminatedReason] = js.undefined
}
object SessionStatus {
  
  inline def apply(inControl: Boolean): SessionStatus = {
    val __obj = js.Dynamic.literal(inControl = inControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStatus]
  }
  
  extension [Self <: SessionStatus](x: Self) {
    
    inline def setInControl(value: Boolean): Self = StObject.set(x, "inControl", value.asInstanceOf[js.Any])
    
    inline def setTerminatedReason(value: SessionTerminatedReason): Self = StObject.set(x, "terminatedReason", value.asInstanceOf[js.Any])
    
    inline def setTerminatedReasonUndefined: Self = StObject.set(x, "terminatedReason", js.undefined)
  }
}
