package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends StObject {
  
  /** Floating point value. When this is set, other values must not be set. */
  var fpVal: js.UndefOr[Double] = js.native
  
  /** Integer value. When this is set, other values must not be set. */
  var intVal: js.UndefOr[Double] = js.native
  
  /**
    * Map value. The valid key space and units for the corresponding value of each entry should be documented as part of the data type definition. Keys should be kept small whenever
    * possible. Data streams with large keys and high data frequency may be down sampled.
    */
  var mapVal: js.UndefOr[js.Array[ValueMapValEntry]] = js.native
  
  /**
    * String value. When this is set, other values must not be set. Strings should be kept small whenever possible. Data streams with large string values and high data frequency may be
    * down sampled.
    */
  var stringVal: js.UndefOr[String] = js.native
}
object Value {
  
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpVal(value: Double): Self = StObject.set(x, "fpVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpValUndefined: Self = StObject.set(x, "fpVal", js.undefined)
    
    @scala.inline
    def setIntVal(value: Double): Self = StObject.set(x, "intVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValUndefined: Self = StObject.set(x, "intVal", js.undefined)
    
    @scala.inline
    def setMapVal(value: js.Array[ValueMapValEntry]): Self = StObject.set(x, "mapVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapValUndefined: Self = StObject.set(x, "mapVal", js.undefined)
    
    @scala.inline
    def setMapValVarargs(value: ValueMapValEntry*): Self = StObject.set(x, "mapVal", js.Array(value :_*))
    
    @scala.inline
    def setStringVal(value: String): Self = StObject.set(x, "stringVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValUndefined: Self = StObject.set(x, "stringVal", js.undefined)
  }
}
