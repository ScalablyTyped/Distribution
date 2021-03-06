package typings.microEvents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micro-events", JSImport.Namespace)
  @js.native
  class ^ () extends MicroEventEmitter
  
  /** Event handler function signature */
  type EventHandler = js.Function1[/* repeated */ js.Any, js.Any]
  
  @js.native
  trait MicroEventEmitter extends StObject {
    
    /** Trigger event */
    def emit(`type`: String, arguments: js.Any*): MicroEventEmitter = js.native
    
    /** Max listeners count */
    var maxListeners: Double = js.native
    
    /** Detach listener */
    def off(`type`: String): MicroEventEmitter = js.native
    def off(`type`: String, handler: EventHandler): MicroEventEmitter = js.native
    
    /** Attach listener */
    def on(`type`: String, handler: EventHandler): MicroEventEmitter = js.native
  }
}
