package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  rows :number,   columns :number,   x :std.Array<number>,   y :std.Array<number>}> */
@js.native
trait Partialrowsnumbercolumnsn extends StObject {
  
  var columns: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[js.Array[Double]] = js.native
  
  var y: js.UndefOr[js.Array[Double]] = js.native
}
object Partialrowsnumbercolumnsn {
  
  @scala.inline
  def apply(): Partialrowsnumbercolumnsn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialrowsnumbercolumnsn]
  }
  
  @scala.inline
  implicit class PartialrowsnumbercolumnsnMutableBuilder[Self <: Partialrowsnumbercolumnsn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    @scala.inline
    def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
