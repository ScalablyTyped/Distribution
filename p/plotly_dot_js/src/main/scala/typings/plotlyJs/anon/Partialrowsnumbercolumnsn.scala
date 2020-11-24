package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  rows :number,   columns :number,   x :std.Array<number>,   y :std.Array<number>}> */
@js.native
trait Partialrowsnumbercolumnsn extends js.Object {
  
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
  implicit class PartialrowsnumbercolumnsnOps[Self <: Partialrowsnumbercolumnsn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setXVarargs(value: Double*): Self = this.set("x", js.Array(value :_*))
    
    @scala.inline
    def setX(value: js.Array[Double]): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setYVarargs(value: Double*): Self = this.set("y", js.Array(value :_*))
    
    @scala.inline
    def setY(value: js.Array[Double]): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
