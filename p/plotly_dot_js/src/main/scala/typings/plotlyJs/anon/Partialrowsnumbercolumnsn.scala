package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  rows :number,   columns :number,   x :std.Array<number>,   y :std.Array<number>}> */
trait Partialrowsnumbercolumnsn extends StObject {
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[js.Array[Double]] = js.undefined
  
  var y: js.UndefOr[js.Array[Double]] = js.undefined
}
object Partialrowsnumbercolumnsn {
  
  inline def apply(): Partialrowsnumbercolumnsn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialrowsnumbercolumnsn]
  }
  
  extension [Self <: Partialrowsnumbercolumnsn](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
