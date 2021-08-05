package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Idle
////////////////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * Permissions:  "idle"
  * @since Chrome 6.
  */
object idle {
  
  /* Rewritten from type alias, can be one of: 
    - typings.naverWhale.naverWhaleStrings.active
    - typings.naverWhale.naverWhaleStrings.idle
    - typings.naverWhale.naverWhaleStrings.locked
  */
  trait IdleState extends StObject
  object IdleState {
    
    inline def active: typings.naverWhale.naverWhaleStrings.active = "active".asInstanceOf[typings.naverWhale.naverWhaleStrings.active]
    
    inline def idle: typings.naverWhale.naverWhaleStrings.idle = "idle".asInstanceOf[typings.naverWhale.naverWhaleStrings.idle]
    
    inline def locked: typings.naverWhale.naverWhaleStrings.locked = "locked".asInstanceOf[typings.naverWhale.naverWhaleStrings.locked]
  }
  
  type IdleStateChangedEvent = Event[js.Function1[/* newState */ typings.chrome.chrome.idle.IdleState, Unit]]
}
