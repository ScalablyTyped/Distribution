package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElementDimension extends js.Object {
  
  var rootMaxH: js.UndefOr[Double] = js.native
  
  var rootMaxW: js.UndefOr[Double] = js.native
  
  var rowIndexCellW: js.UndefOr[Double] = js.native
  
  var rowSelectedCellW: js.UndefOr[Double] = js.native
  
  var scrollH: js.UndefOr[Double] = js.native
  
  var scrollW: js.UndefOr[Double] = js.native
}
object IElementDimension {
  
  @scala.inline
  def apply(): IElementDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementDimension]
  }
  
  @scala.inline
  implicit class IElementDimensionOps[Self <: IElementDimension] (val x: Self) extends AnyVal {
    
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
    def setRootMaxH(value: Double): Self = this.set("rootMaxH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootMaxH: Self = this.set("rootMaxH", js.undefined)
    
    @scala.inline
    def setRootMaxW(value: Double): Self = this.set("rootMaxW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootMaxW: Self = this.set("rootMaxW", js.undefined)
    
    @scala.inline
    def setRowIndexCellW(value: Double): Self = this.set("rowIndexCellW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndexCellW: Self = this.set("rowIndexCellW", js.undefined)
    
    @scala.inline
    def setRowSelectedCellW(value: Double): Self = this.set("rowSelectedCellW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSelectedCellW: Self = this.set("rowSelectedCellW", js.undefined)
    
    @scala.inline
    def setScrollH(value: Double): Self = this.set("scrollH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollH: Self = this.set("scrollH", js.undefined)
    
    @scala.inline
    def setScrollW(value: Double): Self = this.set("scrollW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollW: Self = this.set("scrollW", js.undefined)
  }
}
