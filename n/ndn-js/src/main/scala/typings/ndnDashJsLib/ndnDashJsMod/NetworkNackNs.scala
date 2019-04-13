package typings
package ndnDashJsLib.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "NetworkNack")
@js.native
object NetworkNackNs extends js.Object {
  @js.native
  object Reason extends js.Object {
    /* 50 */ val CONGESTION: ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason.CONGESTION with scala.Double = js.native
    /* 100 */ val DUPLICATE: ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason.DUPLICATE with scala.Double = js.native
    /* 0 */ val NONE: ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason.NONE with scala.Double = js.native
    /* 150 */ val NO_ROUTE: ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason.NO_ROUTE with scala.Double = js.native
    /* 0x7fff */ val OTHER_CODE: ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason.OTHER_CODE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason with scala.Double] = js.native
  }
  
}

