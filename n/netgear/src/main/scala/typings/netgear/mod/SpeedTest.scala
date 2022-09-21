package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeedTest extends StObject {
  
  var averagePing: Double
  
  var downlinkBandwidth: Double
  
  var uplinkBandwidth: Double
}
object SpeedTest {
  
  inline def apply(averagePing: Double, downlinkBandwidth: Double, uplinkBandwidth: Double): SpeedTest = {
    val __obj = js.Dynamic.literal(averagePing = averagePing.asInstanceOf[js.Any], downlinkBandwidth = downlinkBandwidth.asInstanceOf[js.Any], uplinkBandwidth = uplinkBandwidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedTest]
  }
  
  extension [Self <: SpeedTest](x: Self) {
    
    inline def setAveragePing(value: Double): Self = StObject.set(x, "averagePing", value.asInstanceOf[js.Any])
    
    inline def setDownlinkBandwidth(value: Double): Self = StObject.set(x, "downlinkBandwidth", value.asInstanceOf[js.Any])
    
    inline def setUplinkBandwidth(value: Double): Self = StObject.set(x, "uplinkBandwidth", value.asInstanceOf[js.Any])
  }
}
