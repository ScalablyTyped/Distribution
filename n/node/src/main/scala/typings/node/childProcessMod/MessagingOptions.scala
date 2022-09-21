package typings.node.childProcessMod

import typings.node.eventsMod.Abortable
import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingOptions
  extends StObject
     with Abortable {
  
  /**
    * The signal value to be used when the spawned process will be killed by the abort signal.
    * @default 'SIGTERM'
    */
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.undefined
  
  /**
    * In milliseconds the maximum amount of time the process is allowed to run.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object MessagingOptions {
  
  inline def apply(): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingOptions]
  }
  
  extension [Self <: MessagingOptions](x: Self) {
    
    inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    inline def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
