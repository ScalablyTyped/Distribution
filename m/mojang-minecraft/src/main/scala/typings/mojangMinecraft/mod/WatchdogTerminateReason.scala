package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchdogTerminateReason extends StObject
@JSImport("mojang-minecraft", "WatchdogTerminateReason")
@js.native
object WatchdogTerminateReason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WatchdogTerminateReason & String] = js.native
  
  /**
    * Script runtime for a behavior pack is terminated due to
    * non-responsiveness from script (a hang or infinite loop).
    */
  @js.native
  sealed trait hang
    extends StObject
       with WatchdogTerminateReason
  /* "hang" */ val hang: typings.mojangMinecraft.mod.WatchdogTerminateReason.hang & String = js.native
  
  /**
    * Script runtime for a behavior pack is terminated due to a
    * stack overflow (a long, and potentially infinite) chain of
    * function calls.
    */
  @js.native
  sealed trait stackOverflow
    extends StObject
       with WatchdogTerminateReason
  /* "stackOverflow" */ val stackOverflow: typings.mojangMinecraft.mod.WatchdogTerminateReason.stackOverflow & String = js.native
}
