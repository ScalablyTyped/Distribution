package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleRange extends StObject {
  
  /** end of the range (exclusive) */
  var end: js.UndefOr[Double] = js.undefined
  
  /** start of the range (inclusive) */
  var start: js.UndefOr[Double] = js.undefined
}
object DoubleRange {
  
  inline def apply(): DoubleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleRange]
  }
  
  extension [Self <: DoubleRange](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
