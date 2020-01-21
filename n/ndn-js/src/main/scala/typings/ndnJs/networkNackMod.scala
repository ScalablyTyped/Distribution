package typings.ndnJs

import org.scalablytyped.runtime.TopLevel
import typings.ndnJs.networkNackMod.NetworkNack.Reason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/network-nack", JSImport.Namespace)
@js.native
object networkNackMod extends js.Object {
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
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Reason with Double] = js.native
      /* 50 */ @js.native
      object CONGESTION extends TopLevel[CONGESTION with Double]
      
      /* 100 */ @js.native
      object DUPLICATE extends TopLevel[DUPLICATE with Double]
      
      /* 0 */ @js.native
      object NONE extends TopLevel[NONE with Double]
      
      /* 150 */ @js.native
      object NO_ROUTE extends TopLevel[NO_ROUTE with Double]
      
      /* 0x7fff */ @js.native
      object OTHER_CODE extends TopLevel[OTHER_CODE with Double]
      
    }
    
  }
  
}

