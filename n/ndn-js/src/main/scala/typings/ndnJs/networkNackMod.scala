package typings.ndnJs

import typings.ndnJs.networkNackMod.NetworkNack.Reason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkNackMod {
  
  @JSImport("ndn-js/network-nack", "NetworkNack")
  @js.native
  class NetworkNack () extends StObject {
    
    def getOtherReasonCode(): Double = js.native
    
    def getReason(): Reason = js.native
  }
  object NetworkNack {
    
    @js.native
    sealed trait Reason extends StObject
    @JSImport("ndn-js/network-nack", "NetworkNack.Reason")
    @js.native
    object Reason extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Reason with Double] = js.native
      
      @js.native
      sealed trait CONGESTION extends Reason
      /* 50 */ val CONGESTION: typings.ndnJs.networkNackMod.NetworkNack.Reason.CONGESTION with Double = js.native
      
      @js.native
      sealed trait DUPLICATE extends Reason
      /* 100 */ val DUPLICATE: typings.ndnJs.networkNackMod.NetworkNack.Reason.DUPLICATE with Double = js.native
      
      @js.native
      sealed trait NONE extends Reason
      /* 0 */ val NONE: typings.ndnJs.networkNackMod.NetworkNack.Reason.NONE with Double = js.native
      
      @js.native
      sealed trait NO_ROUTE extends Reason
      /* 150 */ val NO_ROUTE: typings.ndnJs.networkNackMod.NetworkNack.Reason.NO_ROUTE with Double = js.native
      
      @js.native
      sealed trait OTHER_CODE extends Reason
      /* 0x7fff */ val OTHER_CODE: typings.ndnJs.networkNackMod.NetworkNack.Reason.OTHER_CODE with Double = js.native
    }
  }
}
