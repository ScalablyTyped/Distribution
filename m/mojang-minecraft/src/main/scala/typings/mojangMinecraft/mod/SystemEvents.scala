package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "SystemEvents")
@js.native
/* protected */ open class SystemEvents () extends StObject {
  
  /**
    * This event fires before a the performance watchdog
    * terminates scripting execution due to exceeding a
    * performance boundary. Depending on the configuration of the
    * runtime environment, this event can be canceled. For
    * example, on certain dedicated server environments the
    * ability to override termination events may be disabled.
    */
  val beforeWatchdogTerminate: BeforeWatchdogTerminateEventSignal = js.native
}
