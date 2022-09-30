package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopologyDescriptionOptions extends StObject {
  
  var heartbeatFrequencyMS: js.UndefOr[scala.Double] = js.undefined
  
  var localThresholdMS: js.UndefOr[scala.Double] = js.undefined
}
object TopologyDescriptionOptions {
  
  inline def apply(): TopologyDescriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopologyDescriptionOptions]
  }
  
  extension [Self <: TopologyDescriptionOptions](x: Self) {
    
    inline def setHeartbeatFrequencyMS(value: scala.Double): Self = StObject.set(x, "heartbeatFrequencyMS", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatFrequencyMSUndefined: Self = StObject.set(x, "heartbeatFrequencyMS", js.undefined)
    
    inline def setLocalThresholdMS(value: scala.Double): Self = StObject.set(x, "localThresholdMS", value.asInstanceOf[js.Any])
    
    inline def setLocalThresholdMSUndefined: Self = StObject.set(x, "localThresholdMS", js.undefined)
  }
}
