package typings.ndnDashJs.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "NetworkNack")
@js.native
object NetworkNackNs extends js.Object {
  @js.native
  object Reason extends js.Object {
    /* 50 */ val CONGESTION: typings.ndnDashJs.networkDashNackMod.NetworkNackNs.Reason.CONGESTION with Double = js.native
    /* 100 */ val DUPLICATE: typings.ndnDashJs.networkDashNackMod.NetworkNackNs.Reason.DUPLICATE with Double = js.native
    /* 0 */ val NONE: typings.ndnDashJs.networkDashNackMod.NetworkNackNs.Reason.NONE with Double = js.native
    /* 150 */ val NO_ROUTE: typings.ndnDashJs.networkDashNackMod.NetworkNackNs.Reason.NO_ROUTE with Double = js.native
    /* 0x7fff */ val OTHER_CODE: typings.ndnDashJs.networkDashNackMod.NetworkNackNs.Reason.OTHER_CODE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ndnDashJs.networkDashNackMod.NetworkNackNs.Reason with Double] = js.native
  }
  
}

