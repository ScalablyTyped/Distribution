package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeWatchdogTerminateEvent")
@js.native
/* protected */ open class BeforeWatchdogTerminateEvent () extends StObject {
  
  /**
    * If set to true, cancels the termination of the script
    * runtime. Note that depending on server configuration
    * settings, cancellation of the termination may not be
    * allowed.
    */
  var cancel: Boolean = js.native
  
  /**
    * Contains the reason why a script runtime is to be
    * terminated.
    */
  val terminateReason: WatchdogTerminateReason = js.native
}
