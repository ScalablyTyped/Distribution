package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapValue extends StObject {
  
  /** Floating point value. */
  var fpVal: js.UndefOr[Double] = js.undefined
}
object MapValue {
  
  inline def apply(): MapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapValue]
  }
  
  extension [Self <: MapValue](x: Self) {
    
    inline def setFpVal(value: Double): Self = StObject.set(x, "fpVal", value.asInstanceOf[js.Any])
    
    inline def setFpValUndefined: Self = StObject.set(x, "fpVal", js.undefined)
  }
}
