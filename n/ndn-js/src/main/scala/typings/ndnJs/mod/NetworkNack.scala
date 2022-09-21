package typings.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "NetworkNack")
@js.native
open class NetworkNack ()
  extends typings.ndnJs.networkNackMod.NetworkNack
object NetworkNack {
  
  @JSImport("ndn-js", "NetworkNack.Reason")
  @js.native
  object Reason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ndnJs.networkNackMod.NetworkNack.Reason & Double] = js.native
    
    /* 50 */ val CONGESTION: typings.ndnJs.networkNackMod.NetworkNack.Reason.CONGESTION & Double = js.native
    
    /* 100 */ val DUPLICATE: typings.ndnJs.networkNackMod.NetworkNack.Reason.DUPLICATE & Double = js.native
    
    /* 0 */ val NONE: typings.ndnJs.networkNackMod.NetworkNack.Reason.NONE & Double = js.native
    
    /* 150 */ val NO_ROUTE: typings.ndnJs.networkNackMod.NetworkNack.Reason.NO_ROUTE & Double = js.native
    
    /* 0x7fff */ val OTHER_CODE: typings.ndnJs.networkNackMod.NetworkNack.Reason.OTHER_CODE & Double = js.native
  }
}
