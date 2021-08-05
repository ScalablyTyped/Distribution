package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Domain> */
trait PartialDomain extends StObject {
  
  var column: js.UndefOr[Double] = js.undefined
  
  var row: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[js.Array[Double]] = js.undefined
  
  var y: js.UndefOr[js.Array[Double]] = js.undefined
}
object PartialDomain {
  
  inline def apply(): PartialDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDomain]
  }
  
  extension [Self <: PartialDomain](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
