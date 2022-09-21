package typings.metroCore

import typings.node.netMod.Socket
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalMod {
  
  @JSImport("metro-core/Terminal", "Terminal")
  @js.native
  open class Terminal protected () extends StObject {
    def this(stream: UnderlyingStream) = this()
    
    /**
      * Similar to `console.log`, except it moves the status/progress text out of
      * the way correctly. In non-interactive terminals this is the same as
      * `console.log`.
      */
    def log(format: String, args: Any*): Unit = js.native
    
    /**
      * Log the current status and start from scratch. This is useful if the last
      * status was the last one of a series of updates.
      */
    def persistStatus(): Unit = js.native
    
    /**
      * Shows some text that is meant to be overriden later. Return the previous
      * status that was shown and is no more. Calling `status()` with no argument
      * removes the status altogether. The status is never shown in a
      * non-interactive terminal: for example, if the output is redirected to a
      * file, then we don't care too much about having a progress bar.
      */
    def status(format: String, args: Any*): String = js.native
  }
  
  type UnderlyingStream = Socket | Writable
}
