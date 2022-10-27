package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Staff extends StObject {
  
  /**
    * an array of Objects representing the measures in each staff.
    */
  var measures: js.Array[Measure]
}
object Staff {
  
  inline def apply(measures: js.Array[Measure]): Staff = {
    val __obj = js.Dynamic.literal(measures = measures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Staff]
  }
  
  extension [Self <: Staff](x: Self) {
    
    inline def setMeasures(value: js.Array[Measure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresVarargs(value: Measure*): Self = StObject.set(x, "measures", js.Array(value*))
  }
}
