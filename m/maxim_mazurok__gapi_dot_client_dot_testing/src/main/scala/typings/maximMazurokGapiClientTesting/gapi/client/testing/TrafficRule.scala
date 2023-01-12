package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficRule extends StObject {
  
  /** Bandwidth in kbits/second. */
  var bandwidth: js.UndefOr[Double] = js.undefined
  
  /** Burst size in kbits. */
  var burst: js.UndefOr[Double] = js.undefined
  
  /** Packet delay, must be >= 0. */
  var delay: js.UndefOr[String] = js.undefined
  
  /** Packet duplication ratio (0.0 - 1.0). */
  var packetDuplicationRatio: js.UndefOr[Double] = js.undefined
  
  /** Packet loss ratio (0.0 - 1.0). */
  var packetLossRatio: js.UndefOr[Double] = js.undefined
}
object TrafficRule {
  
  inline def apply(): TrafficRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrafficRule] (val x: Self) extends AnyVal {
    
    inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
    
    inline def setBurstUndefined: Self = StObject.set(x, "burst", js.undefined)
    
    inline def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setPacketDuplicationRatio(value: Double): Self = StObject.set(x, "packetDuplicationRatio", value.asInstanceOf[js.Any])
    
    inline def setPacketDuplicationRatioUndefined: Self = StObject.set(x, "packetDuplicationRatio", js.undefined)
    
    inline def setPacketLossRatio(value: Double): Self = StObject.set(x, "packetLossRatio", value.asInstanceOf[js.Any])
    
    inline def setPacketLossRatioUndefined: Self = StObject.set(x, "packetLossRatio", js.undefined)
  }
}
