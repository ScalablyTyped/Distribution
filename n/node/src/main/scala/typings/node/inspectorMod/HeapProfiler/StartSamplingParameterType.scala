package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSamplingParameterType extends StObject {
  
  /**
    * Average sample interval in bytes. Poisson distribution is used for the intervals. The default value is 32768 bytes.
    */
  var samplingInterval: js.UndefOr[Double] = js.undefined
}
object StartSamplingParameterType {
  
  inline def apply(): StartSamplingParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSamplingParameterType]
  }
  
  extension [Self <: StartSamplingParameterType](x: Self) {
    
    inline def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
    
    inline def setSamplingIntervalUndefined: Self = StObject.set(x, "samplingInterval", js.undefined)
  }
}
