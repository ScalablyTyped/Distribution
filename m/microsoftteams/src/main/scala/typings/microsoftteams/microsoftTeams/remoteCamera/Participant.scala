package typings.microsoftteams.microsoftTeams.remoteCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  *
  * Data structure to represent patricipant details needed to request control of camera.
  */
trait Participant extends StObject {
  
  /**
    * Active indicates whether the participant's device is actively being controlled.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Display name of participant.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Id of participant.
    */
  var id: String
}
object Participant {
  
  inline def apply(id: String): Participant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Participant] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
