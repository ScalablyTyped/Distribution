package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRenderedRange extends js.Object {
  
  var bottomRow: Double = js.native
  
  var topRow: Double = js.native
}
object IRenderedRange {
  
  @scala.inline
  def apply(bottomRow: Double, topRow: Double): IRenderedRange = {
    val __obj = js.Dynamic.literal(bottomRow = bottomRow.asInstanceOf[js.Any], topRow = topRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderedRange]
  }
  
  @scala.inline
  implicit class IRenderedRangeOps[Self <: IRenderedRange] (val x: Self) extends AnyVal {
    
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
    def setBottomRow(value: Double): Self = this.set("bottomRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopRow(value: Double): Self = this.set("topRow", value.asInstanceOf[js.Any])
  }
}
