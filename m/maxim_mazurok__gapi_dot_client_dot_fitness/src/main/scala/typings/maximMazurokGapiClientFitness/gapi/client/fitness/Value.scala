package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /** Floating point value. When this is set, other values must not be set. */
  var fpVal: js.UndefOr[Double] = js.undefined
  
  /** Integer value. When this is set, other values must not be set. */
  var intVal: js.UndefOr[Double] = js.undefined
  
  /**
    * Map value. The valid key space and units for the corresponding value of each entry should be documented as part of the data type definition. Keys should be kept small whenever
    * possible. Data streams with large keys and high data frequency may be down sampled.
    */
  var mapVal: js.UndefOr[js.Array[ValueMapValEntry]] = js.undefined
  
  /**
    * String value. When this is set, other values must not be set. Strings should be kept small whenever possible. Data streams with large string values and high data frequency may be
    * down sampled.
    */
  var stringVal: js.UndefOr[String] = js.undefined
}
object Value {
  
  inline def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setFpVal(value: Double): Self = StObject.set(x, "fpVal", value.asInstanceOf[js.Any])
    
    inline def setFpValUndefined: Self = StObject.set(x, "fpVal", js.undefined)
    
    inline def setIntVal(value: Double): Self = StObject.set(x, "intVal", value.asInstanceOf[js.Any])
    
    inline def setIntValUndefined: Self = StObject.set(x, "intVal", js.undefined)
    
    inline def setMapVal(value: js.Array[ValueMapValEntry]): Self = StObject.set(x, "mapVal", value.asInstanceOf[js.Any])
    
    inline def setMapValUndefined: Self = StObject.set(x, "mapVal", js.undefined)
    
    inline def setMapValVarargs(value: ValueMapValEntry*): Self = StObject.set(x, "mapVal", js.Array(value*))
    
    inline def setStringVal(value: String): Self = StObject.set(x, "stringVal", value.asInstanceOf[js.Any])
    
    inline def setStringValUndefined: Self = StObject.set(x, "stringVal", js.undefined)
  }
}
