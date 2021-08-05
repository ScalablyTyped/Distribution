package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerfSample extends StObject {
  
  /** Timestamp of collection. */
  var sampleTime: js.UndefOr[Timestamp] = js.undefined
  
  /** Value observed */
  var value: js.UndefOr[Double] = js.undefined
}
object PerfSample {
  
  inline def apply(): PerfSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfSample]
  }
  
  extension [Self <: PerfSample](x: Self) {
    
    inline def setSampleTime(value: Timestamp): Self = StObject.set(x, "sampleTime", value.asInstanceOf[js.Any])
    
    inline def setSampleTimeUndefined: Self = StObject.set(x, "sampleTime", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
