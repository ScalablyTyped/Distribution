package typings.ndnDashJs.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "NetworkNack")
@js.native
class NetworkNack ()
  extends typings.ndnDashJs.networkDashNackMod.NetworkNack

@JSImport("ndn-js", "NetworkNack")
@js.native
object NetworkNack extends js.Object {
  @js.native
  object Reason extends js.Object {
    /* 50 */ val CONGESTION: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.CONGESTION with Double = js.native
    /* 100 */ val DUPLICATE: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.DUPLICATE with Double = js.native
    /* 0 */ val NONE: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.NONE with Double = js.native
    /* 150 */ val NO_ROUTE: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.NO_ROUTE with Double = js.native
    /* 0x7fff */ val OTHER_CODE: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.OTHER_CODE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason with Double] = js.native
  }
  
}

