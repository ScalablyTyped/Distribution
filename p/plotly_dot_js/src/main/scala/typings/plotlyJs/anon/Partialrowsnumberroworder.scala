package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.`bottom plot`
import typings.plotlyJs.plotlyJsStrings.`bottom to top`
import typings.plotlyJs.plotlyJsStrings.`left plot`
import typings.plotlyJs.plotlyJsStrings.`right plot`
import typings.plotlyJs.plotlyJsStrings.`top plot`
import typings.plotlyJs.plotlyJsStrings.`top to bottom`
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.coupled
import typings.plotlyJs.plotlyJsStrings.independent
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  rows :number,   roworder :'top to bottom' | 'bottom to top',   columns :number,   subplots :std.Array<string>,   xaxes :std.Array<string>,   yaxes :std.Array<string>,   pattern :'independent' | 'coupled',   xgap :number,   ygap :number,   domain :std.Partial<{  x :std.Array<number>,   y :std.Array<number>}>,   xside :'bottom' | 'bottom plot' | 'top plot' | 'top',   yside :'left' | 'left plot' | 'right plot' | 'right'}> */
@js.native
trait Partialrowsnumberroworder extends js.Object {
  
  var columns: js.UndefOr[Double] = js.native
  
  var domain: js.UndefOr[PartialxArraynumberyArray] = js.native
  
  var pattern: js.UndefOr[independent | coupled] = js.native
  
  var roworder: js.UndefOr[(`top to bottom`) | (`bottom to top`)] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var subplots: js.UndefOr[js.Array[String]] = js.native
  
  var xaxes: js.UndefOr[js.Array[String]] = js.native
  
  var xgap: js.UndefOr[Double] = js.native
  
  var xside: js.UndefOr[bottom | (`bottom plot`) | (`top plot`) | top] = js.native
  
  var yaxes: js.UndefOr[js.Array[String]] = js.native
  
  var ygap: js.UndefOr[Double] = js.native
  
  var yside: js.UndefOr[left | (`left plot`) | (`right plot`) | right] = js.native
}
object Partialrowsnumberroworder {
  
  @scala.inline
  def apply(): Partialrowsnumberroworder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialrowsnumberroworder]
  }
  
  @scala.inline
  implicit class PartialrowsnumberroworderOps[Self <: Partialrowsnumberroworder] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: PartialxArraynumberyArray): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setPattern(value: independent | coupled): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setRoworder(value: (`top to bottom`) | (`bottom to top`)): Self = this.set("roworder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoworder: Self = this.set("roworder", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSubplotsVarargs(value: String*): Self = this.set("subplots", js.Array(value :_*))
    
    @scala.inline
    def setSubplots(value: js.Array[String]): Self = this.set("subplots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubplots: Self = this.set("subplots", js.undefined)
    
    @scala.inline
    def setXaxesVarargs(value: String*): Self = this.set("xaxes", js.Array(value :_*))
    
    @scala.inline
    def setXaxes(value: js.Array[String]): Self = this.set("xaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXaxes: Self = this.set("xaxes", js.undefined)
    
    @scala.inline
    def setXgap(value: Double): Self = this.set("xgap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXgap: Self = this.set("xgap", js.undefined)
    
    @scala.inline
    def setXside(value: bottom | (`bottom plot`) | (`top plot`) | top): Self = this.set("xside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXside: Self = this.set("xside", js.undefined)
    
    @scala.inline
    def setYaxesVarargs(value: String*): Self = this.set("yaxes", js.Array(value :_*))
    
    @scala.inline
    def setYaxes(value: js.Array[String]): Self = this.set("yaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaxes: Self = this.set("yaxes", js.undefined)
    
    @scala.inline
    def setYgap(value: Double): Self = this.set("ygap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYgap: Self = this.set("ygap", js.undefined)
    
    @scala.inline
    def setYside(value: left | (`left plot`) | (`right plot`) | right): Self = this.set("yside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYside: Self = this.set("yside", js.undefined)
  }
}
