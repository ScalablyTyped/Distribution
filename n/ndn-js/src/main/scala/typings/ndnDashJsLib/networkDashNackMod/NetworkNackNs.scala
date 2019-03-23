package typings
package ndnDashJsLib.networkDashNackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/network-nack", "NetworkNack")
@js.native
object NetworkNackNs extends js.Object {
  @js.native
  sealed trait Reason extends js.Object
  
  @js.native
  object Reason extends js.Object {
    @js.native
    sealed trait CONGESTION
      extends ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason
    
    @js.native
    sealed trait DUPLICATE
      extends ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason
    
    @js.native
    sealed trait NONE
      extends ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason
    
    @js.native
    sealed trait NO_ROUTE
      extends ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason
    
    @js.native
    sealed trait OTHER_CODE
      extends ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason
    
    /* 50 */ val CONGESTION: CONGESTION with scala.Double = js.native
    /* 100 */ val DUPLICATE: DUPLICATE with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    /* 150 */ val NO_ROUTE: NO_ROUTE with scala.Double = js.native
    /* 0x7fff */ val OTHER_CODE: OTHER_CODE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[ndnDashJsLib.networkDashNackMod.NetworkNackNs.Reason with scala.Double] = js.native
  }
  
}

