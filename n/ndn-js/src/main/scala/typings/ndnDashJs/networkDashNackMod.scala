package typings.ndnDashJs

import typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/network-nack", JSImport.Namespace)
@js.native
object networkDashNackMod extends js.Object {
  @js.native
  class NetworkNack () extends js.Object {
    def getOtherReasonCode(): Double = js.native
    def getReason(): Reason = js.native
  }
  
  @js.native
  object NetworkNack extends js.Object {
    @js.native
    sealed trait Reason extends js.Object
    
    @js.native
    object Reason extends js.Object {
      @js.native
      sealed trait CONGESTION extends Reason
      
      @js.native
      sealed trait DUPLICATE extends Reason
      
      @js.native
      sealed trait NONE extends Reason
      
      @js.native
      sealed trait NO_ROUTE extends Reason
      
      @js.native
      sealed trait OTHER_CODE extends Reason
      
      /* 50 */ val CONGESTION: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.CONGESTION with Double = js.native
      /* 100 */ val DUPLICATE: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.DUPLICATE with Double = js.native
      /* 0 */ val NONE: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.NONE with Double = js.native
      /* 150 */ val NO_ROUTE: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.NO_ROUTE with Double = js.native
      /* 0x7fff */ val OTHER_CODE: typings.ndnDashJs.networkDashNackMod.NetworkNack.Reason.OTHER_CODE with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Reason with Double] = js.native
    }
    
  }
  
}

