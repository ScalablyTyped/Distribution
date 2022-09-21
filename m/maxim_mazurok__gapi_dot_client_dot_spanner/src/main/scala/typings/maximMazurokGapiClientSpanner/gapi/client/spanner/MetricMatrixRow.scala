package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricMatrixRow extends StObject {
  
  /** The columns of the row. */
  var cols: js.UndefOr[js.Array[Double]] = js.undefined
}
object MetricMatrixRow {
  
  inline def apply(): MetricMatrixRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricMatrixRow]
  }
  
  extension [Self <: MetricMatrixRow](x: Self) {
    
    inline def setCols(value: js.Array[Double]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setColsVarargs(value: Double*): Self = StObject.set(x, "cols", js.Array(value*))
  }
}
